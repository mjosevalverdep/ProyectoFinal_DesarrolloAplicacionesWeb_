package com.Proyecto_IQ23.controller;

import com.Proyecto_IQ23.domain.Tour;
import com.Proyecto_IQ23.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
     
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
    @GetMapping("/tour/nuevoTour")
    public String nuevoTour (Tour tour) {
        return "/tour/modificarTour";
    }
    
    @PostMapping("/tour/guardarTour")
    public String guardarTour (Tour tour) {
        tourService.save(tour);
        return "redirect:/tour/listadoTour";
    }
    
    @GetMapping("/tour/modificarTour/{idTour}")
    public String modificarTour (Tour tour, Model model) {
        tour=tourService.getTour(tour);
        model.addAttribute("tour",tour);
         return "/tour/modificarTour";
    }
    
    @GetMapping("/tour/eliminarTour/{idTour}")
    public String eliminarTour (Tour tour) {
        tourService.delete(tour);
         return "redirect:/tour/listadoTour";
    }
}
