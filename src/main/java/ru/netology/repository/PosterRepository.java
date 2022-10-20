package ru.netology.repository;

import ru.netology.managers.PosterManager;

public class PosterRepository {

    private PosterManager manager;

    public PosterRepository(PosterManager manager) {
        this.manager = manager;
    }

    public void save(PosterManager manager) {
        manager.addMovie();
    }

}
