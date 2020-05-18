/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edubit;

import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Spinner;
import javax.swing.*;

/**
 *
 * @author ThinkPad
 */
public class JWorkingDlg extends javax.swing.JDialog implements Runnable {
    private Thread thread;
    private Object sync = new Object();
    private boolean isRunning = false;
   
     public JWorkingDlg(JFrame parent, boolean modal) {
         super(parent, modal);
         thread = null;
         CentralizeWindow();
         initComponents1();
    }
   
     private void initComponents1() {
         JPanel mainPanel = new JPanel();
         JLabel msgLabel = new JLabel();
         JLabel imageLabel = new JLabel();
         mainPanel.setLayout(new BorderLayout());
         
         msgLabel.setText("Processing... please wait.");
         mainPanel.add(msgLabel, BorderLayout.CENTER);
         ImageIcon clockIcon = new javax.swing.ImageIcon("C:\\Users\\ThinkPad\\Documents\\NetBeansProjects\\RPEMS\\images\\loader.gif");
         imageLabel.setIcon(clockIcon);
         mainPanel.add(imageLabel, BorderLayout.WEST);
         getContentPane().add(mainPanel, BorderLayout.CENTER);
         pack();
         
         
    }

 public void start(){
        if (thread == null) {
             thread = new Thread(this);
        }
        isRunning = true;
        thread.start();
        // First make this visible..
        setVisible(true);
        repaint(); // Not sure if that's the method to use, could use invalidate(); the idea is to repaint the dialog's contents before returning to your main thread!
   }
   
    public void run(){
        while (isRunning) {
            synchronized (sync) {
                try {
                    JOptionPane.showMessageDialog(null, "Running");
                    sync.wait();
                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null,ex);
                }
            }
        }
   }
   
  public void stop(){
        if ((thread != null) && thread.isAlive() ){
             // Nullify the thread instance..
             thread = null;
             // Tell the dialog its not running anymore..
             isRunning = false;
             // Notify the sync object so we can get out of the loop..
             synchronized (sync) {
                 sync.notify();
             }
             // Set the dialog visibility to false so it'd disappear..
             this.setVisible(false);
        }
   }

    private void CentralizeWindow() {
        WindowSetter.sizeWindow(this);
    }
}