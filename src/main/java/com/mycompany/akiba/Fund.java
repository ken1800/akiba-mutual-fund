/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.akiba;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author kennethirungu
 */


// Fund class
public class Fund implements FundInvestor {
    private String name;
    private String riskProfile;
    private String objective;
    private double minimumInvestment;
    private double managementFee;
    private List<Asset> holdings;

    public Fund(String name, String riskProfile, String objective, double minimumInvestment, double managementFee) {
        this.name = name;
        this.riskProfile = riskProfile;
        this.objective = objective;
        this.minimumInvestment = minimumInvestment;
        this.managementFee = managementFee;
        this.holdings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRiskProfile() {
        return riskProfile;
    }

    public void setRiskProfile(String riskProfile) {
        this.riskProfile = riskProfile;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public double getMinimumInvestment() {
        return minimumInvestment;
    }

    public void setMinimumInvestment(double minimumInvestment) {
        this.minimumInvestment = minimumInvestment;
    }

    public double getManagementFee() {
        return managementFee;
    }

    public void setManagementFee(double managementFee) {
        this.managementFee = managementFee;
    }

    public List<Asset> getHoldings() {
        return holdings;
    }

    public void setHoldings(List<Asset> holdings) {
        this.holdings = holdings;
    }

    @Override
    public void invest(Investor investor) {
        // Implementation to invest in the fund
        System.out.println(investor.getName() + " has invested " + investor.getAccountBalance() + " in " + this.name);
    }
    
    @Override
    public void redeem(Investor investor, double amount) {
        // Implementation to redeem from the fund
        System.out.println(investor.getName() + " has redeemed " + amount + " from " + this.name);
    }

    public void displayHoldings() {
        System.out.println("Holdings for " + this.name + ":");
        for (Asset asset : holdings) {
            System.out.println(asset.getName() + " - Quantity: " + asset.getQuantity());
        }
    }
}