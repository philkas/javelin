/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.core.disciplines;

import main.core.interfaces.Discipline;

/**
 *
 * @author pika
 */
public abstract class AbstractDiscipline implements Discipline {
    protected String name;
    
    @Override
    public String getDisciplineName() {
        return this.name;
    }
}
