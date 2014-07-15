/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.core.results;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pika
 */
public final class State extends AbstractState implements ResultState {
    private String states;
    
    public State(char state) {
        this(Character.toString(state));
    }
    
    public State(String state) {
        this.states = state;
    }
    
    @Override
    public List<States> getStates() {
        List<States> statesList = new ArrayList<>(this.states.length());
        for(int i = 0; i < this.states.length(); i++) {
            try {
                statesList.add(i, States.getState(this.states.charAt(i)));
            } catch (InvalidStateException ex) {
                Logger.getLogger(State.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return statesList;
    }
    
    @Override
    public String toString() {
        return this.states;
    }
}
