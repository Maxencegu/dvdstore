package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;

import java.util.List;

public interface MovieServiceInterface {
    void registerMovie(Movie movie);
    List<Movie> getMovieList();

    void setMovieRepository(MovieRepositoryInterface movieRepository);
}
