package com.mycompany.dvdstore.web.api;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.service.MovieServiceInterface;
import com.mycompany.dvdstore.web.form.MovieForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieResource {
    @Autowired
    private MovieServiceInterface movieService;

    @GetMapping()
    public List<Movie> list() {
        return movieService.getMovieList();
    }

    @GetMapping("/{id}")
    public Movie get(@PathVariable long id) {
        return movieService.getById(id);
    }

    @PostMapping()
    public Movie add(@RequestBody Movie movie) {
        return movieService.registerMovie(movie);
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }
}
