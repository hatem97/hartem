package service;

import dao.LibroRepository;
import model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService {
    @Autowired
private LibroRepository repository;
    public Libro getLibro(Integer id){return repository.findOne(id);}
}
