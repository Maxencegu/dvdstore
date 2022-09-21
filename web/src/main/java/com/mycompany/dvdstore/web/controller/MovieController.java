package com.mycompany.dvdstore.web.controller;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.service.MovieServiceInterface;
import com.mycompany.dvdstore.web.form.MovieForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private MovieServiceInterface movieService;

    @GetMapping("/{id}")
    public String displayMovieCard(@PathVariable long id, Model model) {
        model.addAttribute("movie", movieService.getById(id));
        return "movie-details";
    }

    @PostMapping()
    public String createMovie(@Valid @ModelAttribute MovieForm movieForm, BindingResult results) {
        if(results.hasErrors()) {
            return "add-movie-form";
        }
        Movie movie = new Movie();
        movie.setGenre(movieForm.getGenre());
        movie.setTitle(movieForm.getTitle());
        movie.setDescription(movieForm.getDescription());
        movieService.registerMovie(movie);
        return "movie-added";
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }
}
