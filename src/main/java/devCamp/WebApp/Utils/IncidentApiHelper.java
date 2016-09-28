package devCamp.WebApp.Utils;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import devCamp.WebApp.IncidentAPIClient.IncidentAPIClient;

@Component
public class IncidentApiHelper {
	public static IncidentAPIClient getIncidentAPIClient() {
		
		String apiurl= System.getenv("INCIDENT_API_URL");
		IncidentAPIClient client = null;
		
		try {
			client = new IncidentAPIClient(new URI(String.format("https://%s",apiurl)),"");
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return client;
	}
}
