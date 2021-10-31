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
public class House extends Community {
    private String houseNumber;
    
    public House(String houseNumber, String community, String city){
        super(community, city);
        this.houseNumber = houseNumber;
    }
    
    public String getHouseNumber() {
        return houseNumber;
    }
}
