package br.com.fiap.financaspro.model;

import java.util.Random;

// imútavel
public record Categoria(Long id,String nome, String icone ){


    public Categoria(Long id,String nome, String icone ){
        var key = (id == null) ? Math.abs( new Random().nextLong() ) : id; //Ramdomizar o ID
        this.id = key;
        this.nome = nome;
        this.icone = icone;
    }
}
