package com.Proyecto_IQ23.controller;

import com.Proyecto_IQ23.domain.Tour;
import com.Proyecto_IQ23.service.TourService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class IndexController {
    
    @Autowired
    TourService tourService;
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora utilizando MVC");
        var tours=tourService.getTours();
        model.addAttribute("tours",tours);
        return "index";
    }
}
