package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

public class MovieController {
    private final MovieService movieService = new MovieService();

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
}
