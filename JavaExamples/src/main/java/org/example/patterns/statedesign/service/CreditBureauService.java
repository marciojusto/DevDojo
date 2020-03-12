package org.example.patterns.statedesign.service;

import org.example.patterns.statedesign.Domain;

public class CreditBureauService {

    public void getEssentialReport(Domain domain) {
        System.out.println("Getting the eEssential report");
    }

    public void getExpertReport(Domain domain) {
        System.out.println("Getting the eExpert report");
    }

    public void getCompleteReport(Domain domain) {
        System.out.println("Getting the eComplete report");
    }
}
