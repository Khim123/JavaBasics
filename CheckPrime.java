/**
  * NAME:
  * DATE:
  * FILE:
  * COMMENTS:
  */


import java.util.*;
public class CheckPrime 
{
   public static void main(String[] args)
   {
      // declare variables
      
      int i = 2;
      int number;
      int result;

      Scanner s = new Scanner(System.in);
      System.out.println("Enter a number to check if its prime");
      number = s.nextInt();

      while(number <= 0) {
        System.out.println("Enter a positive number");
        number = s.nextInt();
      }
        
      while (number % i == 0 || i <= (int)(Math.sqrt(number))){
        result = number % i; 
        i++;
        if (result == 0)
         {
         System.out.println("number " + number + "  is not prime. ");
         System.exit(0);
         }
      }

      System.out.println(" number " + number + "  is prime. ");
   } // close main
} // close hw1raptor
