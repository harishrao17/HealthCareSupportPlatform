/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Enterprise;

import Backend.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Arun Balasubramanian
 */
public class LimbsBankEnterprise extends Enterprise {
        public LimbsBankEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.LimbsBank);

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
