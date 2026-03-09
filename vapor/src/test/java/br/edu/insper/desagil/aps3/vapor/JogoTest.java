package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JogoTest {


    private Jogo jogo;
    private static final double DELTA = 0.000001;
    @BeforeEach
    void setUp(){
        jogo = new Jogo(11,"Overwatch 3");
    }

    @Test
    void constroi(){
        assertEquals(11,jogo.getId());
        assertEquals("Overwatch 3",jogo.getNome());
        assertEquals(0.0,jogo.media(),DELTA);
    }

    @Test
    voi

}
