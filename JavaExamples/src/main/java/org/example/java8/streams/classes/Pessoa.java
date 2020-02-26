package org.example.java8.streams.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

import static java.util.Arrays.asList;

@Data
@AllArgsConstructor
public class Pessoa {

    private String nome;
    private int idade;
    private double Salario;

    public static List<Pessoa> bancoDePessoas() {
        return asList(
                new Pessoa("Pedro", 22, 1000),
                new Pessoa("Antonio", 23, 2000),
                new Pessoa("Joao", 24, 3000),
                new Pessoa("Augusto", 30, 5000),
                new Pessoa("Maria", 32, 11000),
                new Pessoa("Antonia", 33, 13000),
                new Pessoa("Augusta", 40, 20000),
                new Pessoa("Priscila", 45, 7000)
        );
    }
}
