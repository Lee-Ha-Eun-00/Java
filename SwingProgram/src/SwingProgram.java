import javax.swing.*;
import java.awt.*;

public class SwingProgram extends JFrame {
	public SwingProgram() {
		setTitle("Opne Challenge 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel J1 = new JPanel();
		J1.setLayout(new FlowLayout());
		J1.add(new JButton("Open"));
		J1.add(new JButton("Read"));
		J1.add(new JButton("Close"));
		c.add(J1,BorderLayout.NORTH);
		
		
		JPanel J2 = new JPanel();
		J2.setLayout(null);
		
		JLabel one = new JLabel("Hello");
		one.setSize(50,20);
		one.setLocation(15,15);
		
		JLabel two = new JLabel("Love");
		two.setSize(50,20);
		two.setLocation(30,30);
		
		JLabel three = new JLabel("Java");
		three.setSize(50,20);
		three.setLocation(45,45);
		
		J2.add(one);
		J2.add(two);
		J2.add(three);
		c.add(J2,BorderLayout.CENTER);
		
		
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new SwingProgram();
	}

}
