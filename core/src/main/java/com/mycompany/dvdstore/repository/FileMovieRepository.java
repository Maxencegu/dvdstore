package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;
import org.springframework.beans.factory.annotation.Value;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class FileMovieRepository implements MovieRepositoryInterface {
    @Value("${movies.file.location}")
    private File file;

    public void add(Movie movie) {
        try(FileWriter writer = new FileWriter(file,true)) {
            writer.write(movie.getTitle() + ";" + movie.getGenre() + "\n");
            System.out.println("The movie " + movie.getTitle() + " has been added.");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
