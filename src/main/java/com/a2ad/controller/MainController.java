package com.a2ad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("greeting", "Strona główna");
        model.addAttribute("tagline", "ążźęłóę");

        return "index";
    }
}
