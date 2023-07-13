package com.negana.fastCompany.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="Personas")
public class Persona {


    @Id
    private String Id;
    private String nombre;
    private String email;

    public Persona() {
    }

    public Persona(String id, String nombre, String email) {
        Id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
