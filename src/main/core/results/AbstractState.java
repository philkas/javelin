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
public class AbstractState {

    protected static class InvalidStateException extends Exception {

        public InvalidStateException(char c) {
            super("State with short name '" + c + "' does not exist.");
        }
    }
    protected enum States {
        VALID('o'),
        INVALID('x'),
        PASS('p'),
        DNF('f'),
        DNS('s');
        
        private final char state;
        
        States(char s) {
            this.state = s;
        }
        
        char getShort() {
            return this.state;
        }
        
        public static States getState(char c) throws InvalidStateException {
            for(States s : States.values()) {
                if(s.getShort() == c) {
                    return s;
                }
            }
            throw new InvalidStateException(c);
        }
    }
}
