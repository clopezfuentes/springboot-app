package com.example.springtest;

import com.example.springtest.interfaces.PersonaBuilder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * Created by claudialopez on 27-09-17.
 */
@Component
public class PersonaBuilderImpl implements PersonaBuilder {


    @Override
    public Persona crearPersona(String name, String surname) {
        Persona persona = new Persona();
        persona.setName(name);
        persona.setSurname(name);
        return persona;
    }
}
