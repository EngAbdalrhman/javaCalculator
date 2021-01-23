package Calculator;
import java.awt.*;
import java.awt.event.*;

public class Fill extends Frame implements ActionListener, WindowListener {
	ArrayGui arr = new ArrayGui();

    static final String TITLE = "Fiiling Array";
    int row, col,fop, opn;
	Button done;
	
	Label lbl, lbl2;

    TextField[][] arr1 , arr2;
	String[][] num , num2;
	int[][] elements , elements2;

    Panel p1 , p2, p3 , p4;
    
    public Fill(int size1 , int size2 , int op , int opn , int size3 , int size4) {
    	fop = op;
    	this.opn = opn;
    	
    	 setLayout(new GridLayout(3,1));
         
         lbl = new Label("Enter Array 1",Label.CENTER);
 		
 		lbl2 = new Label("Enter Array 2",Label.CENTER);
 		 p1 = new Panel(new GridLayout(size1,size2));
         add(p1);
         
 		elements = new int [size1][size2];
        arr1 = new TextField [size1][size2];
    	num = new String[size1][size2];

    	if (opn == 1) {
    		elements2 = new int [size1][size2];

            arr2 = new TextField [size1][size2];

        	num2 = new String[size1][size2];
        	
        	
             p2 = new Panel(new GridLayout(size1,size2));
             add(p2);
             
    	}
    	
    	if (opn == 2) {
    		elements2 = new int [size3][size4];

            arr2 = new TextField [size3][size4];

        	num2 = new String[size3][size4];

             
             p2 = new Panel(new GridLayout(size3,size4));
             add(p2);
             
    	}
		
       
        p3 = new Panel(new GridLayout(2,1));
        add(p3);
		p3.add(lbl);
        p3.add(p1);
        
        p4 = new Panel(new GridLayout(2,1));
        add(p4);
		p4.add(lbl2);
        p4.add(p2);


        for (row = 0; row < arr1.length; row++) {
            for (col = 0; col < arr1[row].length; col++) 
            {
            	arr1[row][col] = new TextField();
                p1.add(arr1[row][col]);
            }

        }
        
        for (row = 0; row < arr2.length; row++) {
            for (col = 0; col < arr2[row].length; col++) 
            {
            	arr2[row][col] = new TextField();
                p2.add(arr2[row][col]);
            }

        }
        
       
        
        done = new Button("done");
		add(done);
		done.addActionListener(this);
		addWindowListener(this);

		setResizable(false);
		setTitle(TITLE);
		setSize(200,400);
		setVisible(true);
    }




	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if (event.getSource() == done) 
    	{
			for (row = 0; row < arr1.length; row++) 
			{
	            for (col = 0; col < arr1[row].length; col++) 
	            {
	            	
	            		num[row][col] = arr1[row][col].getText();
	            		if(arr1[row][col].getText().isEmpty())
	            		{
	            			num[row][col] = "0";
	            		}
	            		elements[row][col] = Integer.parseInt(num[row][col]);
	            }
	         }
			
			for (row = 0; row < arr2.length; row++) 
			{
	            for (col = 0; col < arr2[row].length; col++) 
	            {
	            	
	            		num2[row][col] = arr2[row][col].getText();
	            		if(arr2[row][col].getText().isEmpty())
	            		{
	            			num2[row][col] = "0";
	            		}
	            		elements2[row][col] = Integer.parseInt(num2[row][col]);
	            }
	         }
			switch(opn) 
			{
			case 1 :
				arr.operationsArray(elements, elements2,fop);
				this.dispose();
				break;
			case 2:
				arr.multiplyArrays(elements, elements2);
				break;
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