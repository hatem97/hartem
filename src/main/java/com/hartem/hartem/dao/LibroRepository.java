package com.hartem.hartem.dao;
import com.hartem.hartem.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro,Integer> {

}
