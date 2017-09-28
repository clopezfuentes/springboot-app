package com.example.springtest;

import com.example.springtest.interfaces.PersonaBuilder;
import com.example.springtest.interfaces.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by claudialopez on 27-09-17.
 */
@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaBuilder personaBuilder;

    private List<Persona> listaPersonas = new LinkedList<>();

    @Override
    public List<Persona> obtenerListaPersonas() {
        Persona persona = personaBuilder.crearPersona("Claudia","López");
        listaPersonas.add(persona);

        return listaPersonas;
    }
}
