package br.edu.insper.desagil.aps3.vapor;

import java.util.HashMap;
import java.util.Map;

public class Jogo {

    private int id;
    private String nome;
    private Map<String, Integer> avaliacoes;

    public Jogo(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.avaliacoes = new HashMap<>();
    }

    // Getters
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

    public void avalia(String apelido,int avaliacao) {
        avaliacoes.put(apelido,avaliacao);
    }

    public boolean avaliado(String apelido) {
        return avaliacoes.containsKey(apelido);
    }

    public double media() {
        double resultado = 0.0;
        if (!avaliacoes.isEmpty()) {
            for (int avaliacao : avaliacoes.values()){
                resultado += avaliacao;
            }
            return resultado/avaliacoes.size();
        } else {
            return 0.0;
        }
    }
}
