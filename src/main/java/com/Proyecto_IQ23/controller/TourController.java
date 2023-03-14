package com.Proyecto_IQ23.controller;

import com.Proyecto_IQ23.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TourController {

    @Autowired
    TourService tourService;

    @GetMapping("/tour/listadoTour")
    public String inicio(Model model) {
        var tours = tourService.getTours();
        model.addAttribute("tours", tours);
        return "/tour/listadoTour";
    }

}
