/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Organization;

import Backend.Organization.Organization.HospitalType;
import Backend.Organization.Organization.LegalType;
import Backend.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author nehar
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createDonorBankOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Coordinator.getValue())){
            organization = new CoordinatorOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.InventoryManager.getValue())){
            organization = new InventoryManagerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public Organization createLegalOrganization(Organization.LegalType legalType){
        Organization organization = null;
        
        if (legalType.getValue().equals(LegalType.Advocate.getValue())){
            organization = new AdvocateOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    public Organization createLimbsManufacturerOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
  
        else if (type.getValue().equals(Type.Coordinator.getValue())){
            organization = new CoordinatorOrganization();
            organizationList.add(organization);
        }
 
        if (type.getValue().equals(Type.LimbsManufacturer.getValue())){
            organization = new LimbsManufacturerOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.Delivery.getValue())){
            organization = new DeliveryOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    public Organization createHospitalOrganization(Organization.HospitalType hospitalType){
        Organization organization = null;
        if (hospitalType.getValue().equals(HospitalType.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
        public Organization createDeliveryOrganization(Organization.DeliveryType DeliveryType){
        Organization organization = null;
        if (DeliveryType.getValue().equals(DeliveryType.Delivery.getValue())){
            organization = new DeliveryOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}