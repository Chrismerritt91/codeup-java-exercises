import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //1.
//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }

        //do-while
//        int i = 100;
//        do{
//            i-=5;
//            System.out.println(i);
//        }while(i > -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i*=i;
//        }while(i < 1000000);

        //for
//        for (int i = 100; i > -10 ; i-=5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i < 1000000 ; i*=i) {
//            System.out.println(i);
//        }

        //2. FizzBuzz
//        for (int i = 1; i <= 100; i++) {
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//                continue;
//            }
//            if(i % 3 == 0){
//                System.out.println("Fizz");
//                continue;
//            }
//            if(i % 5 == 0){
//                System.out.println("Buzz");
//                continue;
//            }
//            System.out.println(i);
//
//        }
                //or
//        for (int i = 1; i <= 100; i++) {
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            }else if(i % 3 == 0){
//                System.out.println("Fizz");
//            } else if(i % 5 == 0){
//                System.out.println("Buzz");
//            }
//            System.out.println(i);
//
//        }

        //3.
        boolean willContinue = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What number would you like to go up to?");
            int input = scanner.nextInt();
            System.out.printf("Here is your table!%n");
            System.out.printf("number | squared | cubed%n");
            System.out.printf("------ | ------- | -----%n");
            for (int i = 1; i <= input; i++) {
                System.out.println(i + "      | " + (i * i) + "       | " + (i * i * i) + "     ");
            }
            System.out.println("Would you like to continue?");
            String userResponse = scanner.next();
            if (userResponse.equalsIgnoreCase("y")) {
                willContinue = false;
            }
        }while(willContinue);

        //4.
//        boolean anotherGrade = true;
//        do{
//        System.out.println("What was your score?");
//        int input = scanner.nextInt();
//        if (input <= 100 && input >= 95) {
//            System.out.println("A+");
//        } else if (input <= 94 && input >= 88) {
//            System.out.println("A-");
//        } else if (input <= 87 && input >= 84) {
//            System.out.println("B+");
//        } else if (input <= 83 && input >= 80) {
//            System.out.println("B-");
//        } else if (input <= 79 && input >= 74) {
//            System.out.println("C+");
//        } else if (input <= 73 && input >= 67) {
//            System.out.println("C-");
//        } else if (input <= 66 && input >= 64) {
//            System.out.println("D+");
//        } else if (input <= 63 && input >= 60) {
//            System.out.println("D-");
//        } else {
//            System.out.println("F");
//        }
//        System.out.println("Would you like to continue?");
//        String userResponse = scanner.next();
//        if (!userResponse.equalsIgnoreCase("y")) {
//            anotherGrade = false;
//        }}while(anotherGrade);


    }
}
