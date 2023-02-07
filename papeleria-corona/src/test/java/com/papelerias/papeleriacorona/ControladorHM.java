package com.papelerias.papeleriacorona;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class ControladorHM {
    @GetMapping("/hola")
    public String saludar(){
        return  "Prueba de controlador";
    }
}
