/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.core.results;

import java.util.List;
import java.util.Map;
import main.core.interfaces.CompetitorID;
import main.core.lists.ResultList;

/**
 *
 * @author pika
 */
public interface Valuation {
    public List<Map.Entry<CompetitorID, AbstractResult>> evaluate(final ResultList resultList);
}
