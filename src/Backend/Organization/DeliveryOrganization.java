/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;

import Backend.Role.DeliveryRole;
import Backend.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author harish
 */
public class DeliveryOrganization extends Organization {
    
        public DeliveryOrganization() {
        super(Organization.Type.Delivery.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DeliveryRole());
        return roles;
    }
    
}
