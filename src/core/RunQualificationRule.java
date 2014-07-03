/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package core;

import core.lists.AttendeList;
import core.interfaces.QualificationRule;

/**
 *
 * @author pika
 */
public final class RunQualificationRule implements QualificationRule {
    private int runWinner;
    private int bestTimes;
    
    public RunQualificationRule(final int w, final int b) {
        setRunWinners(w);
        setBestTimes(b);
    }
    
    public RunQualificationRule() {
        this(0,0);
    }
    
    public void setRunWinners(final int w) {
        this.runWinner = w < 0 ? 0 : w;
    }
    
    public void setBestTimes(final int b) {
        this.bestTimes = b < 0 ? 0 : b;
    }
    
    public int getRunWinnders() {
        return this.runWinner;
    }
    
    public int getBestTimes() {
        return this.bestTimes;
    }
    
    private void addWinner(AttendeList attendeList, final Round round) {
        for(Competition competition : round) {
            
        }
    }

    @Override
    public AttendeList applyRule(Round round) {
        AttendeList attendeList = new AttendeList();
        return attendeList;
    }
    
}
