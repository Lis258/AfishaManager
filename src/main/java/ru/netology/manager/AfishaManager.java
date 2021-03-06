package ru.netology.manager;

import ru.netology.domain.Movie;

public class AfishaManager {
    int moviesLimit = 10;

    private Movie[] movies = new Movie[0];

    public AfishaManager() {
    }

    public AfishaManager(int moviesLimit) {
        this.moviesLimit = moviesLimit;
    }

    public void add(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] getAll() {
        Movie[] result = new Movie[Math.min(movies.length, moviesLimit)];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }


}
