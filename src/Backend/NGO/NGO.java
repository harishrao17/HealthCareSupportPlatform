/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.NGO;

import Backend.Email;
import Backend.Enterprise.EnterpriseDirectory;
import Backend.User.UserDirectory;
import Backend.UserAccount.UserAccountDirectory;

/**
 *
 * @author nehar
 */
public class NGO {
    private String name;
    private String urban;
    private String zcode;

    public String getUrban() {
        return urban;
    }

    public void setUrban(String urban) {
        this.urban = urban;
    }

    public String getZcode() {
        return zcode;
    }

    public void setZcode(String zcode) {
        this.zcode = zcode;
    }
    private EnterpriseDirectory enterpriseDirectory;
     Email email;
    
    public NGO(){
        enterpriseDirectory=new EnterpriseDirectory();
        email = new Email();
    }
    
    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
   
    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
