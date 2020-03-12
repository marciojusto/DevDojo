package org.example.patterns.statedesign;

import org.example.patterns.statedesign.service.VigieService;

public class VigieServiceState implements DomainState {

    private final VigieService service = new VigieService();

    @Override
    public void nextService(Domain domain) {
        service.getProposalInfo(domain);
        service.getPartnerInfo(domain);
        service.getClientInfo(domain);
        domain.setState(new CreditBureauState());
    }

    @Override
    public void prevService(Domain domain) {
        System.out.println("This is the first state");
    }

    @Override
    public void printService() {
        System.out.println("Obtaining data from Proposal, Client and Partner, next it'll call the reports");
    }
}
