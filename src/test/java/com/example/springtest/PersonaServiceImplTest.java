package com.example.springtest;

import com.example.springtest.interfaces.PersonaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by claudialopez on 27-09-17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonaServiceImplTest {

    @Autowired
    PersonaService personaService;

    @Test
    public void returnListWithData(){
        int lenghtLista = 1;

        List<Persona> listaPersonas = personaService.obtenerListaPersonas();

        assertEquals(lenghtLista,listaPersonas.size());
    }

}