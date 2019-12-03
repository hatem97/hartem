package service;
import model.Libro;
import dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService {
    @Autowired
    private LibroRepository repository;

public Libro getLibro(Integer id){return repository.findOne(id);}
public void addLibro(Libro libro){repository.save(libro);}
public Libro findAll(Libro libro){return findAll(libro);}
public void delete(Libro libro){repository.delete(libro);}
}
