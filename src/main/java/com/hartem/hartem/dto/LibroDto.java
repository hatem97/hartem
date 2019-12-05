package com.hartem.hartem.dto;

public class LibroDto {
    private Integer codice;
    public LibroDto(Integer codice){
        this.codice=codice;
    }
    public Integer getCodice(){
        return codice;
    }
    public void setCodice(Integer codice){
        this.codice=codice;
    }
}
