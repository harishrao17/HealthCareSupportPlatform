/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Role;

import Backend.DB4OUtil.DB4OUtil;
import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Organization.Organization;
import Backend.UserAccount.UserAccount;
import UI.Delivery.DeliveryDashBoardJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Arun Balasubramanian
 */
public class DeliveryRole extends Role {
        @Override
    public void createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,DB4OUtil dB4OUtil) {
        DeliveryDashBoardJPanel delPanel = new DeliveryDashBoardJPanel(account,organization,business,dB4OUtil,enterprise);
        delPanel.show();
    }
}
