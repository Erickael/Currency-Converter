import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Window extends JFrame {

	Container container;
	JPanel panel1, panel2;
	JComboBox<ComboItem> combo1, combo2;
	JTextField field1, field2;
	boolean canBeUpdated1, canBeUpdated2 = false;

	public Window() {
		setTitle("Currency Converter");
		try {
			setIconImage(ImageIO.read(new File("./money.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

		// Action listener: Combo
		combo1.addActionListener(e -> {
			ComboItem item1 = (ComboItem) combo1.getSelectedItem();
			ComboItem item2 = (ComboItem) combo2.getSelectedItem();

			String from = item1.key.toString();
			String to = item2.key.toString();
			String amount = field1.getText().trim();

			String result = UpdateField.updateField(2, from, to, amount);
			field2.setText(result);
		});

		combo2.addActionListener(e -> {
			ComboItem item1 = (ComboItem) combo1.getSelectedItem();
			ComboItem item2 = (ComboItem) combo2.getSelectedItem();

			String from = item2.key.toString();
			String to = item1.key.toString();
			String amount = field2.getText().trim();

			String result = UpdateField.updateField(1, from, to, amount);
			field1.setText(result);
		});

		// Focus Listener: TextFields
		field1.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				canBeUpdated1 = false;

			}

			@Override
			public void focusGained(FocusEvent e) {
				field1.setText(null);
				field2.setText(null);
				canBeUpdated1 = true;

			}
		});

		field2.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				canBeUpdated2 = false;

			}

			@Override
			public void focusGained(FocusEvent e) {
				field1.setText(null);
				field2.setText(null);
				canBeUpdated2 = true;

			}
		});

		// Document listener
		field1.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void removeUpdate(DocumentEvent e) {
				if (canBeUpdated1) {
					ComboItem item1 = (ComboItem) combo1.getSelectedItem();
					ComboItem item2 = (ComboItem) combo2.getSelectedItem();

					String from = item1.key.toString();
					String to = item2.key.toString();
					String amount = field1.getText().trim();

					String result = UpdateField.updateField(2, from, to, amount);
					field2.setText(result);
				}
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				if (canBeUpdated1) {
					ComboItem item1 = (ComboItem) combo1.getSelectedItem();
					ComboItem item2 = (ComboItem) combo2.getSelectedItem();

					String from = item1.key.toString();
					String to = item2.key.toString();
					String amount = field1.getText().trim();

					String result = UpdateField.updateField(2, from, to, amount);
					field2.setText(result);
				}
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub

			}
		});

		field2.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void removeUpdate(DocumentEvent e) {
				if (canBeUpdated2) {
					ComboItem item1 = (ComboItem) combo1.getSelectedItem();
					ComboItem item2 = (ComboItem) combo2.getSelectedItem();

					String from = item2.key.toString();
					String to = item1.key.toString();
					String amount = field2.getText().trim();

					String result = UpdateField.updateField(1, from, to, amount);
					field1.setText(result);
				}
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				if (canBeUpdated2) {
					ComboItem item1 = (ComboItem) combo1.getSelectedItem();
					ComboItem item2 = (ComboItem) combo2.getSelectedItem();

					String from = item2.key.toString();
					String to = item1.key.toString();
					String amount = field2.getText().trim();

					String result = UpdateField.updateField(1, from, to, amount);
					field1.setText(result);
				}
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// adding comboboxes and fields into panels

		panel1.add(combo1);
		panel1.add(field1);

		panel2.add(combo2);
		panel2.add(field2);

		// adding panems into container
		container.add(panel1, BorderLayout.NORTH);
		container.add(panel2, BorderLayout.SOUTH);

		pack();
		setLocationRelativeTo(null);
	}

}
