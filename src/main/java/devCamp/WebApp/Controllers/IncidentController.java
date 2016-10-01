package devCamp.WebApp.Controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
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
import devCamp.WebApp.IncidentAPIClient.IncidentService;
import devCamp.WebApp.IncidentAPIClient.Models.IncidentBean;
import devCamp.WebApp.Utils.IncidentApiHelper;
import devCamp.WebApp.Utils.StorageHelper;

@Controller
public class IncidentController {
	@Autowired
	IncidentService service;
		
    @GetMapping("/details")
    public String Details( @RequestParam(value="Id", required=false, defaultValue="") String id,Model model) {
    	//get the incident from the REST service   	
    	IncidentBean incident = service.GetById(id);    	
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
    	IncidentBean result = service.CreateIncident(incident);
    	if (result != null){
    		//incidentToSave = deserialize the result string
    	}
    	String IncidentID = result.getId();
    	
    	//now upload the file if there is one    
     	if (imageFile != null) {
	            try {
	                String fileName = imageFile.getOriginalFilename();
	         		if (fileName != null) {
		         		StorageHelper.UploadFileToBlobStorage(IncidentID, imageFile);
		         		StorageHelper.AddMessageToQueue(IncidentID, fileName);
	                }
	            } catch (Exception e) {
	            	return "Incident/details";
	            }
    		}    	
    	    	
        return "Incident/details";
    }
    
}