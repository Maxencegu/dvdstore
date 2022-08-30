package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import com.mycompany.dvdstore.service.MovieServiceInterface;

public class App 
{
    public static void main( String[] args )
    {
        try {
            MovieController movieController = new MovieController();
            MovieServiceInterface movieService = (MovieServiceInterface)Class.forName("com.mycompany.dvdstore.service.DefaultMovieService").getDeclaredConstructor().newInstance();
            MovieRepositoryInterface movieRepository = (MovieRepositoryInterface)Class.forName("com.mycompany.dvdstore.repository.FileMovieRepository").getDeclaredConstructor().newInstance();

            movieService.setMovieRepository(movieRepository);
            movieController.setMovieService(movieService);

            movieController.addUsingConsole();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
