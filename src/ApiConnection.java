import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JOptionPane;

import org.json.JSONObject;

public class ApiConnection {
	private static final String link = "https://api.devises.zone/v1/quotes/";
	private static final String key = "48371|rF5amsuab2TG1srcih3w";

	// N.B: use your key instead of this pls :')
	public double convert(String from, String to, int amount) {
		try {
			// initialization: url to send request
			URL url = new URL(link + from + "/" + to + "/json?quantity=" + amount + "&key=" + key);

			// Opening and sending request
			HttpURLConnection http = (HttpURLConnection) url.openConnection();

			// initialization: HttpResponse reader

			// BufferedReader : characters reader
			// InputStreamReader : flow reader (out: characters)
			BufferedReader reader = new BufferedReader(new InputStreamReader(http.getInputStream()));

			// reading, output = JSON String
			String response = "", line;
			while ((line = reader.readLine()) != null) {
				response += line;
			}

			reader.close();

			JSONObject json = new JSONObject(response);
			Double converted = json.getJSONObject("result").getDouble("amount");

			return converted;

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Erreur de conversion!! \nVérifiez votre connexion ou contactez l'admin (Ricka xD");
			return 0;
		}

	}

}
