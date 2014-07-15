/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.core.results;

/**
 *
 * @author pika
 */
public final class WindVelocity implements Comparable<WindVelocity>{
    private final double velocity;
    
    public WindVelocity(final double velo) {
        this.velocity = Math.round(velo * 100.0) / 100.0;
    }
    
    public double getVelocity() {
        return this.velocity;
    }
    
    @Override
    public String toString() {
        return Double.toString(this.velocity);
    }
    
    public boolean equals(final WindVelocity other) {
        return this.velocity == other.velocity;
    }
    
    @Override
    public int compareTo(WindVelocity other) {
        return (int)(this.velocity - other.velocity);
    }
}
