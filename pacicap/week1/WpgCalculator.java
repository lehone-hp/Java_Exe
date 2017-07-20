//world population growth calculator
import java.util.Scanner;
public class WpgCalculator
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      double currentPop;
      double growthRate;
      double annualPopIncrease;
      double estimatedPop;
      
      System.out.print ("Entre Current World population: ");
      currentPop = input.nextLong();
      System.out.print ("Enter annual population growth rate: ");
      growthRate = input.nextLong();
      
      annualPopIncrease = (growthRate / 100) * currentPop;
      estimatedPop = currentPop + annualPopIncrease;
      
      System.out.println ();
      
      System.out.println ("Estimated population after one year:    " + estimatedPop);
      System.out.println ("Estimated population after two years:    " + estimatedPop + (annualPopIncrease * 2));
      System.out.println ("Estimated population after three years:    " + estimatedPop + (annualPopIncrease * 3));
      System.out.println ("Estimated population after four years:    " + estimatedPop + (annualPopIncrease * 4));  
      System.out.println ("Estimated population after five years:    " + estimatedPop + (annualPopIncrease * 5));
               
   }
}
