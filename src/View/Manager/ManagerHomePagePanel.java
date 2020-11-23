/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Manager;

import Controller.SwitchEmployeeSchedulePanelController;

/**
 *
 * @author HieuHoang
 */
public class ManagerHomePagePanel extends javax.swing.JPanel {
    private ManagerFrame managerFrame;

    /**
     * Creates new form ManagerHomePage
     */
    public ManagerHomePagePanel(ManagerFrame managerFrame) {
        this.managerFrame = managerFrame;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        ManagerNameLable = new javax.swing.JLabel();
        ManagerProfileButton = new javax.swing.JButton();
        ManageWorkScheduleButton = new javax.swing.JButton();
        ExportSalaryButton = new javax.swing.JButton();
        ManageEmployeeButton = new javax.swing.JButton();
        ExportScheduleButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 960));

        ManagerNameLable.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        ManagerNameLable.setText("Hello,");

        ManagerProfileButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        ManagerProfileButton.setText("Profile");
        ManagerProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerProfileButtonActionPerformed(evt);
            }
        });

        ManageWorkScheduleButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        ManageWorkScheduleButton.setText("Manage Work Schedule");
        ManageWorkScheduleButton.setPreferredSize(new java.awt.Dimension(300, 80));
        ManageWorkScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageWorkScheduleButtonActionPerformed(evt);
            }
        });

        ExportSalaryButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        ExportSalaryButton.setText("Export All Employee's Salary");
        ExportSalaryButton.setPreferredSize(new java.awt.Dimension(300, 80));
        ExportSalaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportSalaryButtonActionPerformed(evt);
            }
        });

        ManageEmployeeButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        ManageEmployeeButton.setText("Manage Employee");
        ManageEmployeeButton.setPreferredSize(new java.awt.Dimension(300, 80));
        ManageEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageEmployeeButtonActionPerformed(evt);
            }
        });

        ExportScheduleButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        ExportScheduleButton.setText("Export This Month Schedule");
        ExportScheduleButton.setPreferredSize(new java.awt.Dimension(300, 80));
        ExportScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportScheduleButtonActionPerformed(evt);
            }
        });

        ExitButton.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(ManagerNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ManagerProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ManageEmployeeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                                        .addComponent(ExportScheduleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ManageWorkScheduleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                                        .addComponent(ExportSalaryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ManagerNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ManagerProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(201, 201, 201)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ManageWorkScheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ManageEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(189, 189, 189)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ExportScheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ExportSalaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>

    private void ManagerProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ManageWorkScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        SwitchEmployeeSchedulePanelController switchEmployeeSchedulePanelController = new SwitchEmployeeSchedulePanelController(managerFrame);
        managerFrame.setJPanel(switchEmployeeSchedulePanelController.getManageEmployeeSchedulePanel());
    }

    private void ExportSalaryButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ExportScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ManageEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    // Variables declaration - do not modify
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton ExportSalaryButton;
    private javax.swing.JButton ExportScheduleButton;
    private javax.swing.JButton ManageEmployeeButton;
    private javax.swing.JButton ManageWorkScheduleButton;
    private javax.swing.JLabel ManagerNameLable;
    private javax.swing.JButton ManagerProfileButton;
    // End of variables declaration
}
