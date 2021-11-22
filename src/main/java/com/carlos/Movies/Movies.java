package com.carlos.Movies;

import com.carlos.Exceptions.MoviesException;
import lombok.Data;

@Data
public class Movies {
    private String title;
    private String genre;
    private int rating;

    public Movies(String title, String genre, int rating) throws MoviesException {
        setTitle(title);
        setGenre(genre);
        setRating(rating);
    }

    public void setRating(int rating) throws MoviesException {
        if (rating > 0 && rating <= 5) {
            this.rating = rating;
        } else {
            throw new MoviesException("Rating exception", "The rating provided was incorrect, please choose a number between 0 and 5.");
        }
    }
}
