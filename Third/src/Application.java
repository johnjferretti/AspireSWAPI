import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Application {
	
	public static void main(String[] args) throws IOException, JSONException {
		
		URL url = new URL("https://swapi.dev/api/people/");
		
		System.out.println("Verifying people end point response = 200...");
		try {
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			System.out.println("Response Code is: " + conn.getResponseCode());
			assertTrue(conn.getResponseCode() == 200, "Error! Invalid response code.");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		
	}
	
}
