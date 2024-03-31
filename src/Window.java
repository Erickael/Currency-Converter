import java.awt.BorderLayout;
import java.awt.Container;
import java.util.Map;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame {

	Container container;
	JPanel panel1, panel2;
	JComboBox<ComboItem> combo1, combo2;
	JTextField field1, field2;

	public Window() {
		setTitle("Currency Converter");
		container = this.getContentPane();

		// initialization: comboboxes
		combo1 = new JComboBox<>();
		combo2 = new JComboBox<>();

		// adding comboboxes items
		CurrencyList list = new CurrencyList();
		for (Map.Entry<String, String> entry : list.map.entrySet()) {
			combo1.addItem(new ComboItem(entry.getKey(), entry.getValue()));
			combo2.addItem(new ComboItem(entry.getKey(), entry.getValue()));
		}

		// initialization: textfields
		field1 = new JTextField(20);
		field2 = new JTextField(20);

		// initialization: panels
		panel1 = new JPanel();
		panel2 = new JPanel();

		// adding comboboxes and fields into panels
		panel1.add(combo1);
		panel1.add(field1);

		panel2.add(combo2);
		panel2.add(field2);

		// adding panems into container
		container.add(panel1, BorderLayout.NORTH);
		container.add(panel2, BorderLayout.SOUTH);

		pack();
	}

}
