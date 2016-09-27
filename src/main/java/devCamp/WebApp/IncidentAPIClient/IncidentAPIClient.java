package devCamp.WebApp.IncidentAPIClient;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import devCamp.WebApp.IncidentAPIClient.Models.IncidentBean;

public class IncidentAPIClient {
	public String CreateIncident(IncidentBean incident) {
		//call REST API to create the incident
		return "success";
	}
	
	
/*
 *        final String uri = "http://incidentapi32csxy6h3sbku.azurewebsites.net/incidents";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
        
        // create request body
        String input = "{\"name\":\"name\",\"email\":\"email@gmail.com\"}";

        User returns =restTemplate.postForObject(uri, u, User.class, vars);
        
        // set headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Basic " + "xxxxxxxxxxxx");
        HttpEntity<String> entity = new HttpEntity<String>(input, headers);

        // send request and parse result
        ResponseEntity<String> response = restTemplate
                .exchange(uri, HttpMethod.POST, entity, String.class);
    	
 * 	
 */
	
}
