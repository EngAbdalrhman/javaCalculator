package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ArraysOp {

	public JFrame frame;

	/**
	 * Launch the application.
	// not main

	/**
	 * Create the application.
	 */
	public ArraysOp() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 325, 275);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSum = new JButton("SUM");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arrays arr = new Arrays();
				arr.setVisible(true);
				frame.dispose();
			}
		});
		btnSum.setBounds(64, 23, 89, 75);
		frame.getContentPane().add(btnSum);
		
		JButton btnMin = new JButton("MINOUS");
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMin.setBounds(163, 23, 89, 75);
		frame.getContentPane().add(btnMin);
		
		JButton btnMulti = new JButton("MULTI");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMulti.setBounds(64, 109, 188, 47);
		frame.getContentPane().add(btnMulti);
		
		JButton back = new JButton("BACK");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI gui = new GUI();
				gui.setVisible(true);
				frame.dispose();
			}
		});
		back.setBounds(113, 167, 89, 23);
		frame.getContentPane().add(back);
	}

}
