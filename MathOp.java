package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MathOp   {

	public JFrame Math;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MathOp window = new MathOp();
					window.Math.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MathOp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Math = new JFrame();
		Math.setBounds(100, 100, 450, 300);
		Math.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Math.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(181, 100, 106, 79);
		Math.getContentPane().add(lblNewLabel);
	}
}
