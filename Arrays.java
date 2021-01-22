package Calculator;

import java.awt.*;
import java.awt.event.*;

public class Arrays extends Frame implements ActionListener, WindowListener{
	Label lbl ;
	Button back , nxt;
	TextField txt , result;
	String  snum;
	int num = 0, n = 0,size1,size2,op;
	public Arrays(int op){
		this.op = op;
		setLayout(new GridLayout(5,1));
		lbl = new Label("Welcome To Array",Label.CENTER);
		add(lbl);
		txt = new TextField();
		this.add(txt);
		result = new TextField("Enter The first Array Size");
		result.setEditable(false);
		this.add(result);

		nxt = new Button("next");
		add(nxt);
		nxt.addActionListener(this);
		
		back = new Button("back");
		add(back);
		back.addActionListener(this);
		
		addWindowListener(this);

		setResizable(false);
		setTitle("Calculator");
		setSize(600,300);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource() == back) 
		{
			GUI gui = new GUI();
			gui.setVisible(true);
			this.dispose();

		}
		if(event.getSource() == nxt) 
		{
			snum = txt.getText();
			num =Integer.parseInt(snum.trim());
			solve();
			n++;
		}
	}
	// sum & sub
	public void solve() 
	{
		switch(n)
		{
			case 0:
				size1 = num;
				result.setText("Enter The secound Array Size");
				break;
			case 1:
				size2 = num;
				
				Fill f = new Fill(size1 , size2 , op);
				f.setVisible(true);
				this.dispose();
				break;
		}
//  		if (n > 1)
//		{
//  			n = 0;
//			fill f = new fill(size1 , size2);
//			f.setVisible(true);
//			this.dispose();
//		}
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
