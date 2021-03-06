/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.SystemM;

/**
 *
 * @author nidhitiwari
 */
public class DoctorVisit extends javax.swing.JPanel {
    
    SystemM system;

    /**
     * Creates new form DoctorVisit
     */
    public DoctorVisit(SystemM system) {
        initComponents();
        this.system =  system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnCreateNewPatient = new javax.swing.JButton();
        btnUpdateExistingPatient = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );

        splitPane.setLeftComponent(jPanel1);

        btnCreateNewPatient.setBackground(new java.awt.Color(0, 153, 255));
        btnCreateNewPatient.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        btnCreateNewPatient.setText("Create New Patient");
        btnCreateNewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewPatientActionPerformed(evt);
            }
        });

        btnUpdateExistingPatient.setBackground(new java.awt.Color(0, 153, 255));
        btnUpdateExistingPatient.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        btnUpdateExistingPatient.setText("Update Existing Patient");
        btnUpdateExistingPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateExistingPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdateExistingPatient)
                    .addComponent(btnCreateNewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreateNewPatient, btnUpdateExistingPatient});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btnCreateNewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnUpdateExistingPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreateNewPatient, btnUpdateExistingPatient});

        splitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateNewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewPatientActionPerformed
        // TODO add your handling code here:
        CreatePatient createPatient = new CreatePatient(system);
        splitPane.setRightComponent(createPatient);

    }//GEN-LAST:event_btnCreateNewPatientActionPerformed

    private void btnUpdateExistingPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateExistingPatientActionPerformed
        // TODO add your handling code here:
        UpdatePatient updatePatient = new UpdatePatient(system);
        splitPane.setRightComponent(updatePatient);
    }//GEN-LAST:event_btnUpdateExistingPatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateNewPatient;
    private javax.swing.JButton btnUpdateExistingPatient;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
