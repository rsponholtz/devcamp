package devCamp.WebApp.Controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import devCamp.WebApp.IncidentAPIClient.IncidentAPIClient;
import devCamp.WebApp.IncidentAPIClient.Models.IncidentBean;
import devCamp.WebApp.Utils.IncidentApiHelper;

@Controller
public class DashboardController {

	@RequestMapping("/dashboard")
	public String dashboard(Model model) {

		//Add caching code here
		//check cache for incident data
		//if stale refresh
		IncidentAPIClient client =  IncidentApiHelper.getIncidentAPIClient();
		List<IncidentBean> allIncidents = client.GetAllIncidents();
		model.addAttribute("allIncidents", allIncidents);
		//display the data on the dashboard screen
		return "Dashboard/index";
	}
}