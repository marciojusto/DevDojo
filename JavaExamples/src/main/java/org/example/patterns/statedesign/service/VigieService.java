package org.example.patterns.statedesign.service;

import org.example.patterns.statedesign.Domain;

public class VigieService {

    public void getClientInfo(Domain domain) {
        System.out.println("Getting the Client Info");
    }

    public void getPartnerInfo(Domain domain) {
        System.out.println("Getting the Partner Info");
    }

    public void getProposalInfo(Domain domain) {
        System.out.println("Getting the Proposal info");
    }
}
