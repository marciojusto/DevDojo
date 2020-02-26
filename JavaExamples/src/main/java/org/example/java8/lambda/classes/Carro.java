package org.example.java8.lambda.classes;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Carro {

    private String nome;

    @NonNull
    private String color;

    @NonNull
    private Integer ano;
}
