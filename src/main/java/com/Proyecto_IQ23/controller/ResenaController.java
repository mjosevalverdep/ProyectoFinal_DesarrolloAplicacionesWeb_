package com.Proyecto_IQ23.controller;

import com.Proyecto_IQ23.domain.Resena;
import com.Proyecto_IQ23.service.ResenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ResenaController {
    
    @Autowired
    ResenaService resenaService;
    
    @GetMapping("/resena/listadoResena")
    public String page(Model model) {
        var resenas = resenaService.getResena();
        model.addAttribute("resenas", resenas);
        return "/resena/listadoResena";
    }
    @GetMapping("/resena/nuevaResena")
    public String nuevaResena (Resena resena){
        return "/resena/modificarResena";
    }
    @PostMapping("/resena/guardarResena")
    public String guardarResena (Resena resena){
        resenaService.save(resena);
        return "redirect:/resena/listadoResena";
    }
    @GetMapping("/resena/modificarResena/{idResena}")
    public String modificarResena (Resena resena, Model model){
        resena=resenaService.getResena(resena);
        model.addAttribute("resena",resena);
        return "/resena/modificarResena";
    }
    @GetMapping("/resena/eliminarResena/{idResena}")
    public String eliminarResena (Resena resena){
        resenaService.delete(resena);
        return "redirect:/resena/listadoResena";
    }
}
