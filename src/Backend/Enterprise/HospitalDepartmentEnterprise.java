/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Enterprise;

import Backend.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nehar
 */
public class HospitalDepartmentEnterprise extends Enterprise {
    
    public HospitalDepartmentEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.HospitalDepartment);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
