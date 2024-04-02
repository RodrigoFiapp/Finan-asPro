package br.com.fiap.financaspro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
// Para gerar todos é só usar um @Data
//@Data
@Entity // tranforma a classe e seus atributos em uma tabela para o SQL
public class Categoria extends Object{
    
//Auto Incremento de ID'S
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String icone;
}
