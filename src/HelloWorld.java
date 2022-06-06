public class HelloWorld {
    public static void main(String[] args){
//        System.out.println("Hello, World!");

//        int myFavoriteNumber = 3;
//        System.out.println(myFavoriteNumber);

//        String myString = "this is my string";
//        System.out.println(myString);

     // #3 char myString = "this is my string";
        //a string is not a character


//     #4  String myString = 3.14159;
       //looking for a string an int doesn't work

        //#5 says variable was not initialized

        //#6 says possible lossy conversion from double to long

        //#7 code works with L

        //#8 the number with the point causes the IDE to think that the number is a double, instead of an int

        //#9 says lossy conversion from double to float, to fix put an F, or cast the value
//        float myNumber = 3.14F;
//        float myNumber = (float)3.14;
//        System.out.println(myNumber);

        //#10
//        int x = 5;
//        System.out.println(x++);  5
//        System.out.println(x);  6

//        int x = 5;
//        System.out.println(++x);  6
//        System.out.println(x);  6

        // the first block does a post increment while the second does a pre increment

        //#11
//        String class = "hello"
                //class is a keyword

        // #12
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);
        // you cant turn a string into an int- i was correct

//        int three = (int) "three";
//        System.out.println(three);
        // same thought - still cannot be converted

        // the bottom problem was just a conversion issue, the top block shows an error regarding the ClassCastException

        //#13
//        int x = 4;
//      System.out.println(x = x + 5);
//        System.out.println(x += 5); // shorthand

//        int x = 3;
//        int y = 4;
//        System.out.println(y = y * x);
//        System.out.println(y *= x); // shorthand

//        int x = 10;
//        int y = 2;
//        System.out.println(x = x / y);
//        System.out.println(x /= y); // shorthand

//        System.out.println(y = y - x);
//        System.out.println(y -= x); // shorthand


        //during our lecture we experimented with this between the float and double types,and it will trim the input down to the maximum number of characters. Then with long and byte types the long will actually be cut down to size to get the number to fit, our return was 0, and if you do not cast the type it will error out.
    }
}
