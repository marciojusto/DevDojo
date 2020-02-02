package org.example.optional.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;

@Data
@AllArgsConstructor
public class Pessoa {

    private Carro carro;
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Optional<Carro> getCarro() {
        return Optional.ofNullable(carro);
    }
}
