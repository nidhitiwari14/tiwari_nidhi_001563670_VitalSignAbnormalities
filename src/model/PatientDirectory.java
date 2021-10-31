/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nidhitiwari
 */
public class PatientDirectory {
    
    ArrayList<Patient> patientList;
    
    List<Patient> patients = new ArrayList<Patient>();

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
    
    public void addPatient(Patient patient){
        this.patients.add(patient);
    }
    
}
