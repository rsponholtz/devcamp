package devCamp.WebApp.Controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

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
import org.springframework.web.multipart.MultipartFile;

import devCamp.WebApp.IncidentAPIClient.IncidentAPIClient;
import devCamp.WebApp.IncidentAPIClient.Models.IncidentBean;
import devCamp.WebApp.Utils.IncidentApiHelper;

@Controller
public class IncidentController {
	
    @GetMapping("/details")
    public String Details( @RequestParam(value="Id", required=false, defaultValue="") String id,Model model) {
    	//get the incident from the REST service   	
    	IncidentAPIClient client = IncidentApiHelper.getIncidentAPIClient();
    	IncidentBean incident = client.GetById(id);    	
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
    public String Create(@ModelAttribute IncidentBean incident,@RequestParam("file") MultipartFile imageFile) {
    	IncidentAPIClient client = IncidentApiHelper.getIncidentAPIClient();
    	IncidentBean result = client.CreateIncident(incident);
    	if (result != null){
    		//incidentToSave = deserialize the result string
    	}
    	
    	//now upload the file if there is one    
     	if (imageFile != null) {
	            try {
	                String fileName = imageFile.getOriginalFilename();
	                byte[] bytes = imageFile.getBytes();
	                BufferedOutputStream buffStream = 
	                        new BufferedOutputStream(new FileOutputStream(new java.io.File("/Users/rosssponholtz/workspace2/temp" + fileName)));
	                buffStream.write(bytes);
	                buffStream.close();
	            } catch (Exception e) {
	                return "You failed to upload ";
	            }
    		}    	
    	
    	
        return "Incident/details";
    }
    
}