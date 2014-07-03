/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package core;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author pika
 */
public class Round implements Iterable<Competition>{
    private Round preRound;
    private String name;
    private List<Competition> competitions;
    
    public Round() {
        this("", null);
    }
    
    public Round(final String name, final Round preRound) {
        this.name = name;
        this.preRound = preRound;
    }
    
    public Round(final Round preRound) {
        this("", preRound);
    }
    
    public Round(String name) {
        this(name, null);
    }
    
    public boolean isLeaf() {
        return this.preRound == null;
    }

    @Override
    public Iterator<Competition> iterator() {
        return competitions.iterator();
    }
}
