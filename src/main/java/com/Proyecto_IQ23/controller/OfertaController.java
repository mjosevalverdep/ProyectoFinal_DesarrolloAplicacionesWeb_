package com.Proyecto_IQ23.controller;

import com.Proyecto_IQ23.service.OfertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OfertaController {

    @Autowired
    OfertaService ofertaService;

    @GetMapping("/oferta/listadoOferta")
    public String page(Model model) {
        var ofertas = ofertaService.getOfertas();
        model.addAttribute("ofertas", ofertas);
        return "/oferta/listadoOferta";
    }

}
