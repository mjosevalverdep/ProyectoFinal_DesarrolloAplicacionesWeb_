package com.Proyecto_IQ23.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookingsController {
    
    @GetMapping("/Bookings")
    public String inicio(Model model) {
        return "Bookings";
    }
     
}
