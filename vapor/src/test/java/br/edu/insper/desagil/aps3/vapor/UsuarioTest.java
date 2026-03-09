package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    Usuario usuario;
    @BeforeEach
    void setUp(){
        usuario = new Usuario("Bom_de_guerra", "Cleiton");
    }


    @Test
    void constroi(){
        assertEquals("Bom_de_guerra",usuario.getApelido());
        assertEquals("Cleiton",usuario.getNome());
    }
}
