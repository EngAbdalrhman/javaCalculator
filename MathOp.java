package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;

public class MathOp   {
	String txt = "";
	String n1 ,n2 ,rtxt;
	double num1 , num2 , result;
	int op ,count = 0,opc = 0 ; //case : 1+ , 2- , 3/ ,4* ,5%
	public JFrame Math;
	private JTextField textField;

	/**
	 * Launch the application.
	
	/**
	 * Create the application.
	 */
	public MathOp() {
		initialize();
		Math.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	// TODO add () and sin >> etc
	private void initialize() {
		Math = new JFrame();
		Math.setBounds(100, 100, 270, 400);
		Math.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Math.getContentPane().setLayout(null);
		Math.setResizable(false);

		
		textField = new JTextField();
		textField.setBounds(0, 0, 264, 42);
		Math.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt += "1";
				textField.setText(txt);
			}
		});
		btn1.setBounds(10, 53, 54, 49);
		Math.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txt += "2";
				textField.setText(txt);
			}
		});
		btn2.setBounds(59, 53, 54, 49);
		Math.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt += "3";
				textField.setText(txt);
			}
		});
		btn3.setBounds(111, 53, 54, 49);
		Math.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt += "4";
				textField.setText(txt);
			}
		});
		btn4.setBounds(10, 113, 54, 49);
		Math.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt += "5";
				textField.setText(txt);
			}
		});
		btn5.setBounds(59, 113, 54, 49);
		Math.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt += "6";
				textField.setText(txt);
			}
		});
		btn6.setBounds(111, 113, 54, 49);
		Math.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt += "7";
				textField.setText(txt);
			}
		});
		btn7.setBounds(10, 178, 54, 49);
		Math.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt += "8";
				textField.setText(txt);
			}
		});
		btn8.setBounds(59, 178, 54, 49);
		Math.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt += "9";
				textField.setText(txt);
			}
		});
		btn9.setBounds(111, 178, 54, 49);
		Math.getContentPane().add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt += "0";
				textField.setText(txt);
			}
		});
		btn0.setBounds(59, 242, 54, 49);
		Math.getContentPane().add(btn0);
		
		JButton btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count == 0)
				{
					txt += ".";
					textField.setText(txt);
					count++;
				}
				
				
			}
		});
		btn_dot.setBounds(10, 242, 54, 49);
		Math.getContentPane().add(btn_dot);
		
		JButton btn_mod = new JButton("%");
		btn_mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opc == 0)
				{
				n1 = textField.getText();
				txt ="";
				textField.setText("");
				op = 5;
				count = 0;
				opc++;
				}
			}
		});
		btn_mod.setBounds(111, 242, 54, 49);
		Math.getContentPane().add(btn_mod);
		
		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opc == 0)
				{
				n1 = textField.getText();
				txt ="";
				textField.setText("");
				op = 1;
				count = 0;
				opc++;
				}

			}
		});
		btn_plus.setBounds(186, 53, 54, 49);
		Math.getContentPane().add(btn_plus);
		
		JButton bmin = new JButton("-");
		bmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opc == 0)
				{
				n1 = textField.getText();
				txt ="";
				textField.setText("");
				op = 2;
				count = 0;
				opc++;
				}
			}
		});
		bmin.setBounds(186, 113, 54, 49);
		Math.getContentPane().add(bmin);
		
		JButton bdiv = new JButton("/");
		bdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opc == 0)
				{
				n1 = textField.getText();
				txt ="";
				textField.setText("");
				op = 3;
				count = 0;
				opc++;
				}
			}
		});
		bdiv.setBounds(186, 178, 54, 49);
		Math.getContentPane().add(bdiv);
		
		JButton bmul = new JButton("X");
		bmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opc == 0)
				{
				n1 = textField.getText();
				txt ="";
				textField.setText("");
				op = 4;
				count = 0;
				opc++;
				}
			}
		});
		bmul.setBounds(186, 242, 54, 49);
		Math.getContentPane().add(bmul);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt ="";
				textField.setText("");
				opc = 0;
				count = 0;
			}
		});
		btnC.setBounds(10, 301, 76, 49);
		Math.getContentPane().add(btnC);
		//TODO
		JButton btneq = new JButton("=");
		btneq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (opc ==1)
				{
				n2 = textField.getText();
				txt ="";
				textField.setText("");
				num1 = Double.parseDouble(n1.trim());
				num2 = Double.parseDouble(n2.trim());
				switch(op)
				{
					case 1: //+
						result = num1 + num2;
						rtxt = String.valueOf(result);
						textField.setText(rtxt);
					break;
					case 2://-
						result = num1 - num2;
						rtxt = String.valueOf(result);
						textField.setText(rtxt);
						break;
					case 3: ///
						result = num1 / num2;
						rtxt = String.valueOf(result);
						textField.setText(rtxt);
						break;
					case 4: //*
						result = num1 * num2;
						rtxt = String.valueOf(result);
						textField.setText(rtxt);
						break;
					case 5: //%
						result = num1 % num2;
						rtxt = String.valueOf(result);
						textField.setText(rtxt);
						break;
				}
				count = 0;
				opc = 0;
				}
			}
		});
		btneq.setBounds(87, 301, 76, 49);
		Math.getContentPane().add(btneq);
		
		JButton btnInfo = new JButton("<-");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI gui = new GUI();
				gui.setVisible(true);
				Math.dispose();
			}
		});
		btnInfo.setBounds(186, 301, 54, 49);
		Math.getContentPane().add(btnInfo);
	}
}
