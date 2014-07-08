/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.core.lists;

import main.core.Competitor;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author pika
 */
public class AttendeList {
    private Set<Competitor> attendies;
    
    public AttendeList() {
        attendies = new TreeSet<>();
    }
}
