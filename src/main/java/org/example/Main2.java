package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<TvShow> tvShows = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name of the show: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("How many episodes: ");
            int episodes = Integer.parseInt(scanner.nextLine());

            System.out.print("What is the genre: ");
            String genre = scanner.nextLine();

            // Create a TvShow object and add it to the list
            TvShow tvShow = new TvShow(name, episodes, genre);
            tvShows.add(tvShow);
        }

        // Print the TV shows
        System.out.println("List of TV shows:");
        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }
    }
}

