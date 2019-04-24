import java.awt.Color;

import javax.swing.JFrame;


public class TransparentFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TransparentFrame() {
		
		//JFrame setup//
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setAlwaysOnTop(true);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
	}
}
