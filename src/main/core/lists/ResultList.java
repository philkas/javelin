/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.core.lists;

import java.util.Map;
import main.core.interfaces.CompetitorID;
import main.core.results.AbstractResult;

/**
 *
 * @author pika
 */
public class ResultList {
    private Map< CompetitorID, AbstractResult > results;
    
    public Map<CompetitorID, AbstractResult> getResultMap() {
        return this.results;
    }
}
