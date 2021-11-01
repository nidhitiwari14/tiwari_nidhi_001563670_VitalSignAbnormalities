/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author nidhitiwari
 */
public class Person {
    private int personId;
    private AgeGroup ageGroup;
    private LocalDate dateOfBirth;
    private String firstName;
    private String lastName;
    private House residence;
        
    public Person(
            String firstName, 
            String lastName, 
            LocalDate dateOfBirth, 
            String houseNumber, 
            String communityName, 
            String cityName,
            int personId
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.personId = personId;
        this.residence = new House(houseNumber, communityName, cityName);
        this.setAgeGroup();
    }
    
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }
        
    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public House getResidence() {
        return residence;
    }

    public void setResidence(House houseNumber) {
        this.residence = houseNumber;
    } 
    
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    
    private void setAgeGroup() {
        Period period = Period.between(LocalDate.now(), this.dateOfBirth); 
        int ageInMonths = Math.abs((period.getYears()*12) + Math.abs(period.getMonths()));
        int ageInYears = ageInMonths / 12;
        if (ageInMonths < 1) {
            this.ageGroup = AgeGroup.Newborn;
        } else if (ageInMonths >= 1 && ageInMonths < 12) {
            this.ageGroup = AgeGroup.Infant;

        } else if (ageInYears >= 1 && ageInYears <= 3) {
            this.ageGroup = AgeGroup.Toddler;

        } else if (ageInYears > 3 && ageInYears <= 5) {
            this.ageGroup = AgeGroup.PreSchooler;

        } else if (ageInYears > 5 && ageInYears <= 12) {
            this.ageGroup = AgeGroup.SchoolAge;
        } else if (ageInYears > 12 && ageInYears <= 17) {
            this.ageGroup = AgeGroup.Adolscent;
        } else if (ageInYears > 17 && ageInYears <= 40) {
            this.ageGroup = AgeGroup.Adult;
        } else {
            this.ageGroup = AgeGroup.Elderly;
        }
    }
}
