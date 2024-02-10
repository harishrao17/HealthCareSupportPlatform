/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Enterprise;

//import Business.Role.Role;
import Backend.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Arun Balasubramanian
 */
public class LegalDepartmentEnterprise extends Enterprise {

    public LegalDepartmentEnterprise(String name) {
        super(name, EnterpriseType.LegalDepartment);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

}
