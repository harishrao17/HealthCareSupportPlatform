/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Role;

import Backend.DB4OUtil.DB4OUtil;
import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Organization.Organization;
import Backend.UserAccount.UserAccount;
import UI.Admin.AdminDashBoardJPanel;
import UI.SystemAdmin.SysAdminDashboardJPanel;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author Arun Balasubramanian
 */
public class SystemAdminRole extends Role{

    @Override
    public void createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system,DB4OUtil dB4OUtil) {
        SysAdminDashboardJPanel jpanel = new SysAdminDashboardJPanel(system,dB4OUtil,account);
        //userProcessContainer.add("SysAdminDashboardJPanel",jpanel);
       // CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        //layout.next(userProcessContainer);
        //jpanel.setVisible(true);
        jpanel.show();
    }
    
}
