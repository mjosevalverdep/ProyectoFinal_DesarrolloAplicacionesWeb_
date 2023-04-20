package com.Proyecto_IQ23.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {
    
  @GetMapping("/About")
    public String inicio(Model model) {
        return "About";
    }
}
