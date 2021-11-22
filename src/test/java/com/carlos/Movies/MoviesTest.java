package com.carlos.Movies;

import com.carlos.Exceptions.MoviesException;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class MoviesTest {

    private static final Logger logger = LoggerFactory.getLogger(MoviesTest.class);

    @Test
    @Order(1)
    public void testMoviesConstructor() {
        try {
            Movies movie = new Movies("Gone With the Wind", "Drama", 5);
            assertEquals("Gone With the Wind", movie.getTitle());
            assertEquals("Drama", movie.getGenre());
            assertEquals(5, movie.getRating());
        } catch (MoviesException e) {
            logger.error("Unexpected exception thrown by the constructor: " + e);
        }
    }

    @Test
    @Order(2)
    public void testRatingException() {
        assertThrows(MoviesException.class,
                () -> new Movies("Gone With the Wind", "Drama", 9));
    }
}
