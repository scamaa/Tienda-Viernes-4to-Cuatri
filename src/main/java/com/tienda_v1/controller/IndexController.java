package com.tienda_v1.controller;

import com.tienda_v1.services.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    @Autowired
    private ArticuloService articuloService;
    

    @GetMapping("/")
    public String inicio(Model model) {
        var articulos=articuloService.getArticulos(false);
        model.addAttribute("articulos", articulos);
        return "index";
    }
}
