package com.hartem.hartem.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Libro")
public class Libro {
    @Id
    private Integer id;
    private String titolo;
    private Integer codice;
    public String getTitolo(){
        return titolo;
        }

     public void setTitolo(String titolo){
        this.titolo=titolo;

    }
    public Integer getCodice(){
        return codice;

    }
    public void setCodice(Integer codice){
        this.codice=codice;
    }

}
