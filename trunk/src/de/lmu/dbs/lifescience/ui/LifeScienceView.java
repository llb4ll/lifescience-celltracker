
/*
 * LifeScienceGUI.java
 * GUI of LifeScience CellTracker
 * 
 * Created on 18.11.2011, 23:19:40
 */
package de.lmu.dbs.lifescience.ui;

import de.lmu.dbs.lifescience.model.LifeScienceModel;
import ij.ImageJ;
import ij.plugin.ScaleBar;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.util.Observable;
import java.util.Observer;


/**
 * This Class opens a new graphical user interface and provides access to all features of this LifeScience application.
 * 
 * @author bea
 */
public class LifeScienceView extends javax.swing.JFrame implements Observer {

    /** 
     * Creates new form LifeScienceGUI 
     */
    public LifeScienceView() {
        initComponents();
        // Resize JFrame to fit full screen height
        this.setPreferredSize(new Dimension(this.getSize().width, (int) GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().getHeight()));
        this.pack();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonImport = new javax.swing.JButton();
        jButtonDetection = new javax.swing.JButton();
        jButtonExportCSV = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonTracking = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonEnhancement = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonExportAVI = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanelSequence = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabelSequenceFrame = new javax.swing.JLabel();
        jButtonSequencePrev = new javax.swing.JButton();
        jButtonSequenceNext = new javax.swing.JButton();
        jLabelSequenceInfo = new javax.swing.JLabel();
        jToggleButtonSequenceWindow = new javax.swing.JToggleButton();
        jToggleButtonSequenceWindow.setSelected(true);
        jToggleButtonSequenceImageJ = new javax.swing.JToggleButton();
        jPanelDetection = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jToggleButtonDetectionLabels = new javax.swing.JToggleButton();
        jToggleButtonDetectionLabels.setSelected(true);
        jLabelDetectionInfo = new javax.swing.JLabel();
        jButtonDetectionTable = new javax.swing.JButton();
        jToggleButtonDetectionEdit = new javax.swing.JToggleButton();
        jToggleButtonDetectionLabels.setSelected(true);
        jPanelExport = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabelExportInfo = new javax.swing.JLabel();
        lifeScienceProgressBar = new de.lmu.dbs.lifescience.ui.LifeScienceProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LifeScience");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-logo.png")).getImage());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "Steps", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12), java.awt.Color.lightGray)); // NOI18N
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setFont(new java.awt.Font("Verdana", 0, 11));
        jPanel1.setPreferredSize(new java.awt.Dimension(160, (int) GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().getHeight()));

        jButtonImport.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButtonImport.setForeground(new java.awt.Color(33, 90, 167));
        jButtonImport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-import.png"))); // NOI18N
        jButtonImport.setToolTipText("Opens a file chooser to select TIF Sequence");
        jButtonImport.setLabel("Import TIF");

        jButtonDetection.setForeground(new java.awt.Color(33, 90, 167));
        jButtonDetection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-detect.png"))); // NOI18N
        jButtonDetection.setToolTipText("Detect nuclei in image...");
        jButtonDetection.setEnabled(false);
        jButtonDetection.setLabel("Detect Cells");
        jButtonDetection.setMaximumSize(new java.awt.Dimension(83, 23));
        jButtonDetection.setMinimumSize(new java.awt.Dimension(83, 23));

        jButtonExportCSV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonExportCSV.setForeground(new java.awt.Color(33, 90, 167));
        jButtonExportCSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-export.png"))); // NOI18N
        jButtonExportCSV.setToolTipText("Export detected cells as csv...");
        jButtonExportCSV.setEnabled(false);
        jButtonExportCSV.setLabel("Export CSV");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-spacer.png"))); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-spacer.png"))); // NOI18N

        jButtonTracking.setForeground(new java.awt.Color(33, 90, 167));
        jButtonTracking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-track.png"))); // NOI18N
        jButtonTracking.setText("Track Cells");
        jButtonTracking.setToolTipText("Track nuclei throughout sequence...");
        jButtonTracking.setEnabled(false);
        jButtonTracking.setMaximumSize(new java.awt.Dimension(83, 23));
        jButtonTracking.setMinimumSize(new java.awt.Dimension(83, 23));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-spacer.png"))); // NOI18N

        jButtonEnhancement.setForeground(new java.awt.Color(33, 90, 167));
        jButtonEnhancement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-enhance.png"))); // NOI18N
        jButtonEnhancement.setText("Enhance Images");
        jButtonEnhancement.setToolTipText("Enhance Quality of Image Sequence");
        jButtonEnhancement.setEnabled(false);
        jButtonEnhancement.setMaximumSize(new java.awt.Dimension(83, 23));
        jButtonEnhancement.setMinimumSize(new java.awt.Dimension(83, 23));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-spacer.png"))); // NOI18N

        jButtonExportAVI.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonExportAVI.setForeground(new java.awt.Color(33, 90, 167));
        jButtonExportAVI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-avi.png"))); // NOI18N
        jButtonExportAVI.setText("Export AVI");
        jButtonExportAVI.setToolTipText("Create AVI film for each detected cell...");
        jButtonExportAVI.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonImport, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jButtonEnhancement, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jButtonDetection, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jButtonTracking, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jButtonExportCSV, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jButtonExportAVI, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButtonImport, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(jButtonEnhancement, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDetection, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonTracking, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addComponent(jButtonExportCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonExportAVI, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12), java.awt.Color.lightGray)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(200, (int) GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().getHeight()));

        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Sequence");
        jLabel10.setToolTipText("");

        jLabelSequenceFrame.setFont(new java.awt.Font("Arial", 0, 12));
        jLabelSequenceFrame.setForeground(new java.awt.Color(89, 97, 107));
        jLabelSequenceFrame.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelSequenceFrame.setToolTipText("");

        jButtonSequencePrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-prev.png"))); // NOI18N
        jButtonSequencePrev.setToolTipText("Go to previous frame of the sequence.");
        jButtonSequencePrev.setActionCommand("Previous Frame");
        jButtonSequencePrev.setEnabled(false);

        jButtonSequenceNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-next.png"))); // NOI18N
        jButtonSequenceNext.setToolTipText("Go to next frame of the sequence.");
        jButtonSequenceNext.setActionCommand("Next Frame");
        jButtonSequenceNext.setEnabled(false);

        jLabelSequenceInfo.setFont(new java.awt.Font("Arial", 0, 12));
        jLabelSequenceInfo.setForeground(new java.awt.Color(89, 97, 107));
        jLabelSequenceInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelSequenceInfo.setToolTipText("");
        jLabelSequenceInfo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jToggleButtonSequenceWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-window.png"))); // NOI18N
        jToggleButtonSequenceWindow.setToolTipText("Show image window");
        jToggleButtonSequenceWindow.setActionCommand("Show Image");

        jToggleButtonSequenceImageJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-imagej.png"))); // NOI18N
        jToggleButtonSequenceImageJ.setToolTipText("Open ImageJ");
        jToggleButtonSequenceImageJ.setActionCommand("Open ImageJ");

        javax.swing.GroupLayout jPanelSequenceLayout = new javax.swing.GroupLayout(jPanelSequence);
        jPanelSequence.setLayout(jPanelSequenceLayout);
        jPanelSequenceLayout.setHorizontalGroup(
            jPanelSequenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSequenceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSequenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSequenceInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSequenceLayout.createSequentialGroup()
                        .addGroup(jPanelSequenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSequenceLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                .addGap(24, 24, 24)
                                .addComponent(jToggleButtonSequenceWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelSequenceLayout.createSequentialGroup()
                                .addComponent(jLabelSequenceFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSequencePrev, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSequenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonSequenceNext, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButtonSequenceImageJ, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanelSequenceLayout.setVerticalGroup(
            jPanelSequenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSequenceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSequenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelSequenceLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabelSequenceFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSequenceLayout.createSequentialGroup()
                        .addGroup(jPanelSequenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButtonSequenceWindow)
                            .addComponent(jToggleButtonSequenceImageJ))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSequenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSequencePrev)
                            .addComponent(jButtonSequenceNext))))
                .addGap(11, 11, 11)
                .addComponent(jLabelSequenceInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Detection");
        jLabel11.setToolTipText("");

        jToggleButtonDetectionLabels.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-label.png"))); // NOI18N
        jToggleButtonDetectionLabels.setToolTipText("Show labels of nuclei.");
        jToggleButtonDetectionLabels.setActionCommand("Show Labels");

        jLabelDetectionInfo.setFont(new java.awt.Font("Arial", 0, 12));
        jLabelDetectionInfo.setForeground(new java.awt.Color(89, 97, 107));
        jLabelDetectionInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelDetectionInfo.setToolTipText("");
        jLabelDetectionInfo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButtonDetectionTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-export.png"))); // NOI18N
        jButtonDetectionTable.setToolTipText("Show all detected nuclei in a table");
        jButtonDetectionTable.setActionCommand("Show Table");

        jToggleButtonDetectionEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-edit.png"))); // NOI18N
        jToggleButtonDetectionEdit.setToolTipText("Edit detected nuclei.");
        jToggleButtonDetectionEdit.setActionCommand("Edit Nuclei");

        javax.swing.GroupLayout jPanelDetectionLayout = new javax.swing.GroupLayout(jPanelDetection);
        jPanelDetection.setLayout(jPanelDetectionLayout);
        jPanelDetectionLayout.setHorizontalGroup(
            jPanelDetectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDetectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDetectionLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(jButtonDetectionTable, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDetectionLayout.createSequentialGroup()
                        .addComponent(jLabelDetectionInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButtonDetectionLabels, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButtonDetectionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelDetectionLayout.setVerticalGroup(
            jPanelDetectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDetectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDetectionTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButtonDetectionLabels)
                    .addComponent(jToggleButtonDetectionEdit)
                    .addGroup(jPanelDetectionLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabelDetectionInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Export");
        jLabel12.setToolTipText("");

        jLabelExportInfo.setForeground(new java.awt.Color(89, 97, 107));
        jLabelExportInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelExportInfo.setToolTipText("");
        jLabelExportInfo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanelExportLayout = new javax.swing.GroupLayout(jPanelExport);
        jPanelExport.setLayout(jPanelExportLayout);
        jPanelExportLayout.setHorizontalGroup(
            jPanelExportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExportLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelExportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExportLayout.createSequentialGroup()
                        .addComponent(jLabelExportInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelExportLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                        .addGap(92, 92, 92))))
        );
        jPanelExportLayout.setVerticalGroup(
            jPanelExportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelExportInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSequence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelDetection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelExport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSequence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelDetection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelExport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lifeScienceProgressBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lifeScienceProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LifeScienceView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDetection;
    private javax.swing.JButton jButtonDetectionTable;
    private javax.swing.JButton jButtonEnhancement;
    private javax.swing.JButton jButtonExportAVI;
    private javax.swing.JButton jButtonExportCSV;
    private javax.swing.JButton jButtonImport;
    private javax.swing.JButton jButtonSequenceNext;
    private javax.swing.JButton jButtonSequencePrev;
    private javax.swing.JButton jButtonTracking;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDetectionInfo;
    private javax.swing.JLabel jLabelExportInfo;
    private javax.swing.JLabel jLabelSequenceFrame;
    private javax.swing.JLabel jLabelSequenceInfo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelDetection;
    private javax.swing.JPanel jPanelExport;
    private javax.swing.JPanel jPanelSequence;
    private javax.swing.JToggleButton jToggleButtonDetectionEdit;
    private javax.swing.JToggleButton jToggleButtonDetectionLabels;
    private javax.swing.JToggleButton jToggleButtonSequenceImageJ;
    private javax.swing.JToggleButton jToggleButtonSequenceWindow;
    private de.lmu.dbs.lifescience.ui.LifeScienceProgressBar lifeScienceProgressBar;
    // End of variables declaration//GEN-END:variables

    private ImageJ imagejWindow;
    
    /**
     * Initialise Controller and add Actionlisteners to Buttons
     * @param controller 
     */
    public void initController(ActionListener controller){        
        this.jButtonImport.addActionListener(controller);
        this.jButtonDetection.addActionListener(controller);
        this.jButtonExportCSV.addActionListener(controller);
        this.jButtonExportAVI.addActionListener(controller);
        this.jToggleButtonSequenceWindow.addActionListener(controller);
        this.jButtonSequenceNext.addActionListener(controller);
        this.jButtonSequencePrev.addActionListener(controller);
        this.jButtonDetectionTable.addActionListener(controller);
        this.jButtonEnhancement.addActionListener(controller);
        this.jButtonTracking.addActionListener(controller);
        this.jToggleButtonDetectionLabels.addActionListener(controller);
        this.jToggleButtonDetectionEdit.addActionListener(controller);
        this.jToggleButtonSequenceWindow.addActionListener(controller);
        this.jToggleButtonSequenceImageJ.addActionListener(controller);
        this.addWindowListener((WindowListener) controller);  
        // Hide Panels
        this.jPanelSequence.setVisible(false);
        this.jPanelDetection.setVisible(false);
        this.jPanelExport.setVisible(false);
        // init progress bar
        this.lifeScienceProgressBar.show(0);
        // configure imagej windows
        this.imagejWindow = new ij.ImageJ(ImageJ.NO_SHOW);
        this.imagejWindow.setLocation(0, this.getHeight()-150);
        this.imagejWindow.setPreferredSize(new Dimension(this.getWidth(), 110));
        this.imagejWindow.pack();
        this.imagejWindow.removeWindowListener(this.imagejWindow.getWindowListeners()[0]);
        this.imagejWindow.addWindowListener((WindowListener) controller);
       
    }

    
    /**
     * Show the imagej window 
     * @param show true if imagej window should be displayed
     */
    public void showImageJ(boolean show){
        this.imagejWindow.setVisible(show);
        this.imagejWindow.repaint();
    }
    
    
    /**
     * Return ImageJ instance 
     * @return instance of imagej
     */
    public ImageJ getImageJ (){
        return this.imagejWindow;
    }
   

    
    /**
     * Update all View components: Buttons, Info texts, etc.
     * @param o
     * @param arg 
     */
    @Override
    public void update(Observable o, Object arg) {
        
        // get model
        LifeScienceModel model = (LifeScienceModel) o;
        
        // set view like model status
        if(model.getStatus() == LifeScienceModel.Status.IMAGEREADY){
            // locate imgage window on right screen side and resize accordingly
            int windowwidth =(int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
            model.getImage().getWindow().setLocation(this.getWidth(), 0);
            model.getImage().getWindow().setBounds(this.getWidth(), 0, windowwidth-this.getWidth(), this.getHeight());
            model.getImage().getWindow().getCanvas().fitToWindow();
            // change logo and background of imagewindow
            model.getImage().getWindow().setIconImage(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-logo.png")).getImage());
            model.getImage().getWindow().setBackground(new Color(240, 240, 240));
            // activate panel
            this.jPanelSequence.setVisible(true);
            // update info
            this.jLabelSequenceInfo.setText(model.getImageInfoString());
            // update buttons
            this.jButtonImport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-check.png")));
            this.jButtonDetection.setEnabled(true);
            this.jButtonEnhancement.setEnabled(true);
            // reset buttons
            this.jButtonExportCSV.setEnabled(false);
            this.jButtonExportAVI.setEnabled(false);
            this.jButtonTracking.setEnabled(false);
            this.jPanelDetection.setVisible(false);
            this.jPanelExport.setVisible(false);
        }else if(model.getStatus() == LifeScienceModel.Status.IMAGEENHANCED){
            this.jButtonEnhancement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-check.png")));
        }else if(model.getStatus() == LifeScienceModel.Status.CELLSDETECTED){
            // set roi color
            model.getImage().getOverlay().get(0).setStrokeColor(new Color(0, 166, 151));
            // update buttons
            this.jButtonDetection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-check.png")));
            this.jButtonExportCSV.setEnabled(true);
            this.jButtonExportAVI.setEnabled(true);
            this.jButtonTracking.setEnabled(true);
            // update info
            this.jLabelDetectionInfo.setText(model.getDetectionInfoString());
            // activate panel
            this.jPanelDetection.setVisible(true);
        }else if(model.getStatus() == LifeScienceModel.Status.CELLSTRACKED){
            this.jButtonTracking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-check.png")));
        }else if(model.getStatus() == LifeScienceModel.Status.EXPORTED){
            // update buttons
            this.jButtonExportCSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-check.png")));
            this.jButtonExportAVI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de/lmu/dbs/lifescience/resources/lifescience-icon-check.png")));
        }
        // update window buttons
        this.jToggleButtonSequenceWindow.setSelected(model.getImage().getWindow().isShowing());
        this.jToggleButtonSequenceImageJ.setSelected(this.imagejWindow.isVisible());
        // update next and prev button
        int slice = model.getImage().getSlice();
        int size = model.getImage().getStackSize();
        this.jButtonSequencePrev.setEnabled(true);
        this.jButtonSequenceNext.setEnabled(true);
        if(slice <= 1){
            this.jButtonSequencePrev.setEnabled(false);
        }
        if (slice >= size){
            this.jButtonSequenceNext.setEnabled(false);
        }
        // update frame info
        this.jLabelSequenceFrame.setText("Frame " + slice + " of " + size);
        
        // update progressbar
        this.lifeScienceProgressBar.show((1.0/LifeScienceModel.Status.values().length)*(model.getStatus().ordinal()));
        
       
        this.repaint();
    }
    
    
    
    
    
    
}
