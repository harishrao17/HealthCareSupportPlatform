/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Organization;

import Backend.Role.LabAssistantRole;
import Backend.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Arun Balasubramanian
 */
public class LabOrganization extends Organization{

    public LabOrganization() {
        super(Organization.Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabAssistantRole());
        return roles;
    }
     
   
    
    
}
