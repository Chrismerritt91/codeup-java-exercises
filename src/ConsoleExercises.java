import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        //#1
        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.", pi);
        System.out.format("The value of pi is approximately %.2f%n", pi);

        //#2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int inputInt = scanner.nextInt();
        // input hello, exception to main error appeared

        System.out.println("Please enter three words, one at a time: ");
        String first =scanner.next() + scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();
        System.out.printf("Your words were:%n %s,%n %s,%n %s%n", first, second, third);
        //if you dont enter a third word it will not run and if you hit enter it will display an empty line.

        System.out.println("Please enter a sentence: ");
        String userIn = scanner.nextLine();
        System.out.printf("The sentence you entered was:%n %s%n", userIn);
        // if you only use next it will only display the next word not the whole string, if you use the nextline method it will show the whole string.

        //#3
        System.out.println("Please enter a length: ");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter a width: ");
        int width = Integer.parseInt(scanner.nextLine());
        int perimeter = (length + width) * 2;
        int area = length * width;
        System.out.printf("Your room has a perimeter of: %d%n", perimeter);
        System.out.printf("Your room has an area of: %d", area);



    }
}
