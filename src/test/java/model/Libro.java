package model;

import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Libro")
public class Libro {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer id;
    private String titolo;
    private Integer codice;
    public Libro(String titolo,Integer codice){this.titolo=titolo;this.codice=codice;}
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
