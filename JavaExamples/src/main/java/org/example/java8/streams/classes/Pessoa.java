package org.example.java8.streams.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

import static java.util.Arrays.asList;
import static org.example.java8.streams.classes.Genero.FEMININO;
import static org.example.java8.streams.classes.Genero.MASCULINO;

@Data
@AllArgsConstructor
public class Pessoa {

    private String nome;
    private int idade;
    private double Salario;
    private Genero genero;

    public static List<Pessoa> bancoDePessoas() {
        return asList(
                new Pessoa("Pedro", 22, 1000, MASCULINO),
                new Pessoa("Antonio", 23, 2000, MASCULINO),
                new Pessoa("Joao", 17, 3000, MASCULINO),
                new Pessoa("Augusto", 30, 5000, MASCULINO),
                new Pessoa("Maria", 32, 11000, FEMININO),
                new Pessoa("Antonia", 15, 13000, FEMININO),
                new Pessoa("Augusta", 40, 20000, FEMININO),
                new Pessoa("Priscila", 45, 7000, FEMININO)
        );
    }
}