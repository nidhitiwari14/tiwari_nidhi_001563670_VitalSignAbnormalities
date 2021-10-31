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
public class Community extends City {
    String communityName;  
    
    public Community(String name, String cityName) {
        super(cityName);
        this.communityName = name;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String name) {
        this.communityName = name;
    }
}
