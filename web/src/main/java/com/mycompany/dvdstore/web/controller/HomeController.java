package com.mycompany.dvdstore.web.controller;

import com.mycompany.dvdstore.core.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    @Autowired
    MovieServiceInterface movieService;

    @RequestMapping("/home")
    public String displayHome(Model model) {
        System.out.println("displayHome");
        model.addAttribute("movies", movieService.getMovieList());
        return "dvdstore-home";
    }
}
