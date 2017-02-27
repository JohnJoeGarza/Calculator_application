/**
 * 
 */
package chewy;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * This class creates the GUI of the calculator.
 * @author John J. Garza
 *
 */
public class CalculatorGUI {
	
	/**
	 * This method creates the GUI using Swing components and utilizes the class KeyboardGUI
	 * to create the buttons on the calculator.
	 * @see KeyboardGUI
	 */
	public static void createGUI(){
		Dimension minWindowSize= new Dimension(500,300);
		KeyboardGUI kG = new KeyboardGUI();

		JFrame frame = new JFrame("Chewy Calculator V 1.0");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setSize(500, 300);
		frame.setMinimumSize(minWindowSize);
		
		frame.add(kG.getTheText(),BorderLayout.CENTER);
		frame.add(kG.getTheNumbers(), BorderLayout.SOUTH);
		frame.setVisible(true);
	}

}
