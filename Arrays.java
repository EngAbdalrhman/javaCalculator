package Calculator;

import java.awt.*;
import java.awt.event.*;

public class Arrays extends Frame implements ActionListener, WindowListener{
	//ArrayGui arr = new ArrayGui();
	Label lbl ;
	Button back , nxt;
	TextField txt , result;
	boolean pressed = false;
	String  snum;
	int num = 0, n = 0,size1,size2,op = 1;
	int[][] array = new int[size1][size2];
	public Arrays(){
		
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
			// String x = String.valueOf(pnum);
		}
		if (event.getSource() == txt)
		{
			if(pressed) {
				result.setText("hi");
			}
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
				result.setText("");
				break;
			
		}
		if (n > 1 && n < ((size1 * size2) + 1))
		{
			arrop(size1, size2 , op);
		}
		if (n > (size1 * size2)) 
		{ //	TODO
			result.setText("result is >>");
		}
	}
	 void fillArray(int[][] array , int num) 
	{
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[0].length; j++) 
			{
				
				result.setText("Enter the element row no."+ (i+1)+" col no." + (j+1)+" of Array" + num);
				String arrays = txt.getText();//try
				array[i][j] = Integer.parseInt(arrays.trim());
			}
		}
	}
	 public  void arrop (int size, int size2, int op) 
		{
			int[][] array1 = new int[size][size2];
			int[][] array2 = new int[size][size2];
			
			int[][] result = new int[size][size2];
			fillArray(array1, 1);		
			fillArray(array2, 2);		

			for (int row = 0; row < result.length; row++)
			{
				for (int coulmns = 0; coulmns < result[0].length; coulmns++)
				{
					result[row][coulmns] = array1[row][coulmns] + array2[row][coulmns];
				}
			}
			
			printing(result);

			
		}//Operation Arrays
	 void printing(int[][] result) 
		{
			System.out.println("-------------------------------------");

			for (int i = 0; i < result.length; i++)
			{
				for (int j = 0; j < result[0].length; j++) 
				{
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("-------------------------------------");
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
