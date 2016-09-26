package devCamp.WebApp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import devCamp.WebApp.IncidentAPIClient.IncidentBean;

@Controller
public class IncidentController {


    @GetMapping("/new")
    public String newIncidentForm( Model model) {
        model.addAttribute("incident", new IncidentBean());
        return "new";
    }

    @PostMapping("/new")
    public String newIncidentSubmit(@ModelAttribute IncidentBean incident) {
        return "result";
    }
    
}