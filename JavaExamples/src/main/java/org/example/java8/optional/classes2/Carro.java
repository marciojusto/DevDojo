package org.example.java8.optional.classes2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Carro {

    private Seguradora seguradora;
    private String nome;

    public String getNomeSeguradora(Pessoa pessoa) {
        if (pessoa != null) {
            Carro carro = pessoa.getCarro();
            if(carro != null) {
                Seguradora seguradora = carro.getSeguradora();
                if(seguradora != null) {
                    return seguradora.getNome();
                }
            }
        }
        return "";
    }
}
