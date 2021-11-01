/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Patient;
import model.SystemM;

/**
 *
 * @author nidhitiwari
 */
public class ViewJPanel extends javax.swing.JPanel {

    SystemM system;
    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel(SystemM system) {
        initComponents();
        this.system = system;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewPatientDetails = new javax.swing.JTable();
        btnAbnormalBP = new javax.swing.JButton();
        scrollAbnormal = new javax.swing.JScrollPane();
        tblAbnormal = new javax.swing.JTable();
        btnAbnormalRespRate = new javax.swing.JButton();
        btnAbnormalHeartRate = new javax.swing.JButton();
        btnAbnormalWeight = new javax.swing.JButton();
        lblView = new javax.swing.JLabel();
        btnDeletePatient = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        lblVitalChart = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jButton2.setText("Abnormal Vital Heart Rate");

        tblViewPatientDetails.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tblViewPatientDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "DOB", "House Number", "Community", "City", "Age Group", "BP", "Heart Rate", "Respiratory", "Weight"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewPatientDetails);

        btnAbnormalBP.setBackground(new java.awt.Color(0, 153, 255));
        btnAbnormalBP.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        btnAbnormalBP.setText("Abnormal Blood Pressure");
        btnAbnormalBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbnormalBPActionPerformed(evt);
            }
        });

        tblAbnormal.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        tblAbnormal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Community", "Count", "Vital Sign"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAbnormal.setRowHeight(25);
        tblAbnormal.setRowHeight(25);
        scrollAbnormal.setViewportView(tblAbnormal);

        btnAbnormalRespRate.setBackground(new java.awt.Color(0, 153, 255));
        btnAbnormalRespRate.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        btnAbnormalRespRate.setText("Abnormal Repiratory Rate");
        btnAbnormalRespRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbnormalRespRateActionPerformed(evt);
            }
        });

        btnAbnormalHeartRate.setBackground(new java.awt.Color(0, 153, 255));
        btnAbnormalHeartRate.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        btnAbnormalHeartRate.setText("Abnormal Heart Rate");
        btnAbnormalHeartRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbnormalHeartRateActionPerformed(evt);
            }
        });

        btnAbnormalWeight.setBackground(new java.awt.Color(0, 153, 255));
        btnAbnormalWeight.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        btnAbnormalWeight.setText("Abnormal Weight");
        btnAbnormalWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbnormalWeightActionPerformed(evt);
            }
        });

        lblView.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblView.setText("View Abnormal Vital Sign Per Community for Different Age Group");

        btnDeletePatient.setBackground(new java.awt.Color(255, 51, 51));
        btnDeletePatient.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletePatient.setText("Delete Patient");
        btnDeletePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePatientActionPerformed(evt);
            }
        });

        jLayeredPane1.setBackground(new java.awt.Color(102, 102, 102));
        jLayeredPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        jLabel2.setText("Heart");

        jTable2.setBackground(new java.awt.Color(204, 204, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Newborn", "45 - 90"},
                {"Infant", "80 - 100"},
                {"Toddler", "80 - 120"},
                {"Preschool", "80 - 120"},
                {"School Age", "80 - 120"},
                {"Adolescent", "90 -120"},
                {"Adult", "95 - 135"},
                {"Elderly", "95 - 145"}
            },
            new String [] {
                "Age Group", "Range"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jLabel1.setText("Blood Pressure");

        jLabel4.setText("Weight");

        jTable3.setBackground(new java.awt.Color(204, 204, 204));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Newborn", "100 - 160"},
                {"Infant", "90 - 150"},
                {"Toddler", "80 - 140"},
                {"Preschool", "70 - 130"},
                {"School Age", "60 - 105"},
                {"Adolescent", "60 -100"},
                {"Adult", "60 - 100"},
                {"Elderly", "60 - 100"}
            },
            new String [] {
                "Age Group", "Range"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        lblVitalChart.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblVitalChart.setText("Vital Chart");

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Newborn", "2 - 5"},
                {"Infant", "5 - 10"},
                {"Toddler", "10 - 20"},
                {"Preschool", "20 - 35"},
                {"School Age", "35 - 50"},
                {"Adolescent", "50 - 80"},
                {"Adult", "50 - 80"},
                {"Elderly", "50 - 80"}
            },
            new String [] {
                "Age Group", "Range"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable4.setBackground(new java.awt.Color(204, 204, 204));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Newborn", "30 - 60"},
                {"Infant", "30 - 60"},
                {"Toddler", "24 - 40"},
                {"Preschool", "22 - 34"},
                {"School Age", "18 - 30"},
                {"Adolescent", "12 - 16"},
                {"Adult", "12 - 16"},
                {"Elderly", "12 - 16"}
            },
            new String [] {
                "Age Group", "Range"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        jLabel3.setText("Respiratory");

        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblVitalChart, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1)
                        .addGap(217, 217, 217)
                        .addComponent(jLabel2))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(230, 230, 230)
                        .addComponent(jLabel4)
                        .addGap(125, 125, 125))))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(505, 505, 505)
                .addComponent(lblVitalChart, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane2, jScrollPane3, jScrollPane4, jScrollPane5});

        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVitalChart, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(scrollAbnormal, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(362, 362, 362)
                                .addComponent(lblView))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnDeletePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAbnormalBP, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAbnormalHeartRate)
                                .addGap(18, 18, 18)
                                .addComponent(btnAbnormalRespRate)
                                .addGap(18, 18, 18)
                                .addComponent(btnAbnormalWeight)))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAbnormalBP, btnAbnormalHeartRate, btnAbnormalRespRate, btnAbnormalWeight});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblView)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbnormalBP, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbnormalHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbnormalRespRate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbnormalWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollAbnormal, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAbnormalBP, btnAbnormalHeartRate, btnAbnormalRespRate, btnAbnormalWeight});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAbnormalBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbnormalBPActionPerformed
                HashMap communityPatientMap =  system.showAbnoramlBPPatients();
                DefaultTableModel model = (DefaultTableModel) tblAbnormal.getModel();
                model.setRowCount(0);

                   communityPatientMap.forEach((key, value) -> {
                   Object [] row = new Object[3];
                   row[0] = key;
                   row[1] = value;
                   row[2] = "Blood Pressure";
                   model.addRow(row);
                    });
    }//GEN-LAST:event_btnAbnormalBPActionPerformed

    private void btnAbnormalHeartRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbnormalHeartRateActionPerformed
                HashMap communityPatientMap =  system.showAbnoramlHeartPatients();
                DefaultTableModel model = (DefaultTableModel) tblAbnormal.getModel();
                model.setRowCount(0);

                   communityPatientMap.forEach((key, value) -> {
                   Object [] row = new Object[3];
                   row[0] = key;
                   row[1] = value;
                   row[2] = "Heart Rate";
                   model.addRow(row);

                });
    }//GEN-LAST:event_btnAbnormalHeartRateActionPerformed

    private void btnAbnormalRespRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbnormalRespRateActionPerformed
        HashMap communityPatientMap =  system.showAbnoramlRespiratoryPatients();
        DefaultTableModel model = (DefaultTableModel) tblAbnormal.getModel();
        model.setRowCount(0);

           communityPatientMap.forEach((key, value) -> {
           Object [] row = new Object[3];
           row[0] = key;
           row[1] = value;
           row[2] = "Respiratory Rate";
           model.addRow(row);

        });
    }//GEN-LAST:event_btnAbnormalRespRateActionPerformed

    private void btnAbnormalWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbnormalWeightActionPerformed
        HashMap communityPatientMap =  system.showAbnoramlWeightPatients();
        DefaultTableModel model = (DefaultTableModel) tblAbnormal.getModel();
        model.setRowCount(0);

           communityPatientMap.forEach((key, value) -> {
           Object [] row = new Object[3];
           row[0] = key;
           row[1] = value;
           row[2] = "Weight";
           model.addRow(row);

        });
    }//GEN-LAST:event_btnAbnormalWeightActionPerformed

    private void btnDeletePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePatientActionPerformed
        
        int selectedRowIndex = tblViewPatientDetails.getSelectedRow();
        
        if(selectedRowIndex < 0) {  
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblViewPatientDetails.getModel();
        Patient selectedPatient = (Patient) model.getValueAt(selectedRowIndex, 0);
        
        system.removePatient(selectedPatient);
        JOptionPane.showMessageDialog(this, "Patient Record deleted"); 
        
        populateTable();
    }//GEN-LAST:event_btnDeletePatientActionPerformed

    public void populateTable() {
    DefaultTableModel model = (DefaultTableModel) tblViewPatientDetails.getModel();
    model.setRowCount(0);
     java.lang.System.out.println(system.getPatientById(0));
    system.getPatientDirectory().forEach(patient -> {
        Object [] row = new Object[12];
        row[0] = patient;
        row[1] = patient.getFirstName();
        row[2] = patient.getLastName();
        row[3] = patient.getDateOfBirth().toString();
        row[4] = patient.getResidence().getHouseNumber();
        row[5] = patient.getResidence().getCommunityName();
        row[6] = patient.getResidence().getCityName();
        row[7] = patient.getAgeGroup().toString();
        row[8] = patient.getEncounterHistory().latestEncounter.getVitalSigns().getBloodPressure();
        row[9] = patient.getEncounterHistory().latestEncounter.getVitalSigns().getHeartRate();
        row[10] = patient.getEncounterHistory().latestEncounter.getVitalSigns().getRespiratoryRate();
        row[11] = patient.getEncounterHistory().latestEncounter.getVitalSigns().getWeightInKilos();

        model.addRow(row);
    });        

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbnormalBP;
    private javax.swing.JButton btnAbnormalHeartRate;
    private javax.swing.JButton btnAbnormalRespRate;
    private javax.swing.JButton btnAbnormalWeight;
    private javax.swing.JButton btnDeletePatient;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel lblView;
    private javax.swing.JLabel lblVitalChart;
    private javax.swing.JScrollPane scrollAbnormal;
    private javax.swing.JTable tblAbnormal;
    private javax.swing.JTable tblViewPatientDetails;
    // End of variables declaration//GEN-END:variables
}
