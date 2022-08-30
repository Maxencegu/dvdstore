package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;

import java.util.Scanner;

public class MovieController {
    private MovieServiceInterface movieService;

    public void addUsingConsole() {
        System.out.println( "What is the film title ?" );
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        System.out.println( "What is the film genre ?" );
        String genre = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        movieService.registerMovie(movie);
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }
}
