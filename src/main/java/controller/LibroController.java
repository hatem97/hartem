package controller;
import model.Libro;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LibroController {
    @Autowired
    private LibroService service;
@PostMapping("/insert")
    public Libro insert(@RequestBody Libro libro) {
    service.addLibro(libro);
    return libro;
}
}
