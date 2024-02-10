/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;



import Backend.Role.LimbsManufacturerRole;
import Backend.Role.Role;
import java.util.ArrayList;



/**
*
* @author Arun Balasubramanian
*/
public class LimbsManufacturerOrganization extends Organization{
    public LimbsManufacturerOrganization() {
        super(Organization.Type.LimbsManufacturer.getValue());
    }



   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LimbsManufacturerRole());
        return roles;
    }
}
