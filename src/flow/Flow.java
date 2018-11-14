package flow;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Flow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize((int) screenSize.getWidth(), (int) screenSize.getHeight());
		frame.setVisible(true);
		
	}

}
