package com.hartem.hartem.dto;

import lombok.Data;
@Data
public class UserDto {

    private String cognome;

    public UserDto(String cognome) {
        this.cognome = cognome;
    }

    public UserDto() {
    }
}
