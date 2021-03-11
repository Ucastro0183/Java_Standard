package Java_standard;

import java.awt.event.*;	// Library of the action listeners
import javax.swing.*;		// Library of the graphics

/**
 * File: GraphicTest.java<br><br>
 * This program generates an applet window with a button and a label
 * and change the label caption on button click.
 *  
 * @author ucastro
 *
 */
public class GraphicsTest {

	// Constants
	private static final String Saludo = "Hello there";
	private static final String Respuesta = "... see you!";

	/**
	 * Java standard main method
	 * creates main frame for the program execution
	 * @param args Commonly <code>args</code> should be used to introduce any 
	 * additional parameter to the execution of the program
	 */
	public static void main(String[] args) {
		//Instantiate
		frame = new JFrame("Hello World");
		Button1 = new JButton("Aceptar");
		Label1 = new JLabel(Saludo);
		//Define listener
		ActionListener act = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("Aceptar")) 
					if (Label1.getText().equals(Saludo)) 
						Label1.setText(Respuesta);
					else 
						Label1.setText(Saludo);
			}
		};
		//Add listener to Button
		Button1.addActionListener(act);
		//Define geometries
		Button1.setSize(100, 25);
		Button1.setLocation(100, 200);
		Label1.setSize(200, 100);
		//Set Frame
		frame.add(Button1);
		frame.add(Label1);
		frame.setSize(500,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	// instance variables
	private static JLabel Label1;
	private static JButton Button1;
	private static JFrame frame;
}
