package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;

public class GoLiveMovieRepository implements MovieRepositoryInterface {

    public void add(Movie movie) {
        try(FileWriter writer = new FileWriter("C:\\temp\\movies.txt",true)) {
            writer.write(movie.getTitle() + ";" + movie.getGenre() + "\n");
            System.out.println("The movie " + movie.getTitle() + " has been added.");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
