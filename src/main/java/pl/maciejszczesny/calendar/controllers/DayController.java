package pl.maciejszczesny.calendar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.maciejszczesny.calendar.services.DayService;

@Controller
public class DayController {
    @Autowired
    DayService dayService;


    @GetMapping("/calendar")
    public String calendar(Model model){
        model.addAttribute("days", dayService.getAll());
        return "calendar";
    }

    @PostMapping
    public String reserve(@RequestParam("day")String day, Model model){



        return "calendar";
    }
}
