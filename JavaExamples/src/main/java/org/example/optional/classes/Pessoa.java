package org.example.optional.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Pessoa {

    @NonNull
    private Carro carro;
    @NonNull
    private String nome;
    private int idade;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Optional<Carro> getCarro() {
        return Optional.ofNullable(carro);
    }
}
