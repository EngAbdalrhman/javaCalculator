package Calculator;

import java.awt.*;
import java.awt.event.*;

public class Printing  extends Frame implements ActionListener, WindowListener{

	static final String TITLE = "Fiiling Array";
	
    int row, col,fop;
	Button done;
	Panel p;

    TextField[][] result;
    
    public Printing(int size1 , int size2 , int[][]results) {
    	
    	result = new TextField [size1][size2];
        setLayout(new GridLayout(2,1));
        p = new Panel(new GridLayout(size1,size2));
        add(p);
        for (row = 0; row < result.length; row++) {
            for (col = 0; col < result[row].length; col++) 
            {
            	result[row][col] = new TextField();
            	result[row][col].setText(String.valueOf(results[row][col]));
            	result[row][col].setEditable(false);
                p.add(result[row][col]);
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
			GUI gui = new GUI();
			gui.setVisible(true);
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