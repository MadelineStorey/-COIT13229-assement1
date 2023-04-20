/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author madel
 */
public class Drone {
    
    // Declare Variables 
    private int droneID;
    private String droneName;
    private String droneIntialPosition = "(0,0)";// setting for intial posistion 
    
    
    // Constructor 

    public Drone(int droneID, String droneName, String droneIntialPosition) {
        this.droneID = droneID;
        this.droneName = droneName;
        this.droneIntialPosition = droneIntialPosition;
    }
    // Get methods 

    public int getDroneID() {
        return droneID;
    }

    public String getDroneName() {
        return droneName;
    }

    public String getDroneIntialPosition() {
        return droneIntialPosition; 
        // need to figure out if I error check here or somewhere else for the (x,y) format thinking this is in the read method 
        
    }
    
    // set methods 

    public void setDroneID(int droneID) {
        this.droneID = droneID;
    }

    public void setDroneName(String droneName) {
        this.droneName = droneName;
    }

    public void setDroneIntialPosition(String droneIntialPosition) {
        this.droneIntialPosition = droneIntialPosition;
    }
    
    
}
