package com.Proyecto_IQ23.controller;

import com.Proyecto_IQ23.domain.Oferta;
import com.Proyecto_IQ23.service.OfertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
    @GetMapping("/oferta/nuevoOferta")
    public String nuevoOferta (Oferta oferta){
        return "/oferta/modificarOferta";
    }
    @PostMapping("/oferta/guardarOferta")
    public String guardarOferta (Oferta oferta){
        ofertaService.save(oferta);
        return "redirect:/oferta/listadoOferta";
    }
    @GetMapping("/oferta/modificarOferta/{idOferta}")
    public String modificarOferta (Oferta oferta, Model model){
        oferta=ofertaService.getOferta(oferta);
        model.addAttribute("oferta",oferta);
        return "/oferta/modificarOferta";
    }
    @GetMapping("/oferta/eliminarOferta/{idOferta}")
    public String eliminarOferta (Oferta oferta){
        ofertaService.delete(oferta);
        return "redirect:/oferta/listadoOferta";
    }
}
