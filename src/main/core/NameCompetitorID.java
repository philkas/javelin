/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.core;

import main.core.interfaces.CompetitorID;

/**
 *
 * @author pika
 */
public class NameCompetitorID implements CompetitorID<NameCompetitorID>{
    private String id;

    @Override
    public String getID() {
        return this.id;
    }

    @Override
    public void setID(String id) {
        if(id == null) {
            this.id = "";
        } else {
            this.id = id;
        }
    }

    @Override
    public int compareTo(NameCompetitorID o) {
        return this.id.compareTo(o.id);
    }
    
    @Override
    public String toString() {
        return this.id;
    }
}
