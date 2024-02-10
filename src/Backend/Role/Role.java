/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Role;

import Backend.DB4OUtil.DB4OUtil;
import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.NGO.NGO;
import Backend.Organization.Organization;
import Backend.UserAccount.UserAccount;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Arun Balasubramanian
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        Coordinator("Coordinator"),
        InventoryManager("Inventory Manager"),
        Advocate("Advocate"),
        LDAdmin("Admin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
        public void createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,
            DB4OUtil dB4OUtil, NGO inNGO){
            createWorkArea(userProcessContainer, account, organization, enterprise, business, dB4OUtil);
        }

    
    public abstract void createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,
            DB4OUtil dB4OUtil);

    @Override
    public String toString() {
        String abc = this.getClass().getTypeName();
        System.out.println(abc);
        System.out.println("ikkada");
        return abc.substring(13, abc.length());
    }
    
    
}