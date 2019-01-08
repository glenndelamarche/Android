package com.example.glenn.moviefanatics.Interfaces;

import com.example.glenn.moviefanatics.Models.Genre;

import java.util.List;

public interface OnGetGenresCallback {

    void onSuccess(List<Genre> genres);

    void onError();

}
