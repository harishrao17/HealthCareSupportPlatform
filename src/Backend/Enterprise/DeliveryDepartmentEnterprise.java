/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Enterprise;
import Backend.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author harish
 */
public class DeliveryDepartmentEnterprise extends Enterprise {
   

    public DeliveryDepartmentEnterprise(String name) {
        super(name, EnterpriseType.DeliveryDepartment);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

}
    
