/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package core;

/**
 *
 * @author pika
 */
public enum Sex {
    MALE("m", "Male"),
    FEMALE("f", "Female");
    
    private String shortName;
    private String name;
    
    Sex(String shortName, String name) {
        this.shortName = shortName;
        this.name = name;
    }
    
    public String getShortName() {
        return this.shortName;
    }
    
    public String getName() {
        return this.name;
    }
}
