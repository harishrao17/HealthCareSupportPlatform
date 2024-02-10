/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.WorkQueue;

import Backend.User.User;
import Backend.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Arun Balasubramanian
 */
public abstract class WorkRequest {

    private UserAccount coordinatorAssigned;
    private UserAccount labAssitantAssigned;
    private UserAccount ManufacturerAssigned;
   private String labStatus;
    private String manStatus;
    public UserAccount getManufacturerAssigned() {
        return ManufacturerAssigned;
    }

    public void setManufacturerAssigned(UserAccount ManufacturerAssigned) {
        this.ManufacturerAssigned = ManufacturerAssigned;
    }
   

    public String getManStatus() {
        return manStatus;
    }

    public void setManStatus(String manStatus) {
        this.manStatus = manStatus;
    }
    private String coordinatorStatus ;
    private Date actionDate ; 
    private User user ;
    private String receiverOrgan ;
    private String donorOrgan;
    private String overallStatus;
     private String inventStatus;

    public String getInventStatus() {
        return inventStatus;
    }

    public void setInventStatus(String inventStatus) {
        this.inventStatus = inventStatus;
    }

    public String getOverallStatus() {
        return overallStatus;
    }

    public void setOverallStatus(String overallStatus) {
        this.overallStatus = overallStatus;
    }

    public String getDonorOrgan() {
        return donorOrgan;
    }

    public void setDonorOrgan(String donorOrgan) {
        this.donorOrgan = donorOrgan;
    }
    
    
    public String getReceiverOrgan() {
        return receiverOrgan;
    }

    public void setReceiverOrgan(String receiverOrgan) {
        this.receiverOrgan = receiverOrgan;
    }
    
    

    public UserAccount getCoordinatorAssigned() {
        return coordinatorAssigned;
    }

    public void setCoordinatorAssigned(UserAccount coordinatorAssigned) {
        this.coordinatorAssigned = coordinatorAssigned;
    }

    public UserAccount getLabAssitantAssigned() {
        return labAssitantAssigned;
    }

    public void setLabAssitantAssigned(UserAccount labAssitantAssigned) {
        this.labAssitantAssigned = labAssitantAssigned;
    }

    public String getLabStatus() {
        return labStatus;
    }

    public void setLabStatus(String labStatus) {
        this.labStatus = labStatus;
    }

    public String getCoordinatorStatus() {
        return coordinatorStatus;
    }

    public void setCoordinatorStatus(String coordinatorStatus) {
        this.coordinatorStatus = coordinatorStatus;
    }

    public Date getActionDate() {
        return actionDate;
    }

    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
    @Override
    public String toString() {
        return actionDate.toString() ;
    }
    
    
    
}
