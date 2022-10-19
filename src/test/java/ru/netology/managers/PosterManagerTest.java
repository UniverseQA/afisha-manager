package ru.netology.managers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.managers.PosterManager;

public class PosterManagerTest {

    @Test
    public void shouldAddNewMovies() {
        PosterManager manager = new PosterManager();

        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");

        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        PosterManager manager = new PosterManager();

        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        manager.addMovie("Movie 6");
        manager.addMovie("Movie 7");
        manager.addMovie("Movie 8");
        manager.addMovie("Movie 9");
        manager.addMovie("Movie 10");
        manager.addMovie("Movie 11");
        manager.addMovie("Movie 12");

        String[] expected = {"Movie 12", "Movie 11", "Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastOutOf9Limit() {
        PosterManager manager = new PosterManager(9);

        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        manager.addMovie("Movie 6");
        manager.addMovie("Movie 7");
        manager.addMovie("Movie 8");
        manager.addMovie("Movie 9");

        String[] expected = {"Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast10() {
        PosterManager manager = new PosterManager(10);

        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        manager.addMovie("Movie 6");
        manager.addMovie("Movie 7");
        manager.addMovie("Movie 8");
        manager.addMovie("Movie 9");
        manager.addMovie("Movie 10");
        manager.addMovie("Movie 11");
        manager.addMovie("Movie 12");

        String[] expected = {"Movie 12", "Movie 11", "Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast0() {
        PosterManager manager = new PosterManager(0);

        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        manager.addMovie("Movie 6");
        manager.addMovie("Movie 7");
        manager.addMovie("Movie 8");
        manager.addMovie("Movie 9");
        manager.addMovie("Movie 10");
        manager.addMovie("Movie 11");
        manager.addMovie("Movie 12");

        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast15() {
        PosterManager manager = new PosterManager(15);

        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        manager.addMovie("Movie 6");
        manager.addMovie("Movie 7");
        manager.addMovie("Movie 8");
        manager.addMovie("Movie 9");
        manager.addMovie("Movie 10");
        manager.addMovie("Movie 11");
        manager.addMovie("Movie 12");

        String[] expected = {"Movie 12", "Movie 11", "Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
