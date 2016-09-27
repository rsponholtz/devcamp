package devCamp.WebApp.Controllers;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import devCamp.WebApp.IncidentAPIClient.IncidentAPIClient;
import devCamp.WebApp.IncidentAPIClient.Models.IncidentBean;

@Controller
public class IncidentController {
	
    @GetMapping("/details")
    public String Details( @RequestParam(value="Id", required=false, defaultValue="") String id,Model model) {
    	//get the incident from the REST service   	
    	IncidentBean incident = IncidentBean.getDemoIncident();
    	//plug incident into the Model
        model.addAttribute("incident", incident);
        return "Incident/details";
    }

	
    @GetMapping("/new")
    public String newIncidentForm( Model model) {
        model.addAttribute("incident", new IncidentBean());
        return "Incident/new";
    }

    @PostMapping("/new")
    public String Create(@ModelAttribute IncidentBean incident) {
    	IncidentAPIClient client = new IncidentAPIClient();
    	IncidentBean incidentToSave;
    	String result = client.CreateIncident(incident);
    	if (!result.isEmpty()){
    		//incidentToSave = deserialize the result string
    	}
    	//now upload the file if there is one
    	    	
        return "Incident/details";
    }
    
}