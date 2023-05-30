/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muyasrasystem;

/**
 *
 * @author hanee
 */
public class Bus {
    //data filds
    private int busID;
    private String ownerOftheBus;//مثلا زي المغربي ولا سابتكو
    private String tripId;
    private boolean availability;

    //construcor 
    public Bus(int busID, String ownerOftheBus, String tripId, boolean availability) {
        this.busID = busID;
        this.ownerOftheBus = ownerOftheBus;
        this.tripId = tripId;
        this.availability = availability;
    }

    //setters and getters
    public int getBusID() {
        return busID;
    }

    public void setBusID(int busID) {
        this.busID = busID;
    }

    public String getOwnerOftheBus() {
        return ownerOftheBus;
    }

    public void setOwnerOftheBus(String ownerOftheBus) {
        this.ownerOftheBus = ownerOftheBus;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    
    //METHODS:
    //يشيك اذا كان تريب ايدي نلل معناته الباص افايلبل فحيكون ترو
    //لكن لو كان تريب ايدي مو نلل معناته الافايلبيلتي حق الباص فولس 
    //check bus availability 
    
    
   
    
}
