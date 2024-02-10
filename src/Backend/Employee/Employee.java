/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Employee;

import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author Arun Balasubramanian
 */
public class Employee {
    
    
    private String name;
    private String phoneNumber;
    private Date DOB ;
    private String gender ;
    private String emergencyPhoneNumber;
    private String relationShip;
    private String addr; 
    private String zip ;
    private String state ;
    private String urban ;
    private int id;
    private static int cnt = 1;
    private JLabel photoLabel;
 private byte[] dP;

    public byte[] getdP() {
        return dP;
    }

    public void setdP(byte[] dP) {
        this.dP = dP;
    }
    public JLabel getPhotoLabel() {
        return photoLabel;
    }

    public void setPhotoLabel(JLabel photoLabel) {
        this.photoLabel = photoLabel;
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

    public static int getCnt() {
        return cnt;
    }

    public static void setCnt(int cnt) {
        Employee.cnt = cnt;
    }
    
    

    public Employee() {
        id = cnt;
        cnt++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
