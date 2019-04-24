import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;


public class CrazyButton extends JButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CrazyButton(JFrame frame, final Dimension screenDim) {
		//BUTTON SETUP//
		final JButton btnPressMe = new JButton("PRESS ME!!");
		btnPressMe.setBounds(651, 304, 158, 70);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnPressMe);
		
		final Random rand = new Random();
		
		//Add Button Listener//
		btnPressMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int randomWidth = rand.nextInt(screenDim.width - btnPressMe.getSize().width);
				int randomHeight = rand.nextInt(screenDim.height - btnPressMe.getSize().height);
				btnPressMe.setLocation(randomWidth, randomHeight);
					}
				});
	}
}
