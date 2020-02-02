package org.example.optional.classes2;

import lombok.Data;

@Data
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
