package de.lmu.dbs.lifescience.processing;

import de.lmu.dbs.lifescience.LifeScience;
import de.lmu.dbs.lifescience.model.Cell;
import de.lmu.dbs.lifescience.model.LifeScienceModel;
import de.lmu.dbs.lifescience.model.Nucleus;
import ij.ImagePlus;
import ij.gui.OvalRoi;
import ij.gui.PointRoi;
import ij.plugin.filter.MaximumFinder;
import ij.process.ByteProcessor;
import ij.process.ImageProcessor;
import java.awt.Point;
import java.awt.geom.Point2D;


/**
 *
 * @author bea
 */
public class CellDetector extends Processor {

    //---------------- Attributes
    /** Model */
    LifeScienceModel model;
    
    
    //---------------- Constructor
    
    public CellDetector(ImagePlus image, LifeScienceModel model) {
        super(image);
        this.model = model;
    }
    
    
    
    
    //---------------- Methods
    /**
     * Run CellDetector
     */
    public void run(){
        // get processor
        ByteProcessor process = (ByteProcessor) this.image.getProcessor();
        
        //init offset
        int xoff = 0;
        int yoff = 0;
        
        
         
        // Find Maxima
        MaximumFinder maxfind = new MaximumFinder();
        maxfind.setup(null, this.image);
        maxfind.findMaxima(process, 10, ImageProcessor.NO_THRESHOLD, MaximumFinder.POINT_SELECTION, true, false);

        if (this.image.getRoi() instanceof PointRoi){
            // Build data set
            PointRoi points = (PointRoi) this.image.getRoi();
            // info: coordinates sorted by intensity 
            int[] xcoords = points.getXCoordinates();
            int[] ycoords = points.getYCoordinates();
            xoff += points.getBounds().x;
            yoff += points.getBounds().y;

            // check if initial detection or followup
            if(this.model.getNucleiCount()>0){
                for(int i=0; i < xcoords.length; i++){
                    // add Points
                    this.model.addPoint(new Point(xcoords[i]+xoff, ycoords[i]+yoff));
                }

            }else{
                for(int i=0; i < xcoords.length; i++){
                    //TODO look in previous 10 cells and group nuclei if distance is smaller than cell radius
                    // works becaus coordinates are sorted by intensity of pixels. corresponding nuclei mostly have similar intensities.
                    //TODO split nuclei through watershed algorithm
                    //create new nucleus

                    this.model.addNucleus(new Nucleus(this.image.getImageStackSize(), xcoords[i]+xoff, ycoords[i]+yoff));
                }
            }
        }
        
        
        this.image.killRoi();
                
        // update image
        this.image.updateAndDraw();
        
    }
    
    /**
     * This class does an initial grouping of nuclei. Nuclei are grouped to belong to one cell if their distance is smaller than the average nuclei diameter.
     */
    public void groupNuclei(){
        for(int i=0; i < this.model.getNucleiCount(); i++){
            Nucleus nuc = this.model.getNucleus(i);
            if(nuc.getCell()!=null){
                continue;
            }
            for(int j=-20; j < 20; j++){
                // group nuclei if distance is smaller than average nuclei diameter
                if((0 <= i+j) && (i+j < this.model.getNucleiCount()) && (j !=0) ){
                    Nucleus nucc = this.model.getNucleus(i+j);
                    if(nucc.getCell()==null && nucc.getPoint(this.model.getImage().getCurrentSlice()-1).distance(nuc.getPoint(this.model.getImage().getCurrentSlice()-1)) < (this.model.getNucleiDiameter())){
                        Cell cell = new Cell(nuc);
                        cell.addNucleus(nucc);
                        this.model.addCell(cell);
                        break;
                    }
                }
            }
        }
    }
}
