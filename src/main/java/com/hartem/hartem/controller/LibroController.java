package com.hartem.hartem.controller;
import com.hartem.hartem.model.Libro;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.hartem.hartem.service.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

@Controller

public class LibroController {
    @Autowired
    private LibroService service;
@PostMapping("/insert/")
    public Libro insert(@RequestBody Libro libro) {
    service.addLibro(libro);
    return libro;
}
@GetMapping("/all")
    public ArrayList<Libro> find(@RequestBody Libro libro){
    return service.findAll(libro);


}
}
