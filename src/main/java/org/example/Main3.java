package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Books> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the book title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Number of pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());

            Books book = new Books(title, pages, year);
            books.add(book);
        }

        System.out.print("What information will be printed? ");
        String response = scanner.nextLine();

        if (response.equals("everything")) {
            for (Books book : books) {
                System.out.println(book);
            }
        } else if (response.equals("name")) {
            for (Books book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}

