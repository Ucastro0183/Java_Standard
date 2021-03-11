package Java_standard;

// Import declarations
import java.awt.*;
import javax.swing.*; 		// Library of the graphics

/**
 * File name: GraphicsTest2.java<br><br>
 * Class to test the uses of the graphical interface 
 * containers and JObjects.
 * @author ucastro
 */
public class GraphicsTest2 {

	// Constants declarations
	private static final Dimension Size= new Dimension (500,300); 
	
	/**
	 * Java standard main method
	 * creates main frame for the program execution
	 * @param args Commonly <code>args</code> should be used to introduce any 
	 * additional parameter to the execution of the program
	 */
	public static void main(String[] args) {
		Frame = new JFrame("Graphical Interfase Test");
		Frame.setSize(Size);
		Frame.setVisible(true);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Init(Frame);
		//TODO: Do something with the button
	}
	
	/**
	 * <pre><b>private static void</b> Init(JFrame Frame)</pre>
	 * Initialize the programs main frame with the objects needed
	 * @param Frame The form to initiate.
	 */
	private static void Init(JFrame Frame) {
		Button = new JButton("Iniciar");
		label = new JLabel();
		Frame.add(Button);
		Frame.add(label); // Add a label to fill the canvas
		Button.setSize(100, 25);
		Button.setLocation(250, 150);
	}

	// Instance variables
	private static JFrame Frame;
	private static JButton Button;
	private static JLabel label;
}
