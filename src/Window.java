import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame {

	Container container;
	JPanel panel1, panel2;
	JComboBox<String> combo1, combo2;
	JTextField field1, field2;

	public Window() {
		setTitle("Currency Converter");
		container = this.getContentPane();

		combo1 = new JComboBox();
		combo2 = new JComboBox();

		field1 = new JTextField(20);
		field2 = new JTextField(20);

		panel1 = new JPanel();
		panel2 = new JPanel();

		panel1.add(combo1);
		panel1.add(field1);

		panel2.add(combo2);
		panel2.add(field2);

		container.add(panel1, BorderLayout.NORTH);
		container.add(panel2, BorderLayout.SOUTH);

		pack();
	}

}
