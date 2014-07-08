/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.core;

/**
 *
 * @author pika
 */
public class AgeClass {
    private YearRange year;
    private String shortDescription;
    private String description;
    private Sex sex;

    private static class InvalidRangeException extends Exception {

        public InvalidRangeException() {
        }
    }
    
    private class YearRange {
        private int startYear;
        private int endYear;
        
        public YearRange(int start, int end) throws InvalidRangeException {
            setRange(start, end);
        }
        
        public void setRange(int start, int end) throws InvalidRangeException {
            if(start > end) {
                throw new InvalidRangeException();
            }
            
            this.startYear = start;
            this.endYear = end;
        }
        
        public int getStartYear() {
            return this.startYear;
        }
        
        public int getEndYear() {
            return this.endYear;
        }
        
        public void setStartYear(int start) throws InvalidRangeException {
            setRange(start, this.endYear);
        }
        
        public void setEndYear(int end) throws InvalidRangeException {
            setRange(this.startYear, end);
        }
    }
    
    public AgeClass(int start, int end, String shortDesc, String desc, Sex sex) throws InvalidRangeException {
        year = new YearRange(start, end);
        
    }
    
    public void setYears(int start, int end) throws InvalidRangeException {
        this.year.setRange(start, end);
    }
    
    public void setShortDescription(String desc) {
        if(desc == null) {
            this.shortDescription = "";
        } else {
            this.shortDescription = desc;
        }
    }
    
    public void setDescription(String desc) {
        if(desc == null) {
            this.description = "";
        } else {
            this.description = desc;
        }
    }
    
    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
