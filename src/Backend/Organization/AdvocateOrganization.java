/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Organization;

import Backend.Role.AdvocateRole;
import Backend.Role.DoctorRole;
import Backend.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Arun Balasubramanian
 */
public class AdvocateOrganization extends Organization{

    public AdvocateOrganization() {
        super(Organization.LegalType.Advocate.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdvocateRole());
        return roles;
    }
     
}