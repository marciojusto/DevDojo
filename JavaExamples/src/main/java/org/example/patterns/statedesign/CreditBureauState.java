package org.example.patterns.statedesign;

import org.example.patterns.statedesign.service.CreditBureauService;

public class CreditBureauState implements DomainState {

    private final CreditBureauService service = new CreditBureauService();

    @Override
    public void nextService(Domain domain) {
        service.getEssentialReport(domain);
        service.getExpertReport(domain);
        service.getCompleteReport(domain);
        System.out.println("This is the final service call");
    }

    @Override
    public void prevService(Domain domain) {
        domain.setState(new VigieServiceState());
    }

    @Override
    public void printService() {
        System.out.println("Calling reports eExpert, eEssential and eComplete");
    }
}
