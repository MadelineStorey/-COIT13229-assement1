/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author madel
 */
public class Fire {
private int fireID;
private String fireCat;
private String firePostion;

// constructor

    public Fire(int fireID, String fireCat, String firePostion) {
        this.fireID = fireID;
        this.fireCat = fireCat;
        this.firePostion = firePostion;
    }
// getter methods 

    public int getFireID() {
        return fireID;
    }

    public String getFireCat() {
        return fireCat;
    }

    public String getFirePostion() {
        return firePostion;
    }
    // setter methods 

    public void setFireID(int fireID) {
        this.fireID = fireID; // Do I want this to be unqie? I am thinking yes but not too sure 
        
    }

    public void setFireCat(String fireCat) {
        this.fireCat = fireCat; // Want to set a few options here 
    }

    public void setFirePostion(String firePostion) {
        this.firePostion = firePostion;
    }
    
}
