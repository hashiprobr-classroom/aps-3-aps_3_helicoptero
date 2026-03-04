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

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void avalia(String apelido,int avaliacao){
        avaliacoes.put(apelido,avaliacao);
    }

    public boolean avaliado(String apelido){
        if (avaliacoes.containsKey(apelido)){
            return true;
        }
        else{
            return false;
        }
    }

    public double media(){
        double resultado = 0.0;
        int i = 0;
        if (!avaliacoes.isEmpty()){
            for (int avaliacao : avaliacoes.values()){
                resultado += avaliacao;
                i ++;
            }
            return resultado/i;
        }
        else{
            return 0.0;
        }
    }

}
