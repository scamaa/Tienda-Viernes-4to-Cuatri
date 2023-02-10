package com.tienda_v1.controller;

import com.tienda_v1.domain.Cliente;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {
  
    @GetMapping("/")
    public String inicio(Model model) {
        var mensaje="Saludos desde el Back End";
        model.addAttribute("mensaje", mensaje);
        
        Cliente cliente1=new Cliente("Cucaliano", "DeLaCruz", "cucalianodelacruz777@quebendicion.xd", "87777777");
        Cliente cliente2=new Cliente("JH", "DeLaCruz", "jhdelacruz777@quebendicion.xd", "87777777");
        Cliente cliente3=new Cliente("Bola8", "DeLaCruz", "bola8delacruz777@quebendicion.xd", "87777777");
        
        var clientes=Arrays.asList(cliente1, cliente2, cliente3);
        
        model.addAttribute("clientes", clientes);
        
        return "index";
    }
}
