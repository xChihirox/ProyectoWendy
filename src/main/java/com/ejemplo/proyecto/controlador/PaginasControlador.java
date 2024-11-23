package com.ejemplo.proyecto.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PaginasControlador {
    
    @GetMapping(value = "/alumnosAdmin")
    public String alumnosAdmin(){
        return "alumnosAdmin";
    }
    
}
