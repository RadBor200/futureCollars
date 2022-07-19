package main.java;

public class Movie {

    private final String title;
    private final String director;
    private final int durationInMinutes;
    private final int yearOfProduction;

    public Movie(String title, String director, int durationInMinutes, int yearOfProduction) {
        this.title = title;
        this.director = director;
        this.durationInMinutes = durationInMinutes;
        this.yearOfProduction = yearOfProduction;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}

