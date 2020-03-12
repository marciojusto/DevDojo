package org.example.patterns.statedesign;

import lombok.Data;

@Data
public class Domain {

    private DomainState state = new VigieServiceState();

    public void previousService() {
        state.prevService(this);
    }

    public void nextService() {
        state.nextService(this);
    }

    public void printService() {
        state.printService();
    }
}
