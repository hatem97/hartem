package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "User")
public class User {
    @Id
    private Integer id;
    private String nome;
    private String cognome;


    public User(Integer id, String nome, String cognome) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
    }

    public User() {
    }
}
