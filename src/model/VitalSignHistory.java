/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author nidhitiwari
 */
public class VitalSignHistory {
     private ArrayList<VitalSigns> history;
    
    public VitalSignHistory() {
        history = new ArrayList<>();
    }
    
    public ArrayList<VitalSigns> getHistory() {
        return history;
    }
    
    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    public VitalSigns addVitalSign() {
        VitalSigns vitalSign = new VitalSigns();
        history.add(vitalSign);
        return vitalSign;
    }
    
    public void deleteVitalSign(VitalSigns vitalSign) {
        history.remove(vitalSign);
    }
}
