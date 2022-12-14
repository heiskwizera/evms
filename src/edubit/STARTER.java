/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edubit;

import edubit.UsersCreate;
import edubit.db;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ThinkPad
 */
public class STARTER extends javax.swing.JFrame {
 Connection conn = db.java_db();
    ;
    ResultSet rs = null;
    PreparedStatement pst = null;
       private ImageIcon format = null;
    //strin filename
    String filename = null;
    byte[] school_logo = null;

    /**
     * Creates new form STARTER
     */
    public STARTER() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        txt_emp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        sklname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        post = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        province = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        dst = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        sect = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        lbl_img = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cmd_save = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BR Software Resolution");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(55, 60, 68));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 490, 200));
        jPanel2.add(txt_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 220, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 60, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("   SCHOOL START-UP REGISTRATION");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("School Name");

        sklname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Postal Code");

        post.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        post.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Province");

        province.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        province.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Province", "Kigali", "Southern", "Western", "Northern", "Eastern" }));
        province.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                provincePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("District");

        dst.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select District" }));
        dst.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                dstPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Sector");

        sect.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Sector" }));
        sect.setToolTipText("");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jDesktopPane1.setLayer(lbl_img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_img, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_img, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("BROWSE LOGO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cmd_save.setIcon(new javax.swing.ImageIcon("C:\\Users\\ThinkPad\\Documents\\NetBeansProjects\\RPEMS\\images\\Save-icon.png")); // NOI18N
        cmd_save.setText("Save Registration");
        cmd_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_saveActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sklname)
                    .addComponent(post, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(province, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dst, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jButton1))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(cmd_save)))
                        .addGap(0, 86, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sklname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(post)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(province, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dst, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sect, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmd_save, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void postActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postActionPerformed

    private void cmd_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_saveActionPerformed

        String sklName = sklname.getText();
        String pcode = post.getText();
        String a = (String) province.getSelectedItem();
        String b = (String) dst.getSelectedItem();
        String c = (String) sect.getSelectedItem();
        String query = "insert into School_info (SchoolName,PostCode,Logo,Province,District,Sector) values(?,?,?,?,?,?)";
        if(a.equals("Select Province")||b.equals("Select District")||c.equals("Select Sector") || sklName.isEmpty()||pcode.isEmpty()||school_logo==null){
          JOptionPane.showMessageDialog(null, "Select All Required Fields And Browse LOGO", "BR Software Resolution", 0);
        }else{
        
            
//            try {
//                pst = conn.prepareStatement(query);
//                pst.setString(1, sklName);
//                pst.setString(2, pcode);
//                pst.setBytes(3, school_logo);
//                pst.setString(4, a);
//                pst.setString(5, b);
//                pst.setString(6, c);
//                
//                if(pst.executeUpdate()>0){
//                   x.stop();
//                   new UsersCreate().setVisible(true);
//                   this.dispose();
//                }
//            } catch (SQLException ex) {
//                x.stop();
//                JOptionPane.showMessageDialog(null,"Error is :"+ex);
//                System.err.println(ex);
//            }
          
        }
    }//GEN-LAST:event_cmd_saveActionPerformed

    private void provincePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_provincePopupMenuWillBecomeInvisible

        String prvnc = (String) province.getSelectedItem();
        if (prvnc.equals("Kigali")) {
            dst.removeAllItems();
            dst.addItem("Select District");
            dst.addItem("Gasabo");
            dst.addItem("Kicukiro");
            dst.addItem("Nyarugenge");
        } else if (prvnc.equals("Southern")) {
            dst.removeAllItems();
            dst.addItem("Select District");
            String southern[] = {"Gisagara", "Huye", "Kamonyi", "Muhanga", "Nyamagabe", "Nyanza", "Nyaruguru", "Ruhango"};
            for (int i = 0; i <= southern.length - 1; i++) {
                dst.addItem(southern[i]);
            }

        } else if (prvnc.equals("Western")) {
            dst.removeAllItems();
            dst.addItem("Select District");
            String western[] = {"Karongi", "Ngororero", "Nyabihu", "Nyamasheke", "Rubavu", "Rusizi", "Rutsiro"};
            for (int i = 0; i <= western.length - 1; i++) {
                dst.addItem(western[i]);
            }
        } else if (prvnc.equals("Northern")) {
            dst.removeAllItems();
            dst.addItem("Select District");
            String northen[] = {"Burera", "Gakenke", "Gicumbi", "Rulindo", "Musanze"};
            for (int i = 0; i <= northen.length - 1; i++) {
                dst.addItem(northen[i]);
            }
        } else if (prvnc.equals("Eastern")) {
            dst.removeAllItems();
            dst.addItem("Select District");
            String east[] = {"Nyagatare", "Gatsibo", "Kayonza", "Bugesera", "Kirehe", "Ngoma", "Rwamagana"};
            for (int i = 0; i <= east.length - 1; i++) {
                dst.addItem(east[i]);
            }
        }
        else if(prvnc.equals("Select Province")){
        dst.removeAllItems();
        dst.addItem("Select District");
        }
    }//GEN-LAST:event_provincePopupMenuWillBecomeInvisible

    private void dstPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_dstPopupMenuWillBecomeInvisible

        if (dst.getSelectedItem().equals("Gasabo")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Bumbogo", "Gatsata", "Jali", "Gikomero", "Gisozi", "Jabana", "Kinyinya", "Ndera", "Nduba", "Rusororo", "Rutunga", "Kacyiru", "Kimihurura", "Kimironko", "Remera"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        } else if (dst.getSelectedItem().equals("Kicukiro")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Gahanga", "Gatenga", "Gikondo", "Kagarama", "Kanombe", "Kicukiro", "Kigarama", "Masaka", "Niboye", "Nyarugunga"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        } else if (dst.getSelectedItem().equals("Nyarugenge")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Gitega", "Kanyinya", "Kigali", "Kimisagara", "Mageragere", "Muhima", "Nyakabanda", "Nyamirambo", "Nyarugenge", "Rwezamenyo"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        } else if (dst.getSelectedItem().equals("Gisagara")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Gikonko", "Gishubi", "Kansi", "Kibilizi", "Kigembe", "Mamba", "Muganza", "Mugombwa", "Mukindo", "Musha", "Ndora", "Nyanza", "Save"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        } else if (dst.getSelectedItem().equals("Huye")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Gishamvu", "Karama", "Kigoma", "Kinazi", "Maraba", "Mbazi", "Mukura", "Ngoma", "Ruhashya", "Huye", "Rusatira", "Rwaniro", "Simbi", "Tumba"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        } else if (dst.getSelectedItem().equals("Kamonyi")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Gacurabwenge", "Karama", "Kayenzi", "Kayumbu", "Mugina", "Musambira", "Ngamba", "Nyamiyaga", "Nyarubaka", "Rugalika", "Rukoma", "Runda"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        } else if (dst.getSelectedItem().equals("Muhanga")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Muhanga", "Cyeza", "Kibangu", "Kiyumba", "Mushishiro", "Kabacuzi", "Nyabinoni", "Nyamabuye", "Nyarusange", "Rongi", "Rugendabari", "Shyogwe"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        } else if (dst.getSelectedItem().equals("Nyamagabe")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Buruhukiro", "Cyanika", "Gatare", "Kaduha", "Kamegeli", "Kibirizi", "Kibumbwe", "Kitabi", "Mbazi", "Mugano", "Musange", "Musebeya", "Mushubi", "Nkomane", "Gasaka", "Tare", "Uwinkingi"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        } else if (dst.getSelectedItem().equals("Nyanza")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Busasamana", "Busoro", "Cyabakamyi", "Kibirizi", "Kigoma", "Mukingo", "Muyira", "Ntyazo", "Nyagisozi", "Rwabicuma"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        } else if (dst.getSelectedItem().equals("Ruhango")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Kinazi", "Byimana", "Bweramana", "Mbuye", "Ruhango", "Mwendo", "Kinihira", "Ntongwe", "Kabagari"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        } else if (dst.getSelectedItem().equals("Nyaruguru")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Cyahinda", "Busanze", "Kibeho", "Mata", "Munini", "Kivu", "Ngera", "Ngoma", "Nyabimata", "Nyagisozi", "Muganza", "Ruheru", "Ruramba", "Rusenge"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        } else if (dst.getSelectedItem().equals("Karongi")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Bwishyura", "Gishyita", "Gishari", "Gitesi", "Mubuga", "Murambi", "Murundi", "Mutuntu", "Rubengera", "Rugabano", "Ruganda", "Rwankuba", "Twumba"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        } else if (dst.getSelectedItem().equals("Nyabihu")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Bigogwe", "Jenda", "Jomba", "Kabatwa", "Karago", "Kintobo", "Mukamira", "Muringa", "Rambura", "Rugera", "Rurembo", "Shyira"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        } else if (dst.getSelectedItem().equals("Nyamasheke")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Ruharambuga", "Bushekeri", "Bushenge", "Cyato", "Gihombo", "Kagano", "Kanjongo", "Karambi", "Karengera", "Kirimbi", "Macuba", "Nyabitekeri", "Mahembe", "Rangiro", "Shangi"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        } else if (dst.getSelectedItem().equals("Rusizi")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Bugarama", "Butare", "Bweyeye", "Gikundamvura", "Gashonga", "Giheke", "Gihundwe", "Gitambi", "Kamembe", "Muganza", "Mururu", "Nkanka", "Nkombo", "Nkungu", "Nyakabuye", "Nyakarenzo", "Nzahaha", "Rwimbogo"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        } else if (dst.getSelectedItem().equals("Rubavu")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Bugeshi", "Busasamana", "Cyanzarwe", "Gisenyi", "Kanama", "Nyakiliba", "Nyamyumba", "Nyundo", "Rubavu", "Rugerero"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        } else if (dst.getSelectedItem().equals("Rutsiro")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Boneza", "Gihango", "Kigeyo", "Kivumu", "Munihira", "Mukura", "Murunda", "Musasa", "Mushonyi", "Mushubati", "Nyabirasi", "Ruhango", "Rusebeya"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        } else if (dst.getSelectedItem().equals("Nyagatare")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Rwimiyaga", "Karangazi", "Nyagatare", "Katabagemu", "Rukomo", "Tabagwe", "Musheli", "Gatunda", "Mimuli", "Karama", "Matimba", "Mukama", "Rwempasha", "Kiyombe"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        } else if (dst.getSelectedItem().equals("Gatsibo")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Gasange", "Gatsibo", "Gitoki", "Kabarore", "Kageyo", "Kiramuruzi", "Kiziguro", "Muhura", "Murambi", "Ngarama", "Nyagihanga", "Remera", "Rugarama", "Rwimbogo"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        }
         else if (dst.getSelectedItem().equals("Bugesera")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Gashora", "Juru", "Kamabuye", "Ntarama", "Mareba", "Mayange", "Musenyi", "Mwogo", "Ngeruka", "Nyamata", "Nyarugenge", "Rilima", "Ruhuha", "Rweru","Shyara"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        }
          else if (dst.getSelectedItem().equals("Kayonza")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Gahini", "Kabare","Kabarondo","Mukarange","Murama", "Murundi", "Mwiri", "Ndego", "Nyamirama", "Rukara", "Ruramira", "Rwinkwavu"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        }
          else if (dst.getSelectedItem().equals("Ngoma")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Gashanda", "Jarama","Karembo","Kazo","Kibungo", "Mugesera", "Murama", "Mutenderi", "Remera", "Rukira", "Rukumberi", "Rurenge","Sake","Zaza"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        }
         else if (dst.getSelectedItem().equals("Kirehe")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Gahara", "Gatore","Kigarama","Kigina","Kirehe", "Mahama", "Mpanga", "Musaza", "Mushikiri", "Nasho", "Nyamugari", "Nyarubuye"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        }
        else if (dst.getSelectedItem().equals("Rwamagana")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Fumbwe", "Gahengeri","Gishari","Karenge","Kigabiro", "Muhazi", "Munyaga", "Munyiginya", "Musha", "Muyumbu", "Mwulire", "Nyakariro","Nzige","Rubona"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        }
       else if (dst.getSelectedItem().equals("Burera")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Bungwe", "Butaro","Cyanika","Cyeru","Gahunga", "Gatebe", "Gitovu", "Kagogo", "Kinoni", "Kinyababa", "Kivuye", "Nemba","Rugarama","Rugendabari","Ruhunde","Rusarabuge","Rwerere"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        }
         else if (dst.getSelectedItem().equals("Gakenke")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Busengo", "Coko","Cyabingo","Gakenke","Gashenyi", "Mugunga", "Janja", "Kamubuga", "Karambo", "Kivuruga", "Mataba", "Minazi","Muhondo","Muyongwe","Muzo","Nemba","Ruli","Rusasa","Rushashi"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        }
          else if (dst.getSelectedItem().equals("Gicumbi")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Bukure", "Bwisige","Byumba","Cyumba","Giti", "Kaniga", "Manyagiro", "Miyove", "Kageyo", "Mukarange", "Muko", "Mutete","Nyamiyaga","Nyankenke II","Rubaya","Rukomo","Rushaki","Rutare","Ruvune","Rwamiko","Shangasha"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        }
          else if (dst.getSelectedItem().equals("Musanze")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Busogo", "Cyuve","Gacaca","Gashaki","Gataraga", "Kimonyi", "Kinigi", "Muhoza", "Muko", "Musanze", "Nkotsi","Nyange","Remera","Rwaza","Shingiro"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        }
          else if (dst.getSelectedItem().equals("Rulindo")) {
            sect.removeAllItems();
            sect.addItem("Select Sector");
            String kgl[] = {"Base", "Burega","Bushoki","Buyoga","Cyinzuzi", "Cyungo", "Kinihira", "Kisaro", "Masoro", "Mbogo", "Murambi","Ngoma","Ntarabana","Rukozo","Rusiga","Shyorongi","Tumba"};
            for (int i = 0; i <= kgl.length - 1; i++) {
                sect.addItem(kgl[i]);
            }
        }
          else if(dst.getSelectedItem().equals("Select District")){
            sect.removeAllItems();
            sect.addItem("Select Sector");
          }

    }//GEN-LAST:event_dstPopupMenuWillBecomeInvisible

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();

        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_DEFAULT));
        lbl_img.setIcon(imageIcon);
        try {

            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int readNum; (readNum = fis.read(buf)) != -1;) {

                bos.write(buf, 0, readNum);
            }
            school_logo = bos.toByteArray();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           JWorkingDlg x = new JWorkingDlg(null,true);
      
           x.start();
             
              int sum=0;
              for(int i=1;i<=100;i++){
                 sum = sum+i;
              }
              if(sum==5050){
              x.stop();
              }
           
            JOptionPane.showMessageDialog(null, sum);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(STARTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(STARTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(STARTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(STARTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new STARTER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_save;
    private javax.swing.JComboBox<String> dst;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JTextField post;
    private javax.swing.JComboBox<String> province;
    private javax.swing.JComboBox<String> sect;
    private javax.swing.JTextField sklname;
    private javax.swing.JLabel txt_emp;
    // End of variables declaration//GEN-END:variables
}
