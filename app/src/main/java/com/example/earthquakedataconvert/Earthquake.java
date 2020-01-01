package com.example.earthquakedataconvert;

public class Earthquake {
    private Double magnitude;
    private String place;
    private String status;
    private String alert;
    private String title;
    private Boolean tsunami;

    public Earthquake() {
    }

    public Earthquake(double magnitude, String place, String status, String alert, String title, Boolean tsunami) {
        this.magnitude = magnitude;
        this.place = place;
        this.status = status;
        this.alert = alert;
        this.title = title;
        this.tsunami = tsunami;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getTsunami() {
        return tsunami;
    }

    public void setTsunami(Boolean tsunami) {
        this.tsunami = tsunami;
    }

}
