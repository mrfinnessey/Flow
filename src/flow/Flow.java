package flow;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Flow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton addSheet = new JButton("Add Sheet");
		addSheet.setPreferredSize(new Dimension (50,50));
		frame.add(addSheet);
		addSheet.setLocation((int) (screenSize.getWidth() - 50), (int) (screenSize.getHeight() - 50));
		frame.setSize((int) screenSize.getWidth(), (int) screenSize.getHeight());
		frame.pack();
		frame.setVisible(true);
		
	}

}
