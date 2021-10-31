/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author nidhitiwari
 */
public class VitalSignChecker {
    
    public static boolean isBloodPressureNormal(Patient patient) {
        AgeGroup ageGroup = patient.getAgeGroup();
        EncounterHistory history = patient.getEncounterHistory();
        Encounter encounter = history.latestEncounter;
        VitalSigns vitalSigns = encounter.getVitalSigns();
        int bp = vitalSigns.getSysBP();
        switch (ageGroup) {
            case Newborn:
                return bp > 49 && bp < 71;
            case Infant:
                return bp > 69 && bp < 101;
            case Toddler:
            case PreSchooler:
                return bp > 79 && bp < 111;
            case SchoolAge:
                return bp > 79 && bp < 121;
            case Adolscent:
                return bp > 109 && bp < 121;
        }
        // Throw exception invalid value
        return true;
    }
    
        public static boolean isHeartRateNormal(Patient patient) {
        AgeGroup ageGroup = patient.getAgeGroup();
        EncounterHistory history = patient.getEncounterHistory();
        Encounter encounter = history.latestEncounter;
        VitalSigns vitalSigns = encounter.getVitalSigns();
        int hr = vitalSigns.getHeartRate();
        switch (ageGroup) {
            case Newborn:
                return hr > 80 && hr < 120;
            case Infant:
                return hr > 70 && hr < 110;
            case Toddler:
            case PreSchooler:
                return hr > 60 && hr < 105;
            case SchoolAge:
                return hr > 60 && hr < 100;
            case Adolscent:
                return hr > 60 && hr < 100;
        }
        // Throw exception invalid value
        return true;
    }
        
    public static boolean isRespiratoryRateNormal(Patient patient) {
        AgeGroup ageGroup = patient.getAgeGroup();
        EncounterHistory history = patient.getEncounterHistory();
        Encounter encounter = history.latestEncounter;
        VitalSigns vitalSigns = encounter.getVitalSigns();
        int rr = vitalSigns.getRespiratoryRate();
        switch (ageGroup) {
            case Newborn:
                return rr > 22 && rr < 34;
            case Infant:
                return rr > 18 && rr < 30;
            case Toddler:
            case PreSchooler:
                return rr > 12 && rr < 16;
            case SchoolAge:
                return rr > 12 && rr < 16;
            case Adolscent:
                return rr > 12 && rr < 16;
        }
        // Throw exception invalid value
        return true;
    }
    
        public static boolean isWeightNormal(Patient patient) {
        AgeGroup ageGroup = patient.getAgeGroup();
        EncounterHistory history = patient.getEncounterHistory();
        Encounter encounter = history.latestEncounter;
        VitalSigns vitalSigns = encounter.getVitalSigns();
        float w = vitalSigns.getWeightInKilos();
        switch (ageGroup) {
            case Newborn:
                return w > 12 && w < 15;
            case Infant:
                return w > 15 && w < 20.5;
            case Toddler:
            case PreSchooler:
                return w > 20.5 && w < 30;
            case SchoolAge:
                return w > 30 && w < 45;
            case Adolscent:
                return w > 45 && w < 80;
        }
        // Throw exception invalid value
        return true;
    }


}
