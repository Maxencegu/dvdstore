package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import com.mycompany.dvdstore.service.MovieService;
import com.mycompany.dvdstore.service.MovieServiceInterface;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        MovieController movieController = new MovieController();
        MovieServiceInterface movieService = new MovieService();
        MovieRepositoryInterface movieRepository = new GoLiveMovieRepository();
        movieService.setMovieRepository(movieRepository);
        movieController.setMovieService(movieService);

        movieController.addUsingConsole();
    }
}
