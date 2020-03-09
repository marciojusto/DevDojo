package org.example.generics.test;

import lombok.Data;

import java.util.List;

import static java.util.Arrays.asList;

public class GenericsWildCardTest {

    public static void main(String[] args) {
        List<Cachorro> cachorros = asList(new Cachorro(), new Cachorro());
        List<Gato> gatos = asList(new Gato(), new Gato());
        consultarAnimaisList(gatos);
        consultarAnimaisList(cachorros);
        consultarCachorroList(cachorros);
    }

    //Qualquer objeto que extenda animal poderá ser passado para a lista, mas não poderá ser adicionado.
    public static void consultarAnimaisList(List<? extends Animal> animals) {
        for (Animal animal: animals) {
            animal.consulta();
        }
    }

    //Qualquer classe que seja Cachorro ou Super Classe de Cachorro
    public static void consultarCachorroList(List<? super Cachorro> cachorros) {
        cachorros.forEach(System.out::println);
    }
}

abstract class Animal {
    public abstract void consulta();
}

@Data
class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando Cachorro");
    }
}

@Data
class Gato extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando Gato");
    }
}
