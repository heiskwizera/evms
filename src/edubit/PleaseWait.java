package edubit;

import Test.*;
import java.awt.BorderLayout;
import java.awt.Dialog.ModalityType;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.font.NumericShaper;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;
import java.util.function.Function;
import javax.swing.*;

public class PleaseWait extends AbstractAction {

    public PleaseWait() {
    }

    protected static final long SLEEP_TIME = 3 * 1000;

    public PleaseWait(String name, int cancel) {
        super(name);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        //  Waiter(evt);
    }

    public void geekExecute(ActionEvent event, SwingWorker<Void, String> mySwingWorker) {

        Window win = SwingUtilities.getWindowAncestor((AbstractButton) event.getSource());
        final JDialog dialog = new JDialog(win, "Dialog", ModalityType.APPLICATION_MODAL);
        mySwingWorker.addPropertyChangeListener(new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if (evt.getPropertyName().equals("state")) {
                    if (evt.getNewValue() == SwingWorker.StateValue.DONE) {
                        dialog.dispose();
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
