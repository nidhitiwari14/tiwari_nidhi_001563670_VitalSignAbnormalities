/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import model.Encounter;
import model.Patient;
import model.SystemM;
import model.VitalSigns;

/**
 *
 * @author nidhitiwari
 */
public class CreatePatient extends javax.swing.JPanel {
    
    public Boolean isFormValid = false;
    
    SystemM system;

    /**
     * Creates new form CreateJPanel
     */
    public CreatePatient(SystemM system) {
        initComponents();
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCreateTitle = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblHouseNumber = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtHouseNumber = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        lblBP = new javax.swing.JLabel();
        lblHeartRate = new javax.swing.JLabel();
        lblRespiratory = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        txtBP = new javax.swing.JTextField();
        txtHeartRate = new javax.swing.JTextField();
        txtRespiratory = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblFirstNameError = new javax.swing.JLabel();
        lblLastNameError = new javax.swing.JLabel();
        lblDOBError = new javax.swing.JLabel();
        lblBPError = new javax.swing.JLabel();
        lblHeartRateError = new javax.swing.JLabel();
        lblRespiratoryError = new javax.swing.JLabel();
        lblWeightError = new javax.swing.JLabel();
        comboBoxCommunity = new javax.swing.JComboBox<>();

        lblCreateTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblCreateTitle.setText("Create Patient Details");

        lblFirstName.setText("First Name");

        lblLastName.setText("Last Name");

        lblDOB.setText("DOB");

        lblHouseNumber.setText("House Number");

        lblCommunity.setText("Community");

        lblCity.setText("City");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        txtFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFirstNameKeyPressed(evt);
            }
        });

        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLastNameKeyPressed(evt);
            }
        });

        txtCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCityFocusLost(evt);
            }
        });
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCityKeyPressed(evt);
            }
        });

        lblBP.setText("BP");

        lblHeartRate.setText("Heart Rate");

        lblRespiratory.setText("Respiratory");

        lblWeight.setText("Weight");

        txtBP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBPKeyPressed(evt);
            }
        });

        txtHeartRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHeartRateKeyPressed(evt);
            }
        });

        txtRespiratory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRespiratoryKeyPressed(evt);
            }
        });

        txtWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtWeightKeyPressed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(0, 153, 255));
        btnSave.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        comboBoxCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCommunityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(lblCreateTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLastName)
                            .addComponent(lblFirstName)
                            .addComponent(lblDOB)
                            .addComponent(lblHouseNumber)
                            .addComponent(lblCommunity)
                            .addComponent(lblCity)
                            .addComponent(lblBP)
                            .addComponent(lblHeartRate)
                            .addComponent(lblRespiratory)
                            .addComponent(lblWeight))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(comboBoxCommunity, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDOB, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHouseNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBP, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHeartRate, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRespiratory, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtWeight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFirstNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDOBError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBPError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblHeartRateError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblWeightError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblRespiratoryError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblLastNameError, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                                        .addGap(202, 202, 202))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblCreateTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLastNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLastName)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDOB)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDOBError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHouseNumber)
                    .addComponent(txtHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(comboBoxCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBP)
                    .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBPError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeartRate)
                    .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeartRateError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRespiratory)
                    .addComponent(txtRespiratory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRespiratoryError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWeightError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        validateForm();
        if (!txtDOB.getText().isEmpty()) {
            SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
            try
                {
                    formatter.parse(txtDOB.getText());
                    lblDOBError.setText("");
                    isFormValid = true;
                }
	    
                catch (Exception e)
                {
                    lblDOBError.setText("Date Format is Invalid");
                    isFormValid = false;
                }
        }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            LocalDate localDate = LocalDate.parse(txtDOB.getText(), formatter);
            java.util.Date date=new java.util.Date(); 
            String houseNum = txtHouseNumber.getText();
            String firstName = txtFirstName.getText();
            String lastName = txtLastName.getText();
            Object selectedcommunity = comboBoxCommunity.getSelectedItem();
            String community = selectedcommunity.toString();
            String city = txtCity.getText();
            LocalDate dob = localDate; 
            
            Patient patient = new Patient(
            firstName, 
            lastName, 
            dob, 
            houseNum, 
            community,
            city,  
            system.getPatientDirectory().size() + 1,
            system.getPersonDirectory().size() + 1
        );
                    
        Encounter encounter = null;
        VitalSigns vitals = new VitalSigns();
        vitals.setBloodPressure(Integer.parseInt(txtBP.getText()));
        vitals.setRespiratoryRate(Integer.parseInt(txtRespiratory.getText()));
        vitals.setHeartRate(Integer.parseInt(txtHeartRate.getText()));
        vitals.setWeightInKilos(Float.parseFloat(txtWeight.getText()));
        encounter = new Encounter(vitals);
        patient.getEncounterHistory().recordEncounter(encounter);
        
        if(isFormValid) {
            system.addPatient(patient);
            JOptionPane.showMessageDialog(this, "New patient Record Added"); 
        } else {
            JOptionPane.showMessageDialog(this, "Please enter valid values"); 
        }
        
        txtFirstName.setText("");
        txtLastName.setText("");
        txtDOB.setText("");
        txtHouseNumber.setText("");
        txtBP.setText("");
        txtHeartRate.setText("");
        txtRespiratory.setText("");
        txtWeight.setText("");
        comboBoxCommunity.setSelectedIndex(-1);
        txtCity.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed

    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtFirstNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirstNameKeyPressed
        validateForm();
        char letterPressed = evt.getKeyChar();
        if(Character.isDigit(letterPressed)){
        isFormValid = false;
        txtFirstName.setEditable(false);
        lblFirstNameError.setText("Please enter letters only!");
        validateForm();
        }
        else
        {
        txtFirstName.setEditable(true);
        isFormValid = true;
        lblFirstNameError.setText("");
        validateForm();
        }
    }//GEN-LAST:event_txtFirstNameKeyPressed

    private void txtLastNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyPressed
        validateForm();
        char letterPressed = evt.getKeyChar();
        if(Character.isDigit(letterPressed)){
        isFormValid = false;
        txtLastName.setEditable(false);
        lblLastNameError.setText("Please enter letters only!");
        validateForm();
        }
        else
        {
        txtLastName.setEditable(true);
        isFormValid = true;
        lblLastNameError.setText("");
        validateForm();
        }
    }//GEN-LAST:event_txtLastNameKeyPressed

    private void txtCityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyPressed
        
    }//GEN-LAST:event_txtCityKeyPressed

    private void txtBPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBPKeyPressed
        validateForm();
        char NumPressed = evt.getKeyChar();
        if(Character.isLetter(NumPressed)){
            isFormValid = false;
            txtBP.setEditable(false);
            lblBPError.setText("Please enter number Only!");
            validateForm();
        }
        else
        {
            txtBP.setEditable(true);
            isFormValid = true;
            lblBPError.setText("");
            validateForm();
        }
    }//GEN-LAST:event_txtBPKeyPressed

    private void txtHeartRateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHeartRateKeyPressed
        validateForm();
        char NumPressed = evt.getKeyChar();
        if(Character.isLetter(NumPressed)){
            isFormValid = false;
            txtHeartRate.setEditable(false);
            lblHeartRateError.setText("Please enter number Only!");
            validateForm();
        }
        else
        {
            txtHeartRate.setEditable(true);
            isFormValid = true;
            lblHeartRateError.setText("");
            validateForm();
        }
    }//GEN-LAST:event_txtHeartRateKeyPressed

    private void txtRespiratoryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRespiratoryKeyPressed
        validateForm();
        char NumPressed = evt.getKeyChar();
        if(Character.isLetter(NumPressed)){
            isFormValid = false;
            txtRespiratory.setEditable(false);
            lblRespiratoryError.setText("Please enter number Only!");
            validateForm();
        }
        else
        {
            txtRespiratory.setEditable(true);
            isFormValid = true;
            lblRespiratoryError.setText("");
            validateForm();
        } 
    }//GEN-LAST:event_txtRespiratoryKeyPressed

    private void txtWeightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWeightKeyPressed
        validateForm();
        char NumPressed = evt.getKeyChar();
        if(Character.isLetter(NumPressed)){
            isFormValid = false;
            txtWeight.setEditable(false);
            lblWeightError.setText("Please enter number Only!");
            validateForm();
        }
        else
        {
            txtWeight.setEditable(true);
            isFormValid = true;
            lblWeightError.setText("");
            validateForm();
        }
    }//GEN-LAST:event_txtWeightKeyPressed
    
    private void setCommunityName() {
        if(txtCity.getText().equalsIgnoreCase("Boston")) {
            comboBoxCommunity.removeAllItems();
            comboBoxCommunity.addItem("Dorchester");
            comboBoxCommunity.addItem("Beacon Hill");
            comboBoxCommunity.addItem("Allston");
            comboBoxCommunity.addItem("Charlestown");
            comboBoxCommunity.addItem("Chinatown");
            comboBoxCommunity.addItem("Back Bay");
        }
        if(txtCity.getText().equalsIgnoreCase("Charlotte")) {
            comboBoxCommunity.removeAllItems();
            comboBoxCommunity.addItem("Uptown");
            comboBoxCommunity.addItem("University City");
            comboBoxCommunity.addItem("SouthPark");
            comboBoxCommunity.addItem("Elizabeth");
            comboBoxCommunity.addItem("Plaza-Midwood");
        }
        if(txtCity.getText().equalsIgnoreCase("San Diego")) {
            comboBoxCommunity.removeAllItems();
            comboBoxCommunity.addItem("Del Mar");
            comboBoxCommunity.addItem("Caramel Valley");
            comboBoxCommunity.addItem("Olivenhain");
            comboBoxCommunity.addItem("Solana Beach");
            comboBoxCommunity.addItem("Leucadia");
        }
        if(txtCity.getText().equalsIgnoreCase("New York")) {
            comboBoxCommunity.removeAllItems();
            comboBoxCommunity.addItem("Bronx CB 1");
            comboBoxCommunity.addItem("Bronx CB 2");
            comboBoxCommunity.addItem("Bronx CB 3");
        }
    }
    
    private void comboBoxCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCommunityActionPerformed
        
    }//GEN-LAST:event_comboBoxCommunityActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCityFocusLost
        setCommunityName();
    }//GEN-LAST:event_txtCityFocusLost
    
    private void validateForm () {
        if((txtFirstName.getText().isEmpty())) {
            isFormValid = false;
        }
        if((txtLastName.getText().isEmpty())) {
            isFormValid = false;
        }
        if((txtDOB.getText().isEmpty())) {
            isFormValid = false;
        }
        if((txtHouseNumber.getText().isEmpty())) {
            isFormValid = false;
        }
        if((txtCity.getText().isEmpty())) {
            isFormValid = false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboBoxCommunity;
    private javax.swing.JLabel lblBP;
    private javax.swing.JLabel lblBPError;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblCreateTitle;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDOBError;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblFirstNameError;
    private javax.swing.JLabel lblHeartRate;
    private javax.swing.JLabel lblHeartRateError;
    private javax.swing.JLabel lblHouseNumber;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLastNameError;
    private javax.swing.JLabel lblRespiratory;
    private javax.swing.JLabel lblRespiratoryError;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lblWeightError;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtHouseNumber;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtRespiratory;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
