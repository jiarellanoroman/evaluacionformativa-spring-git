package com.equipo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/saludo")
    public String saludar(@RequestParam(defaultValue = "Mundo") String nombre) {
        return "¡Hola, " + nombre + "!";
    }
    @GetMapping("/saludo")
    public String saludar(@RequestParam(defaultValue = "Mundo") String nombre) {
        return "¡Hola, " + nombre + "!";
    }
}