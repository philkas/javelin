/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.core.interfaces;

import main.core.lists.AttendeList;
import main.core.Round;

/**
 *
 * @author pika
 */
public interface QualificationRule {
    public AttendeList applyRule(final Round round);
}
