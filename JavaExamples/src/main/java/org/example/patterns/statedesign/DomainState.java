package org.example.patterns.statedesign;

public interface DomainState {

    void nextService(Domain domain);
    void prevService(Domain domain);
    void printService();
}
