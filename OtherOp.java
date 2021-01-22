package Calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class OtherOp  extends Frame implements ActionListener, WindowListener{
	MathOperators math = new MathOperators();
	TextField txt;
	TextField result;
	Label lbl;
	Button sqrt;
	Button exp, fact,prime , back;
	
	Panel pnl = new Panel(new GridLayout());
	Panel pnl2 = new Panel(new GridLayout());

	public OtherOp() {
		setLayout(new GridLayout(7,1));

		txt = new TextField();
		txt.setSize(400, 20);
		add(txt);
		add(pnl);
		
		lbl = new Label("Result",Label.LEFT);
		//lbl.setSize(100,20);
		pnl.add(lbl);
		
		result = new TextField();
		//10
		//result.setSize(200, 20);
		result.setEditable(false);
		pnl.add(result);
		
		sqrt = new Button("SQRT");
		add(sqrt);
		sqrt.addActionListener(this);
		
		exp = new Button("EXP");
		add(exp);
		exp.addActionListener(this);
		
		fact = new Button("FACTORIAL");
		add(fact);
		fact.addActionListener(this);
		
		prime = new Button("PRIME");
		add(prime);
		prime.addActionListener(this);
		
		back = new Button("back");
		add(back);
		back.addActionListener(this);
		
		addWindowListener(this);
		
		setResizable(false);
		setTitle("Calculator");
		setSize(500,200);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if (event.getSource() == fact) {
			String tnum = txt.getText();
			try
			{
			int num =Integer.parseInt(tnum.trim());
			int fnum =(math.Factorial(num));
			String x = String.valueOf(fnum);
			result.setText(x);
			 }
			 catch(NumberFormatException e) 
			 {
				 System.out.println("NumberFormatException: " + e.getMessage());
			 }
		}
		if(event.getSource() == back) 
		{
			GUI gui = new GUI();
			gui.setVisible(true);
			this.dispose();

		}
		if(event.getSource() == sqrt) 
		{
			SQRT s = new SQRT();
			s.setVisible(true);
			this.dispose();
		}
		
		if(event.getSource() == exp) 
		{
			Exponent Ex = new Exponent();
			Ex.setVisible(true);
			this.dispose();
		}
		
		if(event.getSource() == prime) 
		{
			String tnum = txt.getText();
			try
			{
			int num =Integer.parseInt(tnum.trim());
			boolean pnum =(math.isPrime(num));
			String x = String.valueOf(pnum);
			result.setText(x);
			 }
			 catch(NumberFormatException e) 
			 {
				 System.out.println("NumberFormatException: " + e.getMessage());
			 }

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
