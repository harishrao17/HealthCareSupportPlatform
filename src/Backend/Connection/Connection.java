/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Backend.Connection;

import Backend.UserAccount.UserAccount;
import Backend.WorkQueue.WorkRequest;

/**
 *
 * @author nehar
 */
public class Connection {
    
    private WorkRequest donorReq ;
    private WorkRequest receiverReq;
    private String docStatus; 
    private String delStatus; 
    private String manStatus;
    
    

    public String getManStatus() {
        return manStatus;
    }

    public void setManStatus(String manStatus) {
        this.manStatus = manStatus;
    }

    public String getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(String delStatus) {
        this.delStatus = delStatus;
    }
    private UserAccount docAss;
    private UserAccount advAss ;
    private String advStatus ;
    private String Organ ;
    private String inventStatus; 

    public String getInventStatus() {
        return inventStatus;
    }

    public void setInventStatus(String inventStatus) {
        this.inventStatus = inventStatus;
    }
    
    

    public UserAccount getAdvAss() {
        return advAss;
    }

    public void setAdvAss(UserAccount advAss) {
        this.advAss = advAss;
    }

    public String getAdvStatus() {
        return advStatus;
    }

    public void setAdvStatus(String advStatus) {
        this.advStatus = advStatus;
    }
    
       
    public String getOrgan() {
        return Organ;
    }

    public void setOrgan(String Organ) {
        this.Organ = Organ;
    }
    

    public String getDocStatus() {
        return docStatus;
    }

    public void setDocStatus(String docStatus) {
        this.docStatus = docStatus;
    }

    public UserAccount getDocAss() {
        return docAss;
    }

    public void setDocAss(UserAccount docAss) {
        this.docAss = docAss;
    }


    public WorkRequest getDonorReq() {
        return donorReq;
    }

    public void setDonorReq(WorkRequest donorReq) {
        this.donorReq = donorReq;
    }

    public WorkRequest getReceiverReq() {
        return receiverReq;
    }

    public void setReceiverReq(WorkRequest receiverReq) {
        this.receiverReq = receiverReq;
    }

    @Override
    public String toString() {
        return Organ ;
    }
    
    
    
    
    
}
