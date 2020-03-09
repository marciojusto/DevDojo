package org.example.generics.test;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest {

    public static void main(String[] args) {
        criarArray(new Cachorro());
        System.out.println(criarLista(new Cachorro()));
    }

    public static <T> void criarArray(T t) {
        List<T> lista = new ArrayList<>();
        lista.add(t);
        System.out.println(lista);
    }

    public static <T> List<T> criarLista(T t) {
        List<T> lista = new ArrayList<>();
        lista.add(t);
        return lista;
    }

    public static <T extends Animal> void criarArrayCachorro(T t) {
        List<T> lista = new ArrayList<>();
        lista.add(t);
        System.out.println(lista);
    }
}
