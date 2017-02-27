package chewy;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * This class sets up the individual Jbuttons of the GUI as well as the JText
 * area.
 * 
 * @author John J. Garza
 *
 */
public class KeyboardGUI {
	private JTextArea theText;
	private JPanel theNumbers;
	private String display;

	/**
	 * Default Constructor
	 */
	KeyboardGUI() {
		this.setTheText(EditorPane());
		this.setTheNumbers(numeric());
		this.setDisplay("");
	}

	/**
	 * This method creates the Editor Pane where the numbers and calculations
	 * with be displayed.
	 * 
	 * @return JTextArea to be added a JFrame
	 */
	private JTextArea EditorPane() {
		Font textFont = new Font("Serif", Font.BOLD, 30);
		JTextArea textArea = new JTextArea(1, 0);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		textArea.setText("Hello");
		textArea.setFont(textFont);
		return textArea;

	}

	/**
	 * This method creates the individual buttons and sets up their actions.
	 * This method utilizes the Calculations class to perform logic and
	 * arithmetic operations.
	 * 
	 * @return JPanel to be added to a JFrame
	 * @see Calculations
	 */
	private JPanel numeric() {
		Dimension buttonDim = new Dimension(30, 30);
		JPanel numbersPanel = new JPanel();
		numbersPanel.setSize(500, 500);
		GridLayout numbers = new GridLayout(5, 5, 10, 10);

		JButton oneButton = new JButton("1");
		oneButton.setPreferredSize(buttonDim);
		oneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay(getDisplay() + "1");
				getTheText().setText(getDisplay());
			}
		});

		JButton twoButton = new JButton("2");
		twoButton.setPreferredSize(buttonDim);
		twoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay(getDisplay() + "2");
				getTheText().setText(getDisplay());
			}
		});

		JButton threeButton = new JButton("3");
		threeButton.setPreferredSize(buttonDim);
		threeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay(getDisplay() + "3");
				getTheText().setText(getDisplay());
			}
		});

		JButton fourButton = new JButton("4");
		fourButton.setPreferredSize(buttonDim);
		fourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay(getDisplay() + "4");
				getTheText().setText(getDisplay());
			}
		});

		JButton fiveButton = new JButton("5");
		fiveButton.setPreferredSize(buttonDim);
		fiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay(getDisplay() + "5");
				getTheText().setText(getDisplay());
			}
		});

		JButton sixButton = new JButton("6");
		sixButton.setPreferredSize(buttonDim);
		sixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay(getDisplay() + "6");
				getTheText().setText(getDisplay());
			}
		});

		JButton sevenButton = new JButton("7");
		sevenButton.setPreferredSize(buttonDim);
		sevenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay(getDisplay() + "7");
				getTheText().setText(getDisplay());
			}
		});

		JButton eightButton = new JButton("8");
		eightButton.setPreferredSize(buttonDim);
		eightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay(getDisplay() + "8");
				getTheText().setText(getDisplay());
			}
		});

		JButton nineButton = new JButton("9");
		nineButton.setPreferredSize(buttonDim);
		nineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay(getDisplay() + "9");
				getTheText().setText(getDisplay());
			}
		});

		JButton zeroButton = new JButton("0");
		zeroButton.setPreferredSize(buttonDim);
		zeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay(getDisplay() + "0");
				getTheText().setText(getDisplay());
			}
		});

		JButton openParenButton = new JButton("(");
		openParenButton.setPreferredSize(buttonDim);
		openParenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay(getDisplay() + "(");
				getTheText().setText(getDisplay());
			}
		});

		JButton closeParenButton = new JButton(")");
		closeParenButton.setPreferredSize(buttonDim);
		closeParenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay(getDisplay() + ")");
				getTheText().setText(getDisplay());
			}
		});

		JButton equalsButton = new JButton("=");
		equalsButton.setPreferredSize(buttonDim);
		equalsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setDisplay(Calculations.calculateLine(getDisplay()));
				getTheText().setText(getDisplay());
				System.out.println(Calculations.calculateLine(getDisplay()));
			}
		});

		JButton plusButton = new JButton("+");
		plusButton.setPreferredSize(buttonDim);
		plusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay(getDisplay() + " + ");
				getTheText().setText(getDisplay());
			}
		});

		JButton minusButton = new JButton("-");
		minusButton.setPreferredSize(buttonDim);
		minusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay(getDisplay() + " - ");
				getTheText().setText(getDisplay());
			}
		});

		JButton multiplyButton = new JButton(Character.toString((char) 215));
		multiplyButton.setPreferredSize(buttonDim);
		multiplyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay(getDisplay() + " " + Character.toString((char) 215) + " ");
				getTheText().setText(getDisplay());
			}
		});

		JButton divisionButton = new JButton(Character.toString((char) 247));
		divisionButton.setPreferredSize(buttonDim);
		divisionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay(getDisplay() + " " + (Character.toString((char) 247)) + " ");
				getTheText().setText(getDisplay());
			}
		});

		JButton backButton = new JButton();
		try {
			Image back = ImageIO.read(getClass().getResource("/images/backspace_to_left.png"));
			back = back.getScaledInstance(20, 20, 0);
			backButton.setIcon(new ImageIcon(back));
		} catch (IOException ex) {
		}

		backButton.setPreferredSize(buttonDim);
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (getDisplay().isEmpty())
					return;
				else {
					StringBuilder sb = new StringBuilder(getDisplay());
					sb.deleteCharAt(sb.length() - 1);
					setDisplay(sb.toString());
					getTheText().setText(getDisplay());
				}
			}
		});

		JButton clearButton = new JButton("C");
		clearButton.setPreferredSize(buttonDim);
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDisplay("");
				getTheText().setText(getDisplay());
			}
		});

		JButton empty1Button = new JButton();
		try {
			Image smiley = ImageIO.read(getClass().getResource("/images/Help.png"));
			smiley = smiley.getScaledInstance(20, 20, 0);
			empty1Button.setIcon(new ImageIcon(smiley));
		} catch (IOException ex) {
		}
		empty1Button.setPreferredSize(buttonDim);
		empty1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("empty1 button");
			}
		});

		JButton empty2Button = new JButton("empty");
		empty2Button.setPreferredSize(buttonDim);
		empty2Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("empty2 button");
			}
		});

		numbersPanel.setLayout(numbers);
		numbersPanel.add(empty1Button);
		numbersPanel.add(backButton);
		numbersPanel.add(clearButton);
		numbersPanel.add(divisionButton);
		numbersPanel.add(oneButton);
		numbersPanel.add(twoButton);
		numbersPanel.add(threeButton);
		numbersPanel.add(multiplyButton);
		numbersPanel.add(fourButton);
		numbersPanel.add(fiveButton);
		numbersPanel.add(sixButton);
		numbersPanel.add(minusButton);
		numbersPanel.add(sevenButton);
		numbersPanel.add(eightButton);
		numbersPanel.add(nineButton);
		numbersPanel.add(plusButton);
		numbersPanel.add(openParenButton);
		numbersPanel.add(zeroButton);
		numbersPanel.add(closeParenButton);
		numbersPanel.add(equalsButton);

		return numbersPanel;

	}

	/**
	 * Getter method for class variable theText.
	 * 
	 * @return JTextArea
	 */
	public JTextArea getTheText() {
		return theText;
	}

	/**
	 * Setter method for class variable theText.
	 * 
	 * @param theText
	 */
	public void setTheText(JTextArea theText) {
		this.theText = theText;
	}

	/**
	 * Getter method for class variable theNumbers.
	 * 
	 * @return JPanel
	 */
	public JPanel getTheNumbers() {
		return theNumbers;
	}

	/**
	 * Setter method for the class variable theNumbers.
	 * 
	 * @param theNumbers
	 */
	public void setTheNumbers(JPanel theNumbers) {
		this.theNumbers = theNumbers;
	}

	/**
	 * Getter method for the class variable display.
	 * 
	 * @return String
	 */
	public String getDisplay() {
		return display;
	}

	/**
	 * Setter method for the class variable display.
	 * 
	 * @param display
	 */
	public void setDisplay(String display) {
		this.display = display;
	}

}
