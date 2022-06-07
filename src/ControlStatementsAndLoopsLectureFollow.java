import java.util.Scanner;

public class ControlStatementsAndLoopsLectureFollow {
    public static void main(String[] args) {
        //exercise with conditionals
//        short x = 30001;
//
//        if (x < 0) {
//            System.out.println("variable x is negative.");
//        } else if (x >= 0 && x < 30000) {
//            System.out.println("variable x is positive");
//        } else {
//        System.out.println("the variable x is approaching " + Short.MAX_VALUE);
//        }


        //practice with switch
//        String customerChoice;
        Scanner scanner = new Scanner(System.in);
//        System.out.println("What flavor of ice cream do you want?");
//        customerChoice = scanner.nextLine();
//        System.out.printf("%s%n", customerChoice);

//        switch (customerChoice){
//            case "vanilla":
//                System.out.println("one vanilla coming right up");
//                break;
//            case "chocolate":
//                System.out.println("one chocolate coming right up");
//                break;
//            case "strawberry":
//                System.out.println("one strawberry coming right up");
//                break;
//            default:
//                System.out.println("Sorry we dont have that flavor");
//                break;
//        }

        //enhanced switch statement
//        switch (customerChoice) {
//            case "vanilla" -> System.out.println("one vanilla coming right up");
//            case "chocolate" -> System.out.println("one chocolate coming right up");
//            case "strawberry" -> System.out.println("one strawberry coming right up");
//            default -> System.out.println("Sorry we dont have that flavor");
//        }

        // operators

        // if && will short circuit the function, if & the code will still run even if the first side is false
//        int c = 0, d = 100, e = 50;// establish several variable at once
//        if (c == 1 && e++ < 100){
//            d = 150;
//        }
//        System.out.println("e = " + e);
//        System.out.println("d = " + d);

//        int c = 0, d = 100, e = 50;// establish several variable at once
//        if (c == 1 & e++ < 100){
//            d = 150;
//        }
//        System.out.println("e = " + e);
//        System.out.println("d = " + d);

//        int number = 42;
//        boolean existence = true;

        // short circuit logical OR operator
        //the || will short circuit if the first condition is true
//        if (existence || number++ == 42){
//            System.out.println(number);
//        }

        // non short circuit logical OR operator
        //the | will continue evaluating conditions even if the first condition is true
//        if (existence | number++ == 42){
//            System.out.println(number);
//        }

        // Loops *
        //set loop control variable
//        int i = 0;
//        //check value of loop control variable
//        while(i < 5) {
//            System.out.println("this is inside the loop befor i is incremented. the value of i is:" + i);
//            i = i + 1;
//            System.out.println(" this is still in the loop but after the increment i is:" + i);
//        }

        //set loop control/ good for if you only need it to run once
//        int i = 0;
//        do {
//            System.out.println("this is inside the loop befor i is incremented. the value of i is:" + i);
//            i = i + 1;
//            System.out.println(" this is still in the loop but after the increment i is:" + i);
//        } while (i < 5);

//        int i;
//        for (i = 0; i < 5; i++){
//            System.out.println("I'm in the loop. i has not incremented yet though. i is:" + i);
//        }
//        System.out.println("this is outside the loop. notice i has incremented. i is: " + i);

    }
}
