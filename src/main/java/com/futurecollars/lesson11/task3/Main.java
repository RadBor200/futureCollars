package com.futurecollars.lesson11.task3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<CinemaHall> cinemaHalls = Arrays.asList(
        new CinemaHall("1", TypeOfCinemaHall.TWO_D),
        new CinemaHall("2", TypeOfCinemaHall.TWO_D),
        new CinemaHall("3", TypeOfCinemaHall.THREE_D),
        new CinemaHall("4", TypeOfCinemaHall.THREE_D),
        new CinemaHall("5", TypeOfCinemaHall.FOUR_D),
        new CinemaHall("6", TypeOfCinemaHall.TWO_D),
        new CinemaHall("7", TypeOfCinemaHall.TWO_D),
        new CinemaHall("8", TypeOfCinemaHall.THREE_D),
        new CinemaHall("9", TypeOfCinemaHall.FOUR_D),
        new CinemaHall("10", TypeOfCinemaHall.FOUR_D)
    );

    Map<TypeOfCinemaHall, List<CinemaHall>> hallsPerType = cinemaHalls.stream()
        .collect(Collectors.groupingBy(CinemaHall::getTypeOfHall));

    int halls_2D = hallsPerType.get(TypeOfCinemaHall.TWO_D).size();
    System.out.println("Number of 2D halls: " + halls_2D);

    int halls_3D = hallsPerType.get(TypeOfCinemaHall.THREE_D).size();
    System.out.println("Number of 3D halls: " + halls_3D);

    int halls_4D = hallsPerType.get(TypeOfCinemaHall.FOUR_D).size();
    System.out.println("Number of 4D halls: " + halls_4D);
  }
}
