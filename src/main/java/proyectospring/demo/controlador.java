/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectospring.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ANDRES REY
 */
@RestController
@RequestMapping("/saludar")

public class controlador {
    @GetMapping("/hola")

    public String saludar(){
        return "<h1>hola mundo</h1>";
    }
    
}
