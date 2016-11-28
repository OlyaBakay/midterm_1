package com.bakay;

public enum SkipassType {
    Weekends, Weekdays, Season;

    public String toString(){
        switch (this){
            case Weekdays:
                return "Weekdays";

            case Weekends:
                return "Weekends";

            case Season:
                return "Season";

            default:
                return "Undefined type";
        }
    }
}
