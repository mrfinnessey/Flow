package flow;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flow {
	static List<Sheet> sheets = new ArrayList<Sheet>();
	static int currentSheetIndex = -1;
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
		addSheet.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e) {
				sheets.add(new Sheet(true, "Framework", 0));
				currentSheetIndex++;
			}
		});
		addSheet.setBounds(0, (int) (screenSize.getHeight() - 160), 50, 50);
		panel.add(addSheet);
		frame.pack();
		frame.setTitle("Flow Alpha");
		frame.setVisible(true);
		
	}
	
	private void processText(String text) {
		
	}
}