package org.example;

public class Books {
    private final String title;
    private final int pages;
    private final int year;

    public Books (String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for pages
    public int getPages() {
        return pages;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return title + ", " + pages + " pages, " + year;
    }
}

