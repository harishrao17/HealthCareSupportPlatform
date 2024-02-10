/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Role;

import Backend.DB4OUtil.DB4OUtil;
import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.NGO.NGO;
import Backend.Organization.Organization;
import Backend.UserAccount.UserAccount;
import UI.Admin.AdminDashBoardJPanel;
import UI.Coordinator.CoordinatorDashBoardJPanel;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import UI.Coordinator.CoordinatorManageRequestsJPanel;
import UI.InventoryManager.InventoryManagerDashBoardJPanel;

/**
 *
 * @author nehar
 */
public class InventoryManagerRole extends Role {

    public void createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, DB4OUtil dB4OUtil) {

    }

    public void createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, DB4OUtil dB4OUtil, NGO inNGO) {
        InventoryManagerDashBoardJPanel lab = new InventoryManagerDashBoardJPanel(account, organization, business, dB4OUtil, enterprise, inNGO);
        lab.show();
    }

}
