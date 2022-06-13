package util;

import java.util.Scanner;

public class Input {


   private Scanner scanner;

   public Input(){
       this.scanner = new Scanner(System.in);
   }

    public String getString(String prompt){
        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();
        return prompt + userInput;
    }

    public boolean yesNo(){
        System.out.println("Give a yes or no answer: ");
        String userInput = scanner.nextLine();
        if(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")){
            return true;
        }else {
            return false;
        }
    }

    public int getInt(int min, int max){
        System.out.println("Enter a number between 1 and 10");
        int userInt = scanner.nextInt();
        if(userInt >= min && userInt <= max){
            return userInt;
        } else{
            System.out.println("Input out of range!");
            return getInt(min, max);
        }
    }

    public int getInt(){
        System.out.println("Enter a number: ");
        int userInt = scanner.nextInt();
        return userInt;
   }

   public double getDouble(double min, double max){
       System.out.println("Please enter a number between 1 and 10: ");
       double userNum = scanner.nextDouble();
       if(userNum >= min && userNum <= max){
           return userNum;
       } else{
           System.out.println("Input out of range!");
           return getDouble(min, max);
       }
   }

   public double getDouble(){
       System.out.println("Please enter number: ");
       double userNum = scanner.nextDouble();
       return userNum;
   }
}
