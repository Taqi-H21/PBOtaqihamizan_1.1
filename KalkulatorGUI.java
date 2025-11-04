import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class KalkulatorGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel KalkulatorGUI;
	private JTextField textField;
	private double operand1 = 0;
	private String operator = null;
	private boolean startNewNumber = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KalkulatorGUI frame = new KalkulatorGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/*
	private void inputDigit (String digit) {
		if (startNewNumber) {
			textField.setText(digit);
			startNewNumber = false;
		} else {
			if (textField.getText().length() < 16) {
				textField.setText(textField.getText() + digit);
			}
		}
	}
	
	private void resetCalculator () {
		textField.setText("0");
		operand1 = 0;
		operator = null;
		startNewNumber = true;
	}
	
	private void calculateResult () {
		if (operator == null || startNewNumber) return;
		try {
			double operand2 = Double.parseDouble(textField.getText());
			double result = 0;
			switch (operator) {
			case "+":
				result = operand1 + operand2;
				break;
			case "-":
				result = operand1 - operand2;
				break;
			case "÷":
				result = operand1 / operand2;
				break;
			case "×":
				result = operand1 * operand2;
				break;
			case "%":
				result = operand1 % operand2;
				break;
			}
			if (result == (long) result) {
				textField.setText(String.format("%d", (long) result));
			} else {
				textField.setText(String.valueOf(result));
			}
			operand1 = result;
			operator = null;
			startNewNumber = true;
		} catch (NumberFormatException e) {
			textField.setText("Error");
		}
	}

	private void setOperator (String newOperator) {
		try {
			if (operator == null) {
				operand1 = Double.parseDouble(textField.getText());
			} else {
				calculateResult();
			}
			operator = newOperator;
			startNewNumber = true;
		} catch (NumberFormatException e) {
			textField.setText("Error");
		}
	}

	/**
	 * Create the frame.
	 */
	public KalkulatorGUI() {
		setTitle("Kalkulator GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 407, 300);
		KalkulatorGUI = new JPanel();
		KalkulatorGUI.setBackground(SystemColor.activeCaptionBorder);
		KalkulatorGUI.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(KalkulatorGUI);
		KalkulatorGUI.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(53, 26, 279, 35);
		KalkulatorGUI.add(textField);
		
		JButton b_point = new JButton(".");
		b_point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = ".";
				if (startNewNumber) {
					textField.setText(digit);
					startNewNumber = false;
				} else {
					textField.setText(textField.getText() + digit);
				}
			}
		});
		b_point.setBounds(53, 183, 44, 25);
		KalkulatorGUI.add(b_point);

		JButton b_equal = new JButton("=");
		b_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operator == null || startNewNumber) return;
				double operand2 = Double.parseDouble(textField.getText());
				double result = 0;
				switch (operator) {
				case "+":
					result = operand1 + operand2;
					break;
				case "-":
					result = operand1 - operand2;
					break;
				case "÷":
					result = operand1 / operand2;
					break;
				case "×":
					result = operand1 * operand2;
					break;
				/*case "%":
					result = operand1 % operand2;
					break;*/
				}
				textField.setText(String.valueOf(result));
				operand1 = result;
				operator = null;
				startNewNumber = true;
			}
		});
		b_equal.setBounds(233, 148, 44, 26);
		KalkulatorGUI.add(b_equal);		
		
		JButton b_percent = new JButton("%");
		b_percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double value = Double.parseDouble(textField.getText());
					double result = value / 100.0;
					textField.setText(String.valueOf(result));
					startNewNumber = true;
				} catch (NumberFormatException ex) {
					textField.setText("Error");
				}
			}
		});
		b_percent.setBounds(287, 148, 44, 26);
		KalkulatorGUI.add(b_percent);

		JButton b_divide = new JButton("÷");
		b_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					operand1 = Double.parseDouble(textField.getText());
					operator = "÷";
					startNewNumber = true;
				} catch (NumberFormatException ex) {
					textField.setText("Error");
				}
			}
		});
		b_divide.setBounds(287, 114, 44, 26);
		KalkulatorGUI.add(b_divide);

		JButton b_multiply = new JButton("×");
		b_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					operand1 = Double.parseDouble(textField.getText());
					operator = "×";
					startNewNumber = true;
				} catch (NumberFormatException ex) {
					textField.setText("Error");
				}
			}
		});
		b_multiply.setBounds(233, 114, 44, 26);
		KalkulatorGUI.add(b_multiply);

		JButton b_minus = new JButton("-");
		b_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					operand1 = Double.parseDouble(textField.getText());
					operator = "-";
					startNewNumber = true;
				} catch (NumberFormatException ex) {
					textField.setText("Error");
				}
			}
		});
		b_minus.setBounds(287, 80, 44, 25);
		KalkulatorGUI.add(b_minus);

		JButton b_plus = new JButton("+");
		b_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					operand1 = Double.parseDouble(textField.getText());
					operator = "+";
					startNewNumber = true;
				} catch (NumberFormatException ex) {
					textField.setText("Error");
				}
			}
		});
		b_plus.setBounds(233, 80, 44, 25);
		KalkulatorGUI.add(b_plus);

		JButton b_0 = new JButton("0");
		b_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = "0";
				if (startNewNumber) {
					textField.setText(digit);
					startNewNumber = false;
				} else {
					textField.setText(textField.getText() + digit);
				}
			}
		});
		b_0.setBounds(102, 183, 45, 25);
		KalkulatorGUI.add(b_0);

		JButton b_9 = new JButton("9");
		b_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = "9";
				if (startNewNumber) {
					textField.setText(digit);
					startNewNumber = false;
				} else {
					textField.setText(textField.getText() + digit);
				}
			}
		});
		b_9.setBounds(151, 148, 45, 26);
		KalkulatorGUI.add(b_9);

		JButton b_8 = new JButton("8");
		b_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = "8";
				if (startNewNumber) {
					textField.setText(digit);
					startNewNumber = false;
				} else {
					textField.setText(textField.getText() + digit);
				}
			}
		});
		b_8.setBounds(102, 148, 45, 26);
		KalkulatorGUI.add(b_8);

		JButton b_7 = new JButton("7");
		b_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = "7";
				if (startNewNumber) {
					textField.setText(digit);
					startNewNumber = false;
				} else {
					textField.setText(textField.getText() + digit);
				}
			}
		});
		b_7.setBounds(53, 148, 44, 26);
		KalkulatorGUI.add(b_7);
		
		JButton b_2 = new JButton("2");
		b_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = "2";
				if (startNewNumber) {
					textField.setText(digit);
					startNewNumber = false;
				} else {
					textField.setText(textField.getText() + digit);
				}
			}
		});
		b_2.setBounds(102, 80, 45, 25);
		KalkulatorGUI.add(b_2);
		
		JButton b_3 = new JButton("3");
		b_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = "3";
				if (startNewNumber) {
					textField.setText(digit);
					startNewNumber = false;
				} else {
					textField.setText(textField.getText() + digit);
				}
			}
		});
		b_3.setBounds(151, 80, 45, 25);
		KalkulatorGUI.add(b_3);
		
		JButton b_4 = new JButton("4");
		b_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = "4";
				if (startNewNumber) {
					textField.setText(digit);
					startNewNumber = false;
				} else {
					textField.setText(textField.getText() + digit);
				}
			}
		});
		b_4.setBounds(53, 114, 44, 26);
		KalkulatorGUI.add(b_4);
		
		JButton b_5 = new JButton("5");
		b_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = "5";
				if (startNewNumber) {
					textField.setText(digit);
					startNewNumber = false;
				} else {
					textField.setText(textField.getText() + digit);
				}
			}
		});
		b_5.setBounds(102, 114, 45, 26);
		KalkulatorGUI.add(b_5);
		
		JButton b_6 = new JButton("6");
		b_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = "6";
				if (startNewNumber) {
					textField.setText(digit);
					startNewNumber = false;
				} else {
					textField.setText(textField.getText() + digit);
				}
			}
		});
		b_6.setBounds(151, 114, 45, 26);
		KalkulatorGUI.add(b_6);
		
		JButton b_1 = new JButton("1");
		b_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = "1";
				if (startNewNumber) {
					textField.setText(digit);
					startNewNumber = false;
				} else {
					textField.setText(textField.getText() + digit);
				}
			}
		});
		b_1.setBounds(53, 80, 44, 25);
		KalkulatorGUI.add(b_1);
		
		JButton b_clear = new JButton("C");
		b_clear.addActionListener(e -> {
			textField.setText("0");
			operand1 = 0;
			operator = null;
			startNewNumber = true;
		});
		b_clear.setBounds(151, 183, 45, 25);
		KalkulatorGUI.add(b_clear);
		
		JButton b_b = new JButton("←");
		b_b.addActionListener(e -> {
			String currentText = textField.getText();
			if (currentText.length() > 0 && !Objects.equals(currentText, "0")) {
				textField.setText(currentText.substring(0, currentText.length() - 1));
				if (textField.getText().isEmpty()) {
					textField.setText("0");
					startNewNumber = true;
				}
			};
		});
		b_b.setBounds(233, 183, 44, 25);
		KalkulatorGUI.add(b_b);
		
		JButton b_e = new JButton("E");
		b_e.addActionListener(e -> {
			System.exit(0);
		});
		b_e.setBounds(287, 183, 44, 25);
		KalkulatorGUI.add(b_e);
		
		JPanel panel = new JPanel();
		panel.setBounds(41, 72, 303, 146);
		KalkulatorGUI.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 179, 168));
		panel_1.setBounds(41, 11, 303, 63);
		KalkulatorGUI.add(panel_1);

	}
}
