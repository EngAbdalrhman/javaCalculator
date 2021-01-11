package Calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GUI extends Frame implements ActionListener, WindowListener{
	// init
	Label lbl ;
	Button btn;
	Button btn2;
	Button btn3;
	
	
	public GUI() {
		setLayout(new FlowLayout());
		
		
		lbl = new Label("Welcome To zCalculator",Label.CENTER);
		add(lbl);
		
		btn = new Button("MathOP");
		add(btn);
		btn.addActionListener(this);
		btn2 = new Button("ArraysOP");
		add(btn2);
		btn2.addActionListener(this);

		btn3 = new Button("OtherOP");
		add(btn3);
		btn3.addActionListener(this);

		addWindowListener(this);
		
		setResizable(false);
		setTitle("Calculator");
		setSize(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		 new GUI();
		
	}


	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if (event.getSource() == btn) {
			//TODO
			MathOp math = new MathOp();
			math.Math.setVisible(true);
			this.dispose();
		}
		if (event.getSource() == btn2) {
			ArraysOp array = new ArraysOp();
			array.frame.setVisible(true);
			this.dispose();

			
		}
		if (event.getSource() == btn3) {
			OtherOp math = new OtherOp();
			math.setVisible(true);
			this.dispose();

		}
		
	}
	
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}	