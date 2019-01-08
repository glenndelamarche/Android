package com.example.glenn.moviefanatics.Interfaces;

import com.example.glenn.moviefanatics.Models.Movie;

import java.util.List;

public interface OnGetMoviesCallback {

    void onSuccess(int page, List<Movie> movies);

    void onError();

}
