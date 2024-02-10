/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Enterprise;

import Backend.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author nehar
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpList;
   

    public ArrayList<Enterprise> getEnterpList() {
        return enterpList;
    }

    public void setEnterpList(ArrayList<Enterprise> enterpList) {
        this.enterpList = enterpList;
    }
    
    public EnterpriseDirectory(){
        enterpList=new ArrayList<>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.OrganBank){
            enterprise=new OrganBankEnterprise(name);
            enterpList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.LegalDepartment){
            enterprise=new LegalDepartmentEnterprise(name);
            enterpList.add(enterprise);
        }

        else if(type==Enterprise.EnterpriseType.HospitalDepartment){
            enterprise = new HospitalDepartmentEnterprise(name);
            enterpList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.DeliveryDepartment){
            enterprise = new DeliveryDepartmentEnterprise(name);
            enterpList.add(enterprise);
        }
        
        else if(type==Enterprise.EnterpriseType.LimbsBank){
            enterprise = new LimbsBankEnterprise(name);
            enterpList.add(enterprise);
}


        return enterprise;
    }
}



















