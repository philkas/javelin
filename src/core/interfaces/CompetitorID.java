/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package core.interfaces;

/**
 *
 * @author pika
 * @param <T>
 */
public interface CompetitorID<T> extends Comparable<T> {
    public String getID();
    public void setID(String id);
}
