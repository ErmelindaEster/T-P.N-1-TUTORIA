package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoController {


@GetMapping("/producto")
public String getProducto(){
    // codigo
    return "productoFormulario"
    ;
}

@GetMapping("/tablaProducto")
public String getTablaProducto(){
    // codigo
    return "tablaProducto"
    ;
}

}

