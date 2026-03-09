package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    void avaliaUmaVez(){
        jogo.avalia("Bom_de_Guerra", 3);
        assertEquals(3.0,jogo.media(),DELTA);
        assertTrue(jogo.avaliado("Bom_de_Guerra"));
        assertFalse(jogo.avaliado("Rei_barbaro"));
    }

    @Test
    void avaliaDuasVezes(){
        jogo.avalia("Bom_de_Guerra", 3);
        jogo.avalia("Rei_barbaro",4);
        assertEquals(3.5,jogo.media(),DELTA);
        assertTrue(jogo.avaliado("Bom_de_Guerra"));
        assertTrue(jogo.avaliado("Rei_barbaro"));
    }

    @Test
    void avaliaTresVezes(){
        jogo.avalia("Bom_de_Guerra", 3);
        jogo.avalia("Rei_barbaro",4);
        jogo.avalia("Bom_de_Guerra", 5);
        assertEquals(4.5,jogo.media(),DELTA);
    }






}
