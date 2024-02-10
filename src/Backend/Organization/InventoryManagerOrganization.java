/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Organization;

import Backend.Role.CoordinatorRole;
import Backend.Role.InventoryManagerRole;
import Backend.Role.LabAssistantRole;
import Backend.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author harish
 */
public class InventoryManagerOrganization extends Organization{

    public InventoryManagerOrganization() {
        super(Organization.Type.InventoryManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InventoryManagerRole());
        return roles;
    }
     
   
    
    
}
