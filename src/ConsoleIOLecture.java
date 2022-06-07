import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
        String cohort = "Go";
        String timeOfDay = "afternoon";
        byte week = 11;
        float someNumber = 123.456F;
//        System.out.printf("Good %s, %s!%n",timeOfDay, cohort);
//        System.out.printf("This is the %dth week of %s cohort.%n", week, cohort);
//        System.out.println("this is going to appear on another line");
//        System.out.printf("The chosen number is %-8.2f%n.", someNumber);

        Scanner scanner = new Scanner(System.in);//listen for command line input
//        System.out.println("Enter a string:");
//        String userInput = scanner.nextLine();
//        System.out.printf("You're input was %s", userInput);

//        System.out.println("Enter an integer:");
//        int userInput = scanner.nextInt();
//        System.out.printf("The number you entered was %d%n", userInput);

        //solving issue with the return key, ghost line
//        String first;
//        String second;
//        System.out.println("Please enter a sentence: ");
//        String ghost = scanner.nextLine();// a line that will store the keystroke, so it doesnt mess up the next scan
//        first = scanner.nextLine();
//        System.out.println("Please enter another sentence: ");
//        second = scanner.nextLine();
//        System.out.println("First sentence: " + first + "\n second sentence: " + second);


        // #2 use next line and parse the integer

//        System.out.println("Enter an integer:");
//        int userInput =Integer.parseInt(scanner.nextLine());// use nextline parse number
//        System.out.printf("The number you entered was %d%n", userInput);
//
//        String first;
//        String second;
//        System.out.println("Please enter a sentence: ");
//        first = scanner.nextLine();
//        System.out.println("Please enter another sentence: ");
//        second = scanner.nextLine();
//        System.out.println("First sentence: " + first + "\n second sentence: " + second);

        //#3 concatenate scanner.next() to absorb the keystroke

//        System.out.println("Enter an integer:");
//        int userInput = scanner.nextInt();
//        System.out.printf("The number you entered was %d%n", userInput);
//
//        String first;
//        String second;
//        System.out.println("Please enter a sentence: ");
//        first = scanner.next() + scanner.nextLine();
//        System.out.println("Please enter another sentence: ");
//        second = scanner.nextLine();
//        System.out.println("First sentence: " + first + "\n second sentence: " + second);
    }
}
