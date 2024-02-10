/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.User;

import Backend.Address.Address;
import Backend.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author nehar
 */
public class User {
 
    private String emailId;
    private String password;
    private String userName;
    private String name ;
    private char   type ;
    private String phoneNumber;
    private Date DOB ;
    private String gender ;
    private String emergencyPhoneNumber;
    private String relationShip ;
    private String addr; 
    private String zip ;
    private String state ;
    private String urban ;
    private boolean heart ;
    private boolean limbs ;

    public boolean isLimbs() {
        return limbs;
    }

    public void setLimbs(boolean limbs) {
        this.limbs = limbs;
    }
    private boolean liver ;
    private boolean lungs ;
    private boolean kidney ;
    private boolean eyes ;
    private JLabel photoLabel;
    private byte[] dP;

    public byte[] getdP() {
        return dP;
    }

    public void setdP(byte[] dP) {
        this.dP = dP;
    }
    private boolean completeProfile = false;

    public boolean isCompleteProfile() {
        return completeProfile;
    }

    public void setCompleteProfile(boolean completeProfile) {
        this.completeProfile = completeProfile;
    }

    public JLabel getPhotoLabel() {
        return photoLabel;
    }

    public void setPhotoLabel(JLabel photoLabel) {
        this.photoLabel = photoLabel;
    }
    private ArrayList<WorkRequest> userRequestList ;

    public User() {
        userRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getUserRequestList() {
        return userRequestList;
    }

    public void setUserRequestList(ArrayList<WorkRequest> userRequestList) {
        this.userRequestList = userRequestList;
    }
    
    

    @Override
    public String toString() {
        return name ;
    }

    public boolean isHeart() {
        return heart;
    }

    public void setHeart(boolean heart) {
        this.heart = heart;
    }

    public boolean isLiver() {
        return liver;
    }

    public void setLiver(boolean liver) {
        this.liver = liver;
    }

    public boolean isLungs() {
        return lungs;
    }

    public void setLungs(boolean lungs) {
        this.lungs = lungs;
    }

    public boolean isKidney() {
        return kidney;
    }

    public void setKidney(boolean kidney) {
        this.kidney = kidney;
    }

    public boolean isEyes() {
        return eyes;
    }

    public void setEyes(boolean eyes) {
        this.eyes = eyes;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmergencyPhoneNumber() {
        return emergencyPhoneNumber;
    }

    public void setEmergencyPhoneNumber(String emergencyPhoneNumber) {
        this.emergencyPhoneNumber = emergencyPhoneNumber;
    }

    public String getRelationShip() {
        return relationShip;
    }

    public void setRelationShip(String relationShip) {
        this.relationShip = relationShip;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUrban() {
        return urban;
    }

    public void setUrban(String urban) {
        this.urban = urban;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public  void addUserRequest (WorkRequest  userRequest) {
    
    userRequestList.add(userRequest);
    }
     
}
