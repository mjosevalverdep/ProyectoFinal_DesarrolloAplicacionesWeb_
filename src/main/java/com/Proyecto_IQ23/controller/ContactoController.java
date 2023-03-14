package com.Proyecto_IQ23.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactoController {
    
    @GetMapping("/Contacto")
    public String inicio(Model model) {
        return "Contacto";
    }
    
}
