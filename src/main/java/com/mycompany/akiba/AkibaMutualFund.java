/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.akiba;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kennethirungu
 */

public class AkibaMutualFund implements FundManager {
    private final List<Fund> funds;

    public AkibaMutualFund() {
        this.funds = new ArrayList<>();
    }

    public void registerInvestor(Investor investor) {
        System.out.println("New investor registered: " + investor.getName());
    }

    public boolean loginInvestor(String ID, String password) {
        // Implementation to authenticate and allow access to investor's account
        return true;
    }

    @Override
    public void addFund(Fund fund) {
        funds.add(fund);
    }

    @Override
    public void displayFunds() {
        System.out.println("Available Funds:");
        for (int i = 0; i < funds.size(); i++) {
            System.out.println((i + 1) + ". " + funds.get(i).getName());
        }
    }
}
