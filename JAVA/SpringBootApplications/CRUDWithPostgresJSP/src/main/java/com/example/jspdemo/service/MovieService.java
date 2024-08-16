package com.example.jspdemo.service;

import com.example.jspdemo.model.Movie;
import com.example.jspdemo.repo.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class MovieService {

    @Autowired
    IMovieRepository movieRepo;

    public List<Movie> getAllMovies() {
        List<Movie> movieList = new ArrayList<>();
        movieRepo.findAll().forEach((movie) -> movieList.add(movie));

        return movieList;
    }

    public Movie getMovieById(Long movieId) {
        return movieRepo.findById(movieId).get();
    }

    public boolean saveOrUpdate(Movie movie) {
        Movie updatedMovie = movieRepo.save(movie);

        if(movieRepo.findById(updatedMovie.getId()).get() != null) {
            return true;
        }
        return false;
    }

    public boolean deleteMovie(Long id) {
        try {
            Movie movie = movieRepo.findById(id).orElseThrow();
            movieRepo.delete(movie);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
