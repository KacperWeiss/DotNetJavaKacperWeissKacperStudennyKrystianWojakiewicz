import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class InvisibleDialog extends JDialog{
	
	private static final long serialVersionUID = 1L;
	
	public InvisibleDialog() {
		setAlwaysOnTop(true);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		setResizable(true);
		Rectangle bounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
		this.setBounds(bounds);
	}
}
