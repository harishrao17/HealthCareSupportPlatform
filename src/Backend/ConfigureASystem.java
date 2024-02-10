package Backend;

import Backend.Employee.Employee;
import Backend.NGO.NGO;
import Backend.Role.SystemAdminRole;
import Backend.UserAccount.UserAccount;

/**
 *
 * @author Arun Balasubramanian
 */
public class ConfigureASystem {

    public static EcoSystem configure() {
        EcoSystem system = EcoSystem.getInstance();
        System.out.println(system.getUserDirectory());

        System.out.println(system.getUserDirectory());
        System.out.println("Hi rA NEE");
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        System.out.println(system.getUserDirectory());

        Employee employee3 = system.getEmployeeDirectory().createEmployee("LiverNGO");
        system.getUserAccountDirectory().createUserAccount("LiverNGO", "LiverNGO", employee3, new SystemAdminRole());
        NGO ngo = system.createAndAddNGO();
        ngo.setName("LiverNGO");
        Employee employee4 = system.getEmployeeDirectory().createEmployee("LimbsNGO");
        system.getUserAccountDirectory().createUserAccount("LimbsNGO", "LimbsNGO", employee4, new SystemAdminRole());
        NGO ngo1 = system.createAndAddNGO();
        ngo1.setName("LimbsNGO");
        return system;
    }
}
