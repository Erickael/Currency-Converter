import javax.swing.JOptionPane;

public class UpdateField {

	public static String updateField(int field, String from, String to, String fromValue) {
		switch (field) {

		case 2: {
			Double value = 0.0;
			if (fromValue.isEmpty()) {
				return "";
			}
			try {
				value = Double.parseDouble(fromValue);
				int toConvert = value.intValue();

				ApiConnection connect = new ApiConnection();
				Double converted = connect.convert(from, to, toConvert);
				return converted.toString();

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Montant invalide, veuiller réessayer");
				return "";
			}

		}

		case 1: {
			Double value = 0.0;
			if (fromValue.isEmpty()) {
				return "";
			}
			try {
				value = Double.parseDouble(fromValue);
				int toConvert = value.intValue();

				ApiConnection connect = new ApiConnection();
				Double converted = connect.convert(from, to, toConvert);
				return converted.toString();

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Montant invalide");
				return "";
			}
		}
		default:
			return null;

		}
	}

}
