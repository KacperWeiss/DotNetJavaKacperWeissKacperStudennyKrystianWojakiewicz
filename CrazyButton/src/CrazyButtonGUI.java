import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class CrazyButtonGUI {

	private TransparentFrame frame;
	private InvisibleDialog invDialog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrazyButtonGUI window = new CrazyButtonGUI();
					//window.invDialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CrazyButtonGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
	    //Initialize the Invisible Dialog//
		InvisibleDialog invDialog = new InvisibleDialog();
		
		//Setup Action for Binding//
				Action closeAction = new AbstractAction(){
			        
					private static final long serialVersionUID = 1L;

					public void actionPerformed(ActionEvent e){
			        	int choice = JOptionPane.showConfirmDialog(frame, "Do you want to kill the Button :( ?");
			            if(choice == 0) {
			            	System.exit(0);
			            }
			        }
			    };
			    
			    //Setup Input for Binding//
			    KeyStroke esc = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE,0);
			    ((JComponent) invDialog.getContentPane()).getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(esc, "closex");
			    ((JComponent) invDialog.getContentPane()).getActionMap().put("closex", closeAction);
		
		
		
		//GET SCREEN INFO//
		final Dimension screenDim = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		//invDialog.setSize(screenDim);
		CrazyButton btn = new CrazyButton(invDialog, screenDim);
	}
}
