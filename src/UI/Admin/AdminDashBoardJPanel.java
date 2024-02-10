/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin;

import Backend.DB4OUtil.DB4OUtil;
import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import MainPages.LoginPage;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.SwingUtilities.getWindowAncestor;
import org.jdesktop.swingx.JXFrame;

/**
 *
 * @author nehar
 */
public class AdminDashBoardJPanel extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashBoardJPanel
     */
    private EcoSystem system;
    private Enterprise enterprise ;
    private DB4OUtil dB4OUtil;
    public AdminDashBoardJPanel(Enterprise enterprise,DB4OUtil dB4OUtil,EcoSystem system) {
        initComponents();
         this.enterprise = enterprise ;
        this.dB4OUtil = dB4OUtil;
        this.system = system;
        mngOrganizationButtonMousePressed(null);
        this.setExtendedState(JXFrame.MAXIMIZED_BOTH);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mngAdmin = new javax.swing.JPanel();
        mngOrganizationButton = new javax.swing.JPanel();
        jMngOrganizationLabel10 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        mngUsrButton = new javax.swing.JPanel();
        MngUserlabel = new javax.swing.JLabel();
        mngEmployeeButton = new javax.swing.JPanel();
        mngEmployeelbl = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setMaximumSize(null);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridLayout(1, 1));

        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(1, 1));

        mngAdmin.setBackground(new java.awt.Color(8, 21, 49));
        mngAdmin.setMaximumSize(null);
        mngAdmin.setMinimumSize(null);
        mngAdmin.setName(""); // NOI18N
        mngAdmin.setPreferredSize(null);
        mngAdmin.setRequestFocusEnabled(false);
        mngAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mngOrganizationButton.setBackground(new java.awt.Color(8, 21, 49));
        mngOrganizationButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mngOrganizationButtonMousePressed(evt);
            }
        });

        jMngOrganizationLabel10.setBackground(new java.awt.Color(8, 21, 49));
        jMngOrganizationLabel10.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jMngOrganizationLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jMngOrganizationLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMngOrganizationLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/enterprisex32.png"))); // NOI18N
        jMngOrganizationLabel10.setText("Organization Management ");

        javax.swing.GroupLayout mngOrganizationButtonLayout = new javax.swing.GroupLayout(mngOrganizationButton);
        mngOrganizationButton.setLayout(mngOrganizationButtonLayout);
        mngOrganizationButtonLayout.setHorizontalGroup(
            mngOrganizationButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMngOrganizationLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mngOrganizationButtonLayout.setVerticalGroup(
            mngOrganizationButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mngOrganizationButtonLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jMngOrganizationLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        mngAdmin.add(mngOrganizationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 118, -1, -1));

        back.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logoutx32.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });
        mngAdmin.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 457, 158, 41));

        mngUsrButton.setBackground(new java.awt.Color(8, 21, 49));
        mngUsrButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mngUsrButtonMousePressed(evt);
            }
        });

        MngUserlabel.setBackground(new java.awt.Color(8, 21, 49));
        MngUserlabel.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        MngUserlabel.setForeground(new java.awt.Color(255, 255, 255));
        MngUserlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MngUserlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Userx32.png"))); // NOI18N
        MngUserlabel.setText("User Management");

        javax.swing.GroupLayout mngUsrButtonLayout = new javax.swing.GroupLayout(mngUsrButton);
        mngUsrButton.setLayout(mngUsrButtonLayout);
        mngUsrButtonLayout.setHorizontalGroup(
            mngUsrButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mngUsrButtonLayout.createSequentialGroup()
                .addComponent(MngUserlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mngUsrButtonLayout.setVerticalGroup(
            mngUsrButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mngUsrButtonLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(MngUserlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        mngAdmin.add(mngUsrButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 323, 182, -1));

        mngEmployeeButton.setBackground(new java.awt.Color(8, 21, 49));
        mngEmployeeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mngEmployeeButtonMousePressed(evt);
            }
        });

        mngEmployeelbl.setBackground(new java.awt.Color(8, 21, 49));
        mngEmployeelbl.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        mngEmployeelbl.setForeground(new java.awt.Color(255, 255, 255));
        mngEmployeelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mngEmployeelbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Employeex32.png"))); // NOI18N
        mngEmployeelbl.setText("Employee Management");

        javax.swing.GroupLayout mngEmployeeButtonLayout = new javax.swing.GroupLayout(mngEmployeeButton);
        mngEmployeeButton.setLayout(mngEmployeeButtonLayout);
        mngEmployeeButtonLayout.setHorizontalGroup(
            mngEmployeeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
            .addGroup(mngEmployeeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mngEmployeeButtonLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(mngEmployeelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        mngEmployeeButtonLayout.setVerticalGroup(
            mngEmployeeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
            .addGroup(mngEmployeeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mngEmployeeButtonLayout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(mngEmployeelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(31, Short.MAX_VALUE)))
        );

        mngAdmin.add(mngEmployeeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 220, -1, -1));

        userProcessContainer.setBackground(new java.awt.Color(8, 21, 49));
        userProcessContainer.setMaximumSize(null);
        userProcessContainer.setMinimumSize(null);
        userProcessContainer.setPreferredSize(null);
        userProcessContainer.setLayout(new java.awt.CardLayout());
        mngAdmin.add(userProcessContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        jPanel1.add(mngAdmin);
        mngAdmin.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void mngEmployeeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mngEmployeeButtonMousePressed
        // TODO add your handling code here:
        setColor(mngEmployeeButton);
        resetColor(new JPanel[]{mngOrganizationButton,mngUsrButton});
        System.out.println(enterprise.getOrganizationDirectory());
        System.out.println("Hi");
        System.out.println(enterprise);
        System.out.println("Hi");
        ManageEmpJPanel manageEmp = new ManageEmpJPanel(enterprise.getOrganizationDirectory(),enterprise);
        userProcessContainer.add("ManageEmpJPanel",manageEmp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_mngEmployeeButtonMousePressed

    private void mngUsrButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mngUsrButtonMousePressed
        // TODO add your handling code here:
        setColor(mngUsrButton);
        resetColor(new JPanel[]{mngOrganizationButton,mngEmployeeButton});
        ManageUserJPanel manageUser = new ManageUserJPanel(userProcessContainer,enterprise,system);
        userProcessContainer.add("ManageOrgsJPanel1",manageUser);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_mngUsrButtonMousePressed

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        // TODO add your handling code here:
        this.dispose();
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_backMousePressed

    private void mngOrganizationButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mngOrganizationButtonMousePressed
        // TODO add your handling code here:
        setColor(mngOrganizationButton);
        resetColor(new JPanel[]{mngEmployeeButton,mngUsrButton});
        ManageOrgsJPanel manageOrgs = new ManageOrgsJPanel(enterprise.getOrganizationDirectory(),enterprise);
        userProcessContainer.add("ManageOrgsJPanel",manageOrgs);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_mngOrganizationButtonMousePressed

 private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(50, 62, 168));
    }
    
    private void resetColor(JPanel [] pane)
    {
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(23,35,51));
           
        } 
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MngUserlabel;
    private javax.swing.JLabel back;
    private javax.swing.JLabel jMngOrganizationLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mngAdmin;
    private javax.swing.JPanel mngEmployeeButton;
    private javax.swing.JLabel mngEmployeelbl;
    private javax.swing.JPanel mngOrganizationButton;
    private javax.swing.JPanel mngUsrButton;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
