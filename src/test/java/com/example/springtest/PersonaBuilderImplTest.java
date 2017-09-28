package com.example.springtest;

import com.example.springtest.interfaces.PersonaBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by claudialopez on 27-09-17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonaBuilderImplTest {

    @Autowired
    private PersonaBuilder personaBuilder;

    @Test
    public void successfulPersonaCreation(){
      Persona persona = personaBuilder.crearPersona("Vicky","Fuenmayor");
      assertEquals("Vicky", persona.getName());
    }
}