/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Organization;

import Backend.Role.DoctorRole;
import Backend.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author harish
 */
public class DoctorOrganization extends Organization{

    public DoctorOrganization() {
        super(Organization.Type.Doctor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }
     
}