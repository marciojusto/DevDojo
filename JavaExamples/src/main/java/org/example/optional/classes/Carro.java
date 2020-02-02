package org.example.optional.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;

@Data
@AllArgsConstructor
public class Carro {

    private Seguradora seguradora;
    private String nome;

    public Optional<Seguradora> getSeguradora(){
        return Optional.ofNullable(seguradora);
    }
}
