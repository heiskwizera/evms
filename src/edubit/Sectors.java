/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edubit;

import java.awt.Image;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ThinkPad
 */
public final class Sectors extends javax.swing.JFrame {

    Connection conn = db.java_db();
    ;
    ResultSet rs = null;
    PreparedStatement pst = null;
    int result;

//   public int GenerateRegno() {
//        try {
//            String sql = "select Count(Secid) as Numbers from SECTORS";
//            pst = conn.prepareStatement(sql);
//            rs = pst.executeQuery();
//
//            if (rs.next()) {
//                result = (rs.getInt(1));
//            }
//        } catch (SQLException e) {
//        }
//
//        int regno = result + 1;
//        int regvalue = regno;
//        depNo.setText(String.valueOf(regvalue));
//        return regvalue;
//    }

    private void Update_table() {
        try {
            String sql = "select * from SECTORS";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            sectorsdata.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error HERE : " + e);
        }
    }

    /**
     * Creates new form Home_Data
     */
    /**
     * Creates new form Sectors
     */
    public Sectors() {
        initComponents();
        SchoolInfo();
        Update_table();
        //GenerateRegno();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sectorsdata = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cmd_save = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txt_sec = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        depNo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_emp = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        lbl_img = new javax.swing.JLabel();
        schoolName = new javax.swing.JLabel();
        about = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SCHOOL DEPARTMENTS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 28))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("SECTORS IN SCHOOL");

        sectorsdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        sectorsdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sectorsdataMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sectorsdataMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(sectorsdata);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        cmd_save.setIcon(new javax.swing.ImageIcon("C:\\Users\\ThinkPad\\Documents\\NetBeansProjects\\RPEMS\\images\\Save-icon.png")); // NOI18N
        cmd_save.setText("Save");
        cmd_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_saveActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ThinkPad\\Documents\\NetBeansProjects\\RPEMS\\images\\update icon.png")); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ThinkPad\\Documents\\NetBeansProjects\\RPEMS\\images\\delete_16x16.gif")); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ThinkPad\\Documents\\NetBeansProjects\\RPEMS\\images\\erase-128.png")); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("    OPERATIONS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(cmd_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmd_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(15, 15, 15)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txt_sec.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_secActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("SECTOR NAME");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("DepNo");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("ADD NEW DEPARTMENT");

        depNo.setEditable(false);
        depNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        depNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depNoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                depNoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                depNoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                depNoMousePressed(evt);
            }
        });
        depNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depNoActionPerformed(evt);
            }
        });

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(depNo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(depNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(157, 157, 157))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3)))
                .addGap(150, 150, 150))
        );

        jPanel2.setBackground(new java.awt.Color(55, 60, 68));
        jPanel2.setForeground(java.awt.Color.darkGray);
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 182, 320, 0));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\ThinkPad\\Documents\\NetBeansProjects\\RPEMS\\images\\cover_photo.png")); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 430, 180));

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\ThinkPad\\Documents\\NetBeansProjects\\RPEMS\\images\\bgg1.jpg")); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 200, 170));

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\ThinkPad\\Documents\\NetBeansProjects\\RPEMS\\images\\search_20px_1.png")); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));
        jPanel2.add(txt_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jDesktopPane2.setLayer(lbl_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_img, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_img, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jDesktopPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 200, 150));

        schoolName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        schoolName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(schoolName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 420, 30));

        about.setBackground(new java.awt.Color(55, 60, 68));
        about.setForeground(new java.awt.Color(255, 255, 255));
        about.setIcon(new javax.swing.ImageIcon("C:\\Users\\ThinkPad\\Documents\\NetBeansProjects\\RPEMS\\images\\about.png")); // NOI18N
        about.setText("About us");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        jPanel2.add(about, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 100, 30));

        jMenu2.setText("Options");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ThinkPad\\Documents\\NetBeansProjects\\RPEMS\\images\\about.png")); // NOI18N
        jMenuItem5.setText("About Us");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ThinkPad\\Documents\\NetBeansProjects\\RPEMS\\images\\delete_16x16.gif")); // NOI18N
        jMenuItem3.setText("Close Window");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_secActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_secActionPerformed

    private void cmd_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_saveActionPerformed
        if (txt_sec.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Department Filled", "BR Software Resolution", 0);
        } else {
            int Confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?", "BR Software Resolution", JOptionPane.YES_NO_OPTION);
            if (Confirm == 0) {
                String sector = txt_sec.getText();
                try {
                    pst = conn.prepareStatement("INSERT INTO SECTORS(SECNAME)VALUES(?)");
                    pst.setString(1, sector);
                    int exec = pst.executeUpdate();
                    if (exec > 0) {
                        JOptionPane.showMessageDialog(null, "Department " + sector + " Has been Added Successfully", "BR Software Resolution", JOptionPane.INFORMATION_MESSAGE);
                        ClearFields();
                        Update_table();
                    }
                } catch (SQLException ex) {
                    System.out.print(ex.getMessage());
                }
            }
        }

    }//GEN-LAST:event_cmd_saveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txt_sec.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Update Cannot Support Empty Field", "BR Software Resolution", 0);
        } else {
            int Confirm = JOptionPane.showConfirmDialog(null, "Are You Sure You want to Commit Changes", "BR Software Resolution", JOptionPane.YES_NO_OPTION);
            if (Confirm == 0) {
                String sector = txt_sec.getText();
                int id = Integer.parseInt(depNo.getText());
                try {
                    String updator = "UPDATE SECTORS SET SECNAME=? WHERE SECID=?";
                    pst = conn.prepareStatement(updator);
                    pst.setString(1, sector);
                    pst.setInt(2, id);
               
                    int runnable = pst.executeUpdate();
                    if(runnable>0){
                     JOptionPane.showMessageDialog(null, "Updated Successfully", "BR Software Resolution", 1);
                     ClearFields();
                     Update_table();
                     
                    }

                } catch (SQLException e) {
                    System.out.print(e.getMessage());
                }

            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         if (txt_sec.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null, "You Can Delete Nothing", "BR Software Resolution", 0);
        } else {
            int Confirm = JOptionPane.showConfirmDialog(null, "Are You Sure You want to Delete", "BR Software Resolution", JOptionPane.YES_NO_OPTION);
            if (Confirm == 0) {
                String sector = txt_sec.getText();
                int id = Integer.parseInt(depNo.getText());
                try {
      
                    String updator = "DELETE FROM SECTORS WHERE SECID=?";
                    
                    pst = conn.prepareStatement(updator);
                    
                    pst.setInt(1, id);
               
                    int runnable = pst.executeUpdate();
                    if(runnable>0){
                     JOptionPane.showMessageDialog(null, "Deleted Successfully", "BR Software Resolution", 1);
                     ClearFields();
                     Update_table();
                     
                    }

                } catch (SQLException e) {
                    System.out.print(e.getMessage());
                }

            }

        }         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ClearFields();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        //        // TODO add your handling code here:
        //        int x = evt.getXOnScreen();
        //        int y = evt.getYOnScreen();
        //        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        //        // TODO add your handling code here:
        //        xx = evt.getX();
        //        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void sectorsdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sectorsdataMouseClicked
        
        int[] StudentRow = sectorsdata.getSelectedRows();
        int row = StudentRow[0];
        Object identity = sectorsdata.getValueAt(row, 0);
        String id = String.valueOf(identity);
        int value = Integer.parseInt(id);
        Search(value);
        cmd_save.setEnabled(false);
     
        
        
    }//GEN-LAST:event_sectorsdataMouseClicked

    private void depNoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depNoMouseEntered
     
    }//GEN-LAST:event_depNoMouseEntered

    private void depNoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depNoMouseExited
       
    }//GEN-LAST:event_depNoMouseExited

    private void depNoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depNoMousePressed
      JOptionPane.showMessageDialog(null, "ID IS AUTO-GENERATED", "BR Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_depNoMousePressed

    private void depNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depNoMouseClicked
     JOptionPane.showMessageDialog(null, "ID IS AUTO-GENERATED", "BR Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_depNoMouseClicked

    private void depNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depNoActionPerformed

    private void sectorsdataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sectorsdataMouseExited
     // cmd_save.setVisible(false);
    }//GEN-LAST:event_sectorsdataMouseExited

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new About_Us().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        new About_Us().setVisible(true);
    }//GEN-LAST:event_aboutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sectors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sectors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sectors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sectors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sectors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about;
    private javax.swing.JButton cmd_save;
    private javax.swing.JTextField depNo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JLabel schoolName;
    private javax.swing.JTable sectorsdata;
    private javax.swing.JLabel txt_emp;
    private javax.swing.JTextField txt_sec;
    // End of variables declaration//GEN-END:variables

    private void Search(int id) {

        String sql = "select * from SECTORS where SECID=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                int add1 = rs.getInt("SECID");
                depNo.setText(String.valueOf(add1));

                String add2 = rs.getString("SECNAME");
                txt_sec.setText(add2);
            }

            //byte[] img = rs.getBytes("Image");
            //imageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_SMOOTH));
            //lbl_img.setIcon(imageIcon);
        } catch (SQLException e) {
            System.out.print("Caught : " + e);
        }
    }

    private void ClearFields() {
        depNo.setText("");
        txt_sec.setText("");
        sectorsdata.clearSelection();
        cmd_save.setEnabled(true);
    }
    private void SchoolInfo() {
        try {
        pst = conn.prepareStatement("SELECT * FROM SCHOOL_INFO");
        rs = pst.executeQuery();
        if(rs.next()){
          schoolName.setText(rs.getString("SchoolName"));
           Blob filenameBlob = rs.getBlob("Logo");
                byte[] content = filenameBlob.getBytes(1L, (int) filenameBlob.length());
                ImageIcon ik = new ImageIcon(content);
                Image img = ik.getImage();
                //ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_DEFAULT));
                Image newimg = img.getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_DEFAULT);
                ik = new ImageIcon(newimg);
                lbl_img.setIcon(ik);
        }
        } catch (SQLException e) {
        }
       
    }
}
