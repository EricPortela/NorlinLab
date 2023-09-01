package com.norlin.norlinlab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingPageController {

    @GetMapping("/start")
    public String getLandingPage(){
        return "home.html";
    }
    
}
