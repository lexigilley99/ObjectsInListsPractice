package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");

        while (true) {
            System.out.print("Please enter a name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Is it a dog? Yes or no: ");
            String isDogStr = scanner.nextLine().toLowerCase();
            boolean isDog = isDogStr.equals("yes");

            Animal animal = new Animal(name, isDog);
            animals.add(animal);
        }

        System.out.println("List of animals:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
