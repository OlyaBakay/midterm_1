package com.bakay;

/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public enum SkipassPeriod {
    OneDay, TwoDays, FiveDays, Forever;

    public String toString(){
        switch (this){
            case OneDay:
                return "OneDay";
            case TwoDays:
                return "TwoDays";
            case FiveDays:
                return "FiveDays";
            case Forever:
                return "Forever";
            default:
                return "None";
        }
    }
}
