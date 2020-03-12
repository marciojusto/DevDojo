package org.example.patterns.statedesign;

public class ServiceStateDemo {

    public static void main(String[] args) {

        Domain domain = new Domain();
        domain.printService();

        domain.nextService();
        domain.printService();

        domain.nextService();
    }
}
