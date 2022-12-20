
package com.decirHola.DecirHola;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DecirHolaController {
    
    @GetMapping ("/hola") // consulta a get con URL
    public String decirHola(){
        return "hola Mundo, David Soto";
    }
    
    @GetMapping ("/hola/{nombre}/{apellido}/{edad}") // consulta a get con URL y parametro
    public String decirHola1(@PathVariable String nombre,
                             @PathVariable String apellido,
                             @PathVariable int edad){ //debe coincidir la variable con la de arriba
        return "hola Mundo, " + apellido + " " + nombre + " " + edad;
    }
    
    @GetMapping ("/chao")
    public String decirChao(@RequestParam String nombre,
                            @RequestParam String apellido,
                            @RequestParam int edad){
        return "chao Mundo, " + nombre + " " + apellido + " " + edad;
    }
}
