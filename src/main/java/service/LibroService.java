package service;
import model.Libro;
import dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository repository;

public Libro getLibro(Integer id){return repository.getOne(id);}
public void addLibro(Libro libro){repository.save(libro);}
public List<Libro> findAll(Libro libro){
    List<Libro> libro1= new ArrayList<>();
    libro1.addAll(repository.findAll());
    return libro1;
}
//public void deleteLibro(Integer id){repository.delete(id);}

}
