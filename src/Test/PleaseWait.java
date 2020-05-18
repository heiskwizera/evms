
package Test;

import java.awt.BorderLayout;
import java.awt.Dialog.ModalityType;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.*;

public class PleaseWait{
  
    
 
    public static void main(String[] args) {
         PleaseWait fromIn = new PleaseWait();
         fromIn.Waiter();
        
    }
   
   
   
    public void Waiter() {
        
        int msg;
        JButton showWaitBtn = new JButton(new ShowWaitAction("Continue ?", msg = JOptionPane.showConfirmDialog(null, "Sure", "BR SOFT", JOptionPane.YES_NO_OPTION)));
        if (msg != 0) {
            System.exit(0);
        }
        JPanel panel = new JPanel();
        panel.add(showWaitBtn);
        JFrame frame = new JFrame("Frame");
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
  
}


public class ShowWaitAction extends AbstractAction {
public String fx;

        private ShowWaitAction() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }


        public void setFx(String fx) {
            this.fx = fx;
        }

        public String getFx() {
            return fx;
        }

        public ShowWaitAction(String fx) {
            this.fx = fx;
        }
       
     
    

    protected static final long SLEEP_TIME = 3 * 1000;

    public ShowWaitAction(String name, int cancel) {
        super(name);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        startWait(evt);
    }
    // ActionEvent event;
    
   String x;
    public void startWait(ActionEvent event) {
        SwingWorker<Void, Void> mySwingWorker = new SwingWorker<Void, Void>() {
            @Override
            public Void doInBackground() throws InterruptedException{
               x  = ShowWaitAction.this.getFx();
                Thread.sleep(SLEEP_TIME);
                return null;
            }
        };

        Window win = SwingUtilities.getWindowAncestor((AbstractButton) event.getSource());
        final JDialog dialog = new JDialog(win, "Dialog", ModalityType.APPLICATION_MODAL);

        mySwingWorker.addPropertyChangeListener(new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if (evt.getPropertyName().equals("state")) {
                    if (evt.getNewValue() == SwingWorker.StateValue.DONE) {
                        dialog.dispose();
                        System.exit(0);
                    }
                }
            }
        });
        mySwingWorker.execute();

        JProgressBar progressBar = new JProgressBar();
        progressBar.setIndeterminate(true);
        
        JLabel msgLabel = new JLabel();
        JLabel imageLabel = new JLabel();
        msgLabel.setText("Processing... please wait.");
        ImageIcon clockIcon = new javax.swing.ImageIcon("C:\\Users\\ThinkPad\\Documents\\NetBeansProjects\\RPEMS\\images\\loader.gif");
        imageLabel.setIcon(clockIcon);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(progressBar, BorderLayout.CENTER);
        panel.add(msgLabel, BorderLayout.PAGE_START);
       panel.add(imageLabel, BorderLayout.WEST);
//        panel.add(new JLabel("Please wait......"), );
        dialog.add(panel);
        dialog.pack();
        dialog.setLocationRelativeTo(win);
        dialog.setVisible(true);
    }

}
}