package chewy;

import javax.swing.UIManager;

/**
 * <h1>Chewy Calculator
 * <h1>The Chewy Calculator is a simple calculator that performs the basic
 * arithmetic operations on integers.
 * <p>
 * <b>Note:</b> The calculator performs operations on the primitive Integer
 * type.
 * 
 * @author John J. Garza
 * @version 0.5
 * @since 2016-11-3
 */
public class Main {

	/**
	 * This is the main method with uses CalculatorGUI class to set up the GUI
	 * of the calculator.
	 * 
	 * @param args Unused
	 */
	public static void main(String[] args) {
		try {

			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				CalculatorGUI.createGUI();
			}
		});

	}

}
