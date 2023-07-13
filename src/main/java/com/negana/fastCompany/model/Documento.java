package com.negana.fastCompany.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value="Documentos")
public class Documento {

    @Id
    private String id;
    private String ref;
    private String titulo;
    private String descripcion;
    private List<Persona> persona;

    public Documento() {
    }

    public Documento(String id, String ref, String titulo, String descripcion, List<Persona> persona) {
        this.id = id;
        this.ref = ref;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.persona = persona;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Persona> getPersona() {
        return persona;
    }

    public void setPersona(List<Persona> persona) {
        this.persona = persona;
    }

}
