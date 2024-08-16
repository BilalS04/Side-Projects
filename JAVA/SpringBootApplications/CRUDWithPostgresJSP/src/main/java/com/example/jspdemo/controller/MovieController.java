package com.example.jspdemo.controller;


import com.example.jspdemo.model.Movie;
import com.example.jspdemo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping({"/", "/viewMovieList"})
    public String viewMovieList(@ModelAttribute("message") String message, Model model) {
        model.addAttribute("movieList", movieService.getAllMovies());
        model.addAttribute("message", message);

        return "ViewMovieList";
    }

    @GetMapping("/addMovie")
    public String addMovie(@ModelAttribute("message") String message, Model model) {
        model.addAttribute("movie", new Movie());
        model.addAttribute("message", message);

        return "AddMovie";
    }

    @PostMapping("/saveMovie")
    public String saveMovie(Movie movie, RedirectAttributes redirectAttributes) {
        if(movieService.saveOrUpdate(movie)) {
            redirectAttributes.addFlashAttribute("message", "Movie saved successfully");
            return "redirect:viewMovieList";
        }

        redirectAttributes.addFlashAttribute("message", "Movie save failed");
        return "redirect:/addMovie";
    }

    @GetMapping("/editMovie/{id}")
    public String editMovie(@PathVariable Long id, Model model) {
        model.addAttribute("movie", movieService.getMovieById(id));

        return "EditMovie";
    }

    @PostMapping("/editSaveMovie")
    public String editSaveMovie(Movie movie, RedirectAttributes redirectAttributes) {
        if(movieService.saveOrUpdate(movie)) {
            redirectAttributes.addFlashAttribute("message", "Movie edited successfully");
            return "redirect:viewMovieList";
        }

        redirectAttributes.addFlashAttribute("message", "Movie edit failed");
        return "redirect:/editMovie/" + movie.getId();
    }

    @GetMapping("/deleteMovie/{id}")
    public String deleteMovie(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        if (movieService.deleteMovie(id)) {
            redirectAttributes.addFlashAttribute("message", "Movie deleted successfully");
        } else {
            redirectAttributes.addFlashAttribute("message", "Movie delete failed");
        }
        return "redirect:/viewMovieList";
    }

}
