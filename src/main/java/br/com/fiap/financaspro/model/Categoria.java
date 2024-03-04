package br.com.fiap.financaspro.model;

import java.util.Random;

// imútavel
public record Categoria(Long id,String nome, String icone ){
    public Categoria(Long id,String nome, String icone ){
        this.id =Math.abs (new Random(0).nextLong() );        this.nome = nome;
        this.icone = icone;
    }
}
