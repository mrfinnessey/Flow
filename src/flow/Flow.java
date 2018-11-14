package flow;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel(null);
		frame.add(panel);
		frame.setSize((int) screenSize.getWidth(), (int) screenSize.getHeight());
		panel.setPreferredSize(new Dimension((int) screenSize.getWidth(), (int) screenSize.getHeight()));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton addSheet = new JButton("+");
		addSheet.setBounds(0, (int) (screenSize.getHeight() - 160), 50, 50);
		panel.add(addSheet);
		frame.pack();
		frame.setVisible(true);
		
	}

}
