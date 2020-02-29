package org.example.generics.test;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class ClasseGenericaTest {

    public static void main(String[] args) {
//        CarroAlugavel carroAlugavel = new CarroAlugavel();
//        Carro carroAlugado = carroAlugavel.getCarroDisponivel();
//        System.out.println("Usando o carro por um mês");
//        carroAlugavel.devolverCarro(carroAlugado);

        List<Carro> carrosDisponiveis = new ArrayList<>(
                asList( new Carro("Gol"),
                        new Carro("BMW"))
        );
        ObjetoAlugavel<Carro> carroAlugavel = new ObjetoAlugavel<>(carrosDisponiveis);
        Carro carroAlugado = carroAlugavel.getObjetoDisponivel();
        System.out.println("Usando o carro por um mês");
        carroAlugavel.devolverObjeto(carroAlugado);
    }
}

@AllArgsConstructor
class ObjetoAlugavel<T> {
    private List<T> objetosDisponiveis;

    public T getObjetoDisponivel() {
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto" + t);
        System.out.println("Objetos disponíveis: " + objetosDisponiveis);
        return t;
    }
    public void devolverObjeto(T t) {
        System.out.println("Devolvendo objeto: " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponíveis: " + objetosDisponiveis);
    }
}

@Data
@AllArgsConstructor
class Carro {
    private String nome;
}

class CarroAlugavel {
    private List<Carro> carrosDisponiveis = new ArrayList<>();
    {
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
    }
    public Carro getCarroDisponivel() {
        Carro c = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro" + c);
        System.out.println("Carros disponíveis: " + carrosDisponiveis);
        return c;
    }
    public void devolverCarro(Carro c) {
        System.out.println("Devolvendo carro: " + c);
        carrosDisponiveis.add(c);
        System.out.println("Carros disponíveis: " + carrosDisponiveis);
    }
}
