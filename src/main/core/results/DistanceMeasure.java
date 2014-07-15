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
public final class DistanceMeasure implements Comparable<DistanceMeasure>{
    private final double measure;
    
    public DistanceMeasure(final double m) {
        this.measure = m;
    }
    
    public double getMeasure() {
        return this.measure;
    }

    @Override
    public int compareTo(DistanceMeasure o) {
        if(this.measure == o.measure) {
            return 0;
        } else if(this.measure < o.measure) {
            return -1;
        } else {
            return 1;
        }
    }
}
