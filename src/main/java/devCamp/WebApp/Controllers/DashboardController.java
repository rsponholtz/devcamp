package devCamp.WebApp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import devCamp.WebApp.IncidentAPIClient.IncidentAPIClient;

@Controller
public class DashboardController {

    @RequestMapping("/dashboard")
    public String dashboard(Model model) {

    	//Add caching code here
    	//check cache for incident data
    	//if stale refresh
    	IncidentAPIClient client = new IncidentAPIClient();
    	
    	//display the data on the dashboard screen
        return "Dashboard/index";
    }
}