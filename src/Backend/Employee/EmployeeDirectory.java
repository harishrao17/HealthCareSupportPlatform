/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Employee;

import java.util.ArrayList;

/**
 *
 * @author Arun Balasubramanian
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> emplyList;

    public EmployeeDirectory() {
        emplyList = new ArrayList();
    }

    public ArrayList<Employee> getEmplyList() {
        return emplyList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        emplyList.add(employee);
        return employee;
    }
    
    public void removeEmployee(Employee name){
        //Employee employee = new Employee();
        emplyList.remove(name);
    }
}