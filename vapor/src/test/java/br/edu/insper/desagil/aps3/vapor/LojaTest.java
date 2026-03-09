package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LojaTest {
    Loja loja;
    Usuario usuario;
    List<Jogo> jogos;

    @BeforeEach
    void setUp(){
        usuario = new Usuario("Bom_de_guerra","Cleiton");
        jogos = new ArrayList<>();
        loja = new Loja(jogos,usuario);
    }

    @Test
    void constroi(){
        assertEquals(usuario,loja.getUsuario());
        assertEquals(0,loja.numeroAvaliados(usuario));
    }

    @Test
    void umUsuarioAvaliaUmJogo(){
        Jogo jogo1 = new Jogo(1,"Overwatch 3");
        jogos.add(jogo1);
        jogo1.avalia("Bom_de_guerra",10);
        assertEquals(1,loja.numeroAvaliados(usuario));
    }

    @Test
    void umUsuarioAvaliaDoisJogos(){
        Jogo jogo1 = new Jogo(1,"Overwatch 3");
        Jogo jogo2 = new Jogo(2,"Overwatch 4");

        jogos.add(jogo1);
        jogos.add(jogo2);

        jogo1.avalia("Bom_de_guerra",10);
        jogo2.avalia("Bom_de_guerra",10);
        assertEquals(2,loja.numeroAvaliados(usuario));

    }

    @Test
    void doisUsuariosAvaliamUmJogo(){
        Usuario usuario2 = new Usuario("Rei_Barbaro","Bob");
        Jogo jogo1 = new Jogo(1,"Overwatch 3");
        jogos.add(jogo1);
        jogo1.avalia("Bom_de_guerra",10);
        jogo1.avalia("Rei_Barbaro",9);
        assertEquals(1,loja.numeroAvaliados(usuario));
        assertEquals(1,loja.numeroAvaliados(usuario2));
    }

    @Test
    void doisUsuariosAvaliamDoisJogos(){
        Usuario usuario2 = new Usuario("Rei_Barbaro","Bob");
        Jogo jogo1 = new Jogo(1,"Overwatch 3");
        Jogo jogo2 = new Jogo(2,"Overwatch 4");
        jogos.add(jogo1);
        jogos.add(jogo2);
        jogo1.avalia("Bom_de_guerra",10);
        jogo2.avalia("Rei_Barbaro",9);
        assertEquals(1,loja.numeroAvaliados(usuario));
        assertEquals(1,loja.numeroAvaliados(usuario2));
    }


}
