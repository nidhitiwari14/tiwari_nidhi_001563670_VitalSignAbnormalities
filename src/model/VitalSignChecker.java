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
        int bp = vitalSigns.getBloodPressure();
        switch (ageGroup) {
            case Newborn:
                return bp > 45 && bp < 90;
            case Infant:
                return bp > 80 && bp < 100;
            case Toddler:
            case PreSchooler:
            case SchoolAge:
                return bp > 80 && bp < 120;
            case Adolscent:
                return bp > 90 && bp < 120;
            case Adult:
                return bp > 95 && bp < 135;
            case Elderly:
                return bp > 95 && bp < 145;
        }
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
                return hr > 100 && hr < 160;
            case Infant:
                return hr > 90 && hr < 150;
            case Toddler:
                return hr > 80 && hr < 140;
            case PreSchooler:
                return hr > 70 && hr < 130;
            case SchoolAge:
                return hr > 60 && hr < 105;
            case Adolscent:
            case Adult:
            case Elderly:
                return hr > 60 && hr < 100;
        }
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
            case Infant:
                return rr > 30 && rr < 60;
            case Toddler:
                return rr > 24 && rr < 40;
            case PreSchooler:
                return rr > 22 && rr < 34;
            case SchoolAge:
                return rr > 18 && rr < 30;
            case Adult:
            case Adolscent:
            case Elderly:
                return rr > 12 && rr < 16;
        }
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
                return w > 2 && w <= 5;
            case Infant:
                return w > 5 && w <= 10;
            case Toddler:
                return w > 10 && w <= 20;
            case PreSchooler:
                return w > 20 && w <= 35;
            case SchoolAge:
                return w > 35 && w <= 50;
            case Adolscent:
            case Adult:
            case Elderly:
                return w > 50 && w < 80;
        }
        return true;
    }


}
