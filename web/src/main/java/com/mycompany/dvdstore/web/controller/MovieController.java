package com.mycompany.dvdstore.web.controller;

import com.mycompany.dvdstore.core.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private MovieServiceInterface movieService;

    @RequestMapping("/{id}")
    public String displayMovieCard(@PathVariable long id, Model model) {
        model.addAttribute("movie", movieService.getById(id));
        return "movie-details";
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }
}
