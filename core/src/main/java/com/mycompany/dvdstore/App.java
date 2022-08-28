package com.mycompany.dvdstore;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "What is the film title ?" );
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        System.out.println( "What is the film genre ?" );
        String genre = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        MovieService movieService = new MovieService();
        movieService.registerMovie(movie);
    }
}
