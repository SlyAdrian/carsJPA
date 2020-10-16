package fr.efrei.jpacar.model;

import java.util.ArrayList;
import java.util.Date;


public class Rent {

    private ArrayList<Vehicule> vehicules;
    private java.util.Date beginRent;
    private java.util.Date endRent;

    public ArrayList<Vehicule> getVehicules() {
        return vehicules;
    }

    public void setVehicules(ArrayList<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }

    public Date getBeginRent() {
        return beginRent;
    }

    public void setBeginRent(Date beginRent) {
        this.beginRent = beginRent;
    }

    public Date getEndRent() {
        return endRent;
    }

    public void setEndRent(Date endRent) {
        this.endRent = endRent;
    }
}