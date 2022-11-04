package ru.netology.managers;

public class PosterManager {
    private int defaultLimit = 10;
    private int limit;
    private String[] allMovies = new String[0];

    public PosterManager() {
        this.limit = defaultLimit;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void addMovie(String movieName) {
        String[] tmp = new String[allMovies.length + 1];
        for (int i = 0; i < allMovies.length; i++) {
            tmp[i] = allMovies[i];
        }
        tmp[tmp.length - 1] = movieName;
        allMovies = tmp;
    }

    public String[] findAll() {
        return allMovies;
    }

    public String[] findLast() {
        int newLimit;
        if (allMovies.length < limit) {
            newLimit = allMovies.length;
        } else {
            newLimit = limit;
        }
            String[] tmp = new String[newLimit];
            for (int i = 0; i < newLimit; i++) {
                tmp[i] = allMovies[allMovies.length - 1 - i];
            }
            return tmp;
        }
}
