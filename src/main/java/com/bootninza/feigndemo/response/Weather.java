package com.bootninza.feigndemo.response;

public class Weather {

    private Location location;
    private Current current;


    public Location getLocation() {
        return location;
    }


    public void setLocation(Location location) {
        this.location = location;
    }


    public Current getCurrent() {
        return current;
    }


    public void setCurrent(Current current) {
        this.current = current;
    }

}
