/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Organization;

import Backend.Connection.ConnectionDirectory;
import Backend.Employee.EmployeeDirectory;
import Backend.Enterprise.Enterprise;
import Backend.Role.Role;
import Backend.UserAccount.UserAccountDirectory;
import Backend.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author nehar
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private ConnectionDirectory connectionDirectory  ;
    private int organizationID;
    private static int counter = 0;
    private String OrgName;

    public String getOrgName() {
        return OrgName;
    }

    public void setOrgName(String OrgName) {
        this.OrgName = OrgName;
    }

    public enum Type {

        Admin("Admin Organization"),
        Doctor("Doctor Organization"),
        Delivery("Delivery Organization"),
        Lab("Lab Assistant Organization"),
        Coordinator("Coordinator Organization"),
        
        LimbsManufacturer("LimbsManufacturer Organization"), 


        InventoryManager("Inventory Manager Organization");
        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    
    public enum HospitalType{
        Doctor("Doctor Organization");
        private String value;
        
        private HospitalType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    
    public enum LimbsManType{
        LimbsMan("LimbsManufacturer Organization");
        private String value;
        
        private LimbsManType(String value) {
            this.value = value;
        }



       public String getValue() {
            return value;
        }
    }
    
    public enum DeliveryType{
        Delivery("Deliver Organization");
        private String value;
        
        private DeliveryType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    
    public enum LegalType {

        Advocate("Advocate Organization");
        private String value;

        private LegalType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    
    

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        connectionDirectory = new ConnectionDirectory() ;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public ConnectionDirectory getConnectionDirectory() {
        return connectionDirectory;
    }

    public void setConnectionDirectory(ConnectionDirectory connectionDirectory) {
        this.connectionDirectory = connectionDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }

}
