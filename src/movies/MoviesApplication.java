package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {

    public static void getMoviesFromCategories(String category, Movie[] movies){
        for(Movie movie: movies){
            if(movie.getCategory().equals(category)){
                System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
            }
        }
    }

    public static void main(String[] args) {
        Input input = new Input();
        Movie[] movies = MoviesArray.findAll();
        int userChoice = -1;
        while(userChoice != 0) {
            System.out.println("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n");
            userChoice = input.getInt("Enter your choice: ");
            switch (userChoice) {
                case 0:
                    break;
                case 1:
                    for (Movie movie : movies) {
                        System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                    }
                    break;
                case 2:
                    getMoviesFromCategories("animated", movies);
                    break;
                case 3:
                    getMoviesFromCategories("drama", movies);
                    break;
                case 4:
                    getMoviesFromCategories("horror", movies);
                    break;
                case 5:
                    getMoviesFromCategories("scifi", movies);
                    break;

            }


        }
    }
}
