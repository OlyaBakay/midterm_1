package com.bakay;


public enum RIdesType {
    Ten, Twenty, Fifty, OneHundred;

    public String toString() {
        switch (this){
            case Ten:
                return "Ten";

            case Twenty:
                return "Twenty";

            case Fifty:
                return "Fifty";

            case OneHundred:
                return "OneHundred";

            default:
                return "None";
        }
    }
}
