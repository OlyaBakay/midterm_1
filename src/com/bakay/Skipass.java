package com.bakay;


public class Skipass {
    private final long id;
    protected SkipassType type;
    protected SkipassPeriod period;
    protected boolean isBlocked;
    protected boolean isActive;
    protected int numberOfRides;


    public long getId() {
        return id;
    }

    public SkipassType getType() {
        return type;
    }

    public void setType(SkipassType type) {
        this.type = type;
    }

    public SkipassPeriod getPeriod() {
        return period;
    }

    public void setPeriod(SkipassPeriod period) {
        this.period = period;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getNumberOfRides() {
        return numberOfRides;
    }

    public void setNumberOfRides(int numberOfRides) {
        this.numberOfRides = numberOfRides;
    }



    public Skipass(long id) {
        this.id = id;
    }

    @Override
    public String toString(){

        return ("Id: " + this.id + "Skipass Type: " + this.type + "Skipass Period: "+ this.period
        + "Is card is blocked: " + this.isBlocked + "Is card is active: " + this.isActive
        + "Number of rides left: " + this.numberOfRides);
    }

}
