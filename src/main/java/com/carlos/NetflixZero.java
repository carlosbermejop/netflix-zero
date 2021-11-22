package com.carlos;

import java.util.Locale;
import java.util.Scanner;

import com.carlos.Exceptions.MoviesException;
import com.carlos.Movies.MoviesManager;

public class NetflixZero {
    public static void main(String[] args) throws MoviesException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Netflix Zero. Please, choose what do you want to do:\n1. Add\n2. Remove\n3. List");
        String userAction = userInput.nextLine();
        switch (userAction.toLowerCase(Locale.ROOT)) {
            case "add", "1":
                MoviesManager.addMovie();
                break;
            case "remove", "2":
                System.out.println("You chose to remove a movie.");
                break;
            case "list", "3":
                System.out.println("You chose to list all available movies.");
                break;
            default:
                System.out.println("I couldn't understand you, please choose what do you want to do:\n1. Add\n2. Remove\n3. List");
        }

    }
}
