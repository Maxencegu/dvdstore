package com.mycompany.dvdstore.core.service;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.repository.MovieRepositoryInterface;

import java.util.List;

public interface MovieServiceInterface {
    void registerMovie(Movie movie);
    List<Movie> getMovieList();

    void setMovieRepository(MovieRepositoryInterface movieRepository);
}
