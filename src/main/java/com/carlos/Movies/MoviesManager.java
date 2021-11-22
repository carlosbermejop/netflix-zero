package com.carlos.Movies;

import com.carlos.Exceptions.MoviesException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class MoviesManager {
    private static final Logger logger = LoggerFactory.getLogger(MoviesManager.class);
    static Scanner userInput = new Scanner(System.in);

    private MoviesManager() {
        throw new IllegalStateException("Utility class");
    }

    public static void addMovie() {
        logger.info("You chose to add a movie.");
        logger.info("Please enter the name of the movie");
        String movieTitle = userInput.nextLine();
        logger.info("Please enter the genre of the movie");
        String movieGenre = userInput.nextLine();
        logger.info("Please rate the movie");
        int movieRating = userInput.nextInt();
        try {
            Movies movie = new Movies(movieTitle, movieGenre, movieRating);
            logger.info(new StringBuilder().append("Title: ").append(movie.getTitle()).append("\nGenre: ").append(movieGenre).append("\nRating: ").append(movieRating).toString());
        } catch (MoviesException e) {
            logger.error(e.getMessage());
        }
    }
}
