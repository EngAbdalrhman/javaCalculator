package Calculator;

import java.awt.*;
import java.awt.event.*;

public class Exponent extends Frame implements ActionListener, WindowListener{
	OtherOp sq = new OtherOp();
	TextField x,n;
	Button done;
	public Exponent() 
	{
		setLayout(new GridLayout(3,1));

		x = new TextField();
		add(x);
		n = new TextField();
		add(n);
		
		
		done = new Button("done");
		add(done);
		done.addActionListener(this);
		
		addWindowListener(this);
		
		setTitle("Calculator");
		setSize(500,150);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == done) 
		{
			String tx = x.getText();
			String tn = n.getText();

			try
			{
			int xnum =Integer.parseInt(tx.trim());
			int pow =Integer.parseInt(tn.trim());

			double result = Math.pow(xnum,pow);
			
			String Sresult= String.valueOf(result);
			
			sq.result.setText(Sresult);
			 }
			 catch(NumberFormatException error) 
			 {
				 System.out.println("NumberFormatException: " + error.getMessage());
			 }
			
			this.setVisible(false);
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
