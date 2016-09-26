package devCamp.WebApp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DashboardController {

    @RequestMapping("/dashboard")
    public String dashboard(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {

    	//Add caching code here
    	//check cache for incident data
    	//if stale refresh
    	
    	//display the data on the dashboard screen
        model.addAttribute("name", name);
        return "dashboard";
    }
}