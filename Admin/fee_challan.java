package Final_DBMS_Project.src.main.java.DB_project.Admin;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;

/**
 *
 * @author Hp
 */
public class fee_challan extends javax.swing.JFrame {

    /**
     * Creates new form challanForm
     */
    public fee_challan(int challan, int id, String name, int amount, String disc, String due, int fine) {
        initComponents(challan, id, name, amount, disc, due, fine);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents(int challan, int _id, String _name, int _amount, String _disc, String _due, int _fine) {

        form_label = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        Challan_form_label = new javax.swing.JLabel();
        roll_no_label = new javax.swing.JLabel();
        challan_no = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        add_course_dicsipline_label3 = new javax.swing.JLabel();
        roll_no = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        discipline = new javax.swing.JLabel();
        amount_label = new javax.swing.JLabel();
        fine_label = new javax.swing.JLabel();
        due_label = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        due = new javax.swing.JLabel();
        fine = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        form_label.setBackground(new java.awt.Color(0, 0, 51));

        jPanel8.setBackground(new java.awt.Color(255, 204, 0));
        jPanel8.setForeground(new java.awt.Color(255, 204, 0));

        jLabel13.setIcon(new ImageIcon("E:\\4th sem\\DBMS\\FINAL PROJECT\\src\\Final_DBMS_Project\\src\\resources\\logo snip.PNG")); // NOI18N

        close.setBackground(new java.awt.Color(0, 0, 51));
        close.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setText("print");
        close.setBorderPainted(false);
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel12)
                                                        .addComponent(jLabel13)))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(close)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                                .addComponent(close)
                                .addContainerGap())
        );

        Challan_form_label.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Challan_form_label.setForeground(new java.awt.Color(255, 204, 0));
        Challan_form_label.setText("Challan Form:");

        roll_no_label.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        roll_no_label.setForeground(new java.awt.Color(255, 204, 0));
        roll_no_label.setText("Roll no:");

        challan_no.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        challan_no.setForeground(new java.awt.Color(255, 204, 0));
        challan_no.setText("" + challan + "");

        name_label.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        name_label.setForeground(new java.awt.Color(255, 204, 0));
        name_label.setText("Name:");

        add_course_dicsipline_label3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        add_course_dicsipline_label3.setForeground(new java.awt.Color(255, 204, 0));
        add_course_dicsipline_label3.setText("Discipline:");

        roll_no.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        roll_no.setForeground(new java.awt.Color(255, 204, 0));
        roll_no.setText("" + _id + "");

        name.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        name.setForeground(new java.awt.Color(255, 204, 0));
        name.setText(_name);

        discipline.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        discipline.setForeground(new java.awt.Color(255, 204, 0));
        discipline.setText(_disc);

        amount_label.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        amount_label.setForeground(new java.awt.Color(255, 204, 0));
        amount_label.setText("amount:");

        fine_label.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        fine_label.setForeground(new java.awt.Color(255, 204, 0));
        fine_label.setText("past due fine:");

        due_label.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        due_label.setForeground(new java.awt.Color(255, 204, 0));
        due_label.setText("Due date:");

        amount.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        amount.setForeground(new java.awt.Color(255, 204, 0));
        amount.setText("" + _amount + "");

        due.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        due.setForeground(new java.awt.Color(255, 204, 0));
        due.setText("" + _due + "");

        fine.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        fine.setForeground(new java.awt.Color(255, 204, 0));
        fine.setText("" + _fine + "");

        javax.swing.GroupLayout form_labelLayout = new javax.swing.GroupLayout(form_label);
        form_label.setLayout(form_labelLayout);
        form_labelLayout.setHorizontalGroup(
                form_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(form_labelLayout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(form_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(form_labelLayout.createSequentialGroup()
                                                .addComponent(Challan_form_label, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                                                .addComponent(challan_no)
                                                .addGap(42, 42, 42))
                                        .addGroup(form_labelLayout.createSequentialGroup()
                                                .addGroup(form_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(roll_no_label)
                                                        .addComponent(name_label)
                                                        .addComponent(add_course_dicsipline_label3)
                                                        .addComponent(amount_label)
                                                        .addComponent(due_label)
                                                        .addComponent(fine_label))
                                                .addGap(86, 86, 86)
                                                .addGroup(form_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(fine)
                                                        .addComponent(name)
                                                        .addComponent(roll_no)
                                                        .addComponent(discipline)
                                                        .addComponent(amount)
                                                        .addComponent(due))
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        form_labelLayout.setVerticalGroup(
                form_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(form_labelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(form_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Challan_form_label)
                                        .addComponent(challan_no))
                                .addGap(26, 26, 26)
                                .addGroup(form_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(roll_no_label)
                                        .addComponent(roll_no))
                                .addGap(18, 18, 18)
                                .addGroup(form_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(name_label)
                                        .addComponent(name))
                                .addGap(18, 18, 18)
                                .addGroup(form_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(add_course_dicsipline_label3)
                                        .addComponent(discipline))
                                .addGap(18, 18, 18)
                                .addGroup(form_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(amount_label)
                                        .addComponent(amount))
                                .addGap(18, 18, 18)
                                .addGroup(form_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(due_label)
                                        .addComponent(due))
                                .addGap(18, 18, 18)
                                .addGroup(form_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(fine_label)
                                        .addComponent(fine))
                                .addGap(18, 18, 18)
                        )
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(form_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(form_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify
    private javax.swing.JLabel Challan_form_label;
    private javax.swing.JLabel add_course_dicsipline_label3;
    private javax.swing.JLabel amount;
    private javax.swing.JLabel amount_label;
    private javax.swing.JLabel challan_no;
    private javax.swing.JButton close;
    private javax.swing.JLabel discipline;
    private javax.swing.JLabel due;
    private javax.swing.JLabel due_label;
    private javax.swing.JLabel fine;
    private javax.swing.JLabel fine_label;
    private javax.swing.JPanel form_label;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel roll_no;
    private javax.swing.JLabel roll_no_label;
    // End of variables declaration
}
