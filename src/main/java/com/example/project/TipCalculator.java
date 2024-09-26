package com.example.project;

import java.text.DecimalFormat;


public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
        
        DecimalFormat df = new DecimalFormat("###.##");

        
        // System.out.println("The bill before tip: " + cost + "$");
        // System.out.println("Total percetage " + percent + "%");
        double tip = (double)(percent * (cost/100));
        // System.out.println("Total tip: $" + df.format(tip));

        double total = (double)(percent * (cost/100) + cost);
        // System.out.println("Total Bill with tip: $" + df.format(total));

        double PerPersonCost = (double)(cost/people);
        // System.out.println("Per person cost before tip: $" +  df.format(PerPersonCost));

        double TipPerPerson = (double)(tip/people);
        // System.out.println("Tip per person: $" +  df.format(TipPerPerson));

        double TotalPerPerson = PerPersonCost + TipPerPerson;
        // System.out.println("Total cost per person: $" + df.format(TotalPerPerson));


        result.append("-------------------------------\n");
        result.append("Total bill before tip: "+ "$" + cost + "\n" ); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%" + "\n");
        result.append("Total tip: $" + df.format(tip)+ "\n");
        result.append("Total Bill with tip: $" + df.format(total)+ "\n");
        result.append("Per person cost before tip: $" +  df.format(PerPersonCost)+ "\n");
        result.append("Tip per person: $" +  df.format(TipPerPerson)+ "\n");
        result.append("Total cost per person: $" + df.format(TotalPerPerson)+ "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 2; 
        int percent = 5;
        double cost = 29.56;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
