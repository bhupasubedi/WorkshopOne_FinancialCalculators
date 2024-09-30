package com.ps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // giving options to a pick a calculator
        Scanner calculator = new Scanner(System.in);
        System.out.println("Calculator 1 : Mortgage calculator");
        System.out.println("Calculator 2 : Future value");

        System.out.println("Pick a Calculator ");
        int cal = calculator.nextInt();

        if (cal == 1) {
            System.out.println("You picked one.");

            // asking questions to user for their input

            System.out.println("what is your loan amount?");
            int loanAmount = calculator.nextInt();
            System.out.println("My loan amount is " + loanAmount);

            System.out.println("What is your interest rate?");
            float interestRate = calculator.nextFloat();
            System.out.println("My interest rate is " + interestRate);

            System.out.println("How many years?");
            int years = calculator.nextInt();
            System.out.println("I have " + years + " years");

            float initialLoan = loanAmount;
            float rate = interestRate;
            float loanLength = years;

            float monthlyRate = rate/12/100;
            float monthlyLoanLength = loanLength*12;

            double monthlyPayment = initialLoan*(monthlyRate/(1-(Math.pow(1+monthlyRate, -monthlyLoanLength))));

            double totalInterest = monthlyPayment*monthlyLoanLength - initialLoan;
            System.out.printf("Monthly Payment: $%.2f, Total Interest: $%.2f", monthlyPayment, totalInterest);


        } else if (cal == 2) {
            System.out.println("You picked two.");

            System.out.println("How much deposit would you like make?");
            int deposit = calculator.nextInt();
            System.out.println("I would make " + deposit + " dollar deposit");

            System.out.println("what is the interest rate?");
            float rate = calculator.nextFloat();
            System.out.println("My interest rate is " + rate);

            System.out.println("How many year?");
            int years = calculator.nextInt();
            System.out.println("For " + years + " years");


            //number 2
            float depositCd = deposit;
            float interestEarns = rate;
            float year = years;


            // a= p(1+r/n)^(nt) FORMULA TO USE

            float yearlyInterest = (interestEarns/100)/365;
            float compoundingPeriod = 365*year;

            double totalYearInterest= depositCd * Math.pow(1+yearlyInterest, compoundingPeriod);

            System.out.println(" Your CD's ending balance will be " + totalYearInterest );

            double intersetEarnedFinal = totalYearInterest- depositCd;
            System.out.println(" you will have earn " + intersetEarnedFinal + " in interest");

        } else {
            System.out.println("Invalid Choice.");






        }

    }
}