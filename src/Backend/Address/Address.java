/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Address;

/**
 *
 * @author harish
 */
public class Address {
     private String stAddress;
    private String urban;
    private String zCode;
    private String state;
    private String country;

    public String getStAddress() {
        return stAddress;
    }

    public void setStreetAddress(String stAddress) {
        this.stAddress = stAddress;
    }

    public String getUrban() {
        return urban;
    }

    public void setUrban(String urban) {
        this.urban = urban;
    }

    public String getZCode() {
        return zCode;
    }

    public void setZCode(String zCode) {
        this.zCode = zCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
     @Override
     public String toString() {
        return stAddress+" "+urban+" "+state+" "+zCode+" "+country; 
    }
}
