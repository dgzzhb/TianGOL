package us.tzheng.tiangol;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * This is the class for main window.
 * @author Tian
 * July 2012
 */

public class MainWindow {
	
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 200;
	private JTextField inText = new JTextField(13);
	private JTextArea outText = new JTextArea(7,20);
	
	/**
	 * Constructor of MainWindow
	 */
	public MainWindow() {
		setupGUI();
	}

	/**
	 * Setup GUI for Main Window
	 */
	private void setupGUI() {
		JFrame frame = new JFrame("满汉英词典");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel in = new JPanel();
		JPanel out = new JPanel();
		JButton button = new JButton("查询");
		in.add(inText);
		in.add(button);
		outText.setLineWrap(true);
		out.add(outText);
		
		/*button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});	*/	
		
		frame.add(in, BorderLayout.NORTH);
		frame.add(out, BorderLayout.CENTER);
		frame.pack();
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setVisible(true);
	}
	
}
