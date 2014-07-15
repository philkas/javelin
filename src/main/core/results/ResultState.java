/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.core.results;

import java.util.List;

/**
 *
 * @author pika
 */
public interface ResultState {
    public List<AbstractState.States> getStates();
}
