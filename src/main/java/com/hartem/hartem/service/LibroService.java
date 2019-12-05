package com.hartem.hartem.service;
import com.hartem.hartem.model.Libro;
import com.hartem.hartem.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LibroService {
    @Autowired
    private LibroRepository repository;

public Libro getLibro(Integer id){return repository.getOne(id);}
public void addLibro(Libro libro){repository.save(libro);}
public ArrayList<Libro> findAll(Libro libro){
    ArrayList<Libro> libro1= new ArrayList<>();
    libro1.addAll(repository.findAll());
    return libro1;
}
//public void deleteLibro(Integer id){repository.delete(id);}

}
