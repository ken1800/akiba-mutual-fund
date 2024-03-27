 
package com.mycompany.akiba;

import java.util.Scanner;

class Akiba {
    public static void main(String[] args) {
        AkibaMutualFund akibaMutualFund = new AkibaMutualFund();

        // Create sample objects
        Fund fund1 = new Fund("Akiba Money Market Fund", "Low-risk", "Capital preservation", 5000, 2.00);
        Fund fund2 = new Fund("Akiba Balanced Fund", "Moderate-risk", "Balanced returns", 10000, 1.75);
        
        // Add funds to AkibaMutualFund
        akibaMutualFund.addFund(fund1);
        akibaMutualFund.addFund(fund2);
        
        // Application logic
        System.out.println("Welcome to Akiba Mutual Fund!");

        // Register investor
        Scanner scanner = new Scanner(System.in);
        
        // Get Investors Details
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your ID: ");
        String id = scanner.nextLine();
        System.out.println("Enter your initial investment: ");
        double initialInvestment = scanner.nextDouble();
        Investor investor1 = new Investor(name, id, initialInvestment);
        akibaMutualFund.registerInvestor(investor1);

        // Login investor
        boolean isAuthenticated = akibaMutualFund.loginInvestor(investor1.getID(), "password");

      if (isAuthenticated) {
            System.out.println("Login successful!");
            // Display available funds
            akibaMutualFund.displayFunds();

            // Select fund
            System.out.println("Enter the fund number you want to select: ");
            int fundNumber = scanner.nextInt();

            Fund selectedFund;
            
            if(fundNumber == 1) {
                selectedFund = fund1;
            } else if (fundNumber == 2) {
                selectedFund = fund2;
            } else {
                System.out.println("Invalid fund selection.");
                return;
            }

            // Perform actions on selected fund
            selectedFund.invest(investor1); // Example invest action

            // View holdings
            selectedFund.displayHoldings();
        } else {
            System.out.println("Login failed. Invalid credentials.");
        }
    }
}
