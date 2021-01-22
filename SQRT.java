package Calculator;

import java.awt.*;
import java.awt.event.*;

public class SQRT  extends Frame implements ActionListener, WindowListener{
	MathOperators math = new MathOperators();
	OtherOp sq = new OtherOp();
	TextField x,y,z;
	Button done;
	public SQRT() {
		setLayout(new GridLayout(4,1));

		x = new TextField();
		add(x);
		y = new TextField();
		add(y);
		z = new TextField();
		add(z);
		
		done = new Button("done");
		add(done);
		done.addActionListener(this);
		
		addWindowListener(this);
		
		setTitle("Calculator");
		setSize(500,200);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == done) 
		{
			String tx = x.getText();
			String ty = y.getText();
			String tz = z.getText();

			try
			{
			int xnum =Integer.parseInt(tx.trim());
			int ynum =Integer.parseInt(ty.trim());
			int znum =Integer.parseInt(tz.trim());

			double arr[] =math.sqrt(xnum, ynum, znum);
			double x1 = arr[0];
			double x2 = arr[1];
			
			String xx1= String.valueOf(x1);
			String xx2= String.valueOf(x2);
			
			sq.result.setText("x1 =" + xx1 +" , x2=" + xx2);
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
