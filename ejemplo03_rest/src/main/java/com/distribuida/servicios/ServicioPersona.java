package com.distribuida.servicios;

import com.distribuida.db.Persona;

import java.util.List;

public interface ServicioPersona {

    Persona findById(Integer id);
    List<Persona> findAll();
    void insert(Persona p);
    void update(Persona p);
    void delete(Integer id);
}
