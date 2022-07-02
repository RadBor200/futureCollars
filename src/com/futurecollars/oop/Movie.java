package com.futurecollars.oop;

public class Movie {
    private String movieTittle;
    private String movieDirector;
    private int movieDurationInMinutes;
    private int yearOfProcudtion;

    public String getMovieTittle() {
        return movieTittle;
    }

    public void setMovieTittle(String movieTittle) {
        this.movieTittle = movieTittle;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public int getMovieDurationInMinutes() {
        return movieDurationInMinutes;
    }

    public void setMovieDurationInMinutes(int movieDurationInMinutes) {
        this.movieDurationInMinutes = movieDurationInMinutes;
    }

    public int getYearOfProcudtion() {
        return yearOfProcudtion;
    }

    public void setYearOfProcudtion(int yearOfProcudtion) {
        this.yearOfProcudtion = yearOfProcudtion;
    }

    public Movie(String movieTittle, String movieDirector, int movieDurationInMinutes, int yearOfProcudtion) {
        this.movieTittle = movieTittle;
        this.movieDirector = movieDirector;
        this.movieDurationInMinutes = movieDurationInMinutes;
        this.yearOfProcudtion = yearOfProcudtion;
    }
    }
