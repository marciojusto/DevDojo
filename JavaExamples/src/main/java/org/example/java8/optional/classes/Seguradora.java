package org.example.java8.optional.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seguradora {

    private String nome;

    public String getNome() {
        return nome;
    }
}
