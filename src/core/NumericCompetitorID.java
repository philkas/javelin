/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package core;

import core.interfaces.CompetitorID;

/**
 *
 * @author pika
 */
public class NumericCompetitorID implements CompetitorID<NumericCompetitorID> {
    private int id;
    
    public NumericCompetitorID(int id) {
        this.id = id;
    }
    
    public NumericCompetitorID(String id) {
        if(id == null || id.equals("")) {
            this.id = 0;
        } else {
            this.id = Integer.parseInt(id);
        }
    }
    
    @Override
    public String getID() {
        return this.toString();
    }

    @Override
    public void setID(String id) {
        this.id = Integer.parseInt(id);
    }
    
    @Override
    public String toString() {
        return Integer.toString(this.id);
    }

    @Override
    public int compareTo(NumericCompetitorID o) {
        return this.id - o.id;
    }
    
}
