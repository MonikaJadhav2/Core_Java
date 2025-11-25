package com.oops;

public class Library {

    String title;
    String author;
    int publicationYear;
    float price;
    boolean isAvailable;
    String category;

    public static void main(String[] args) {

        // Creating 10 Book Objects
        Library b1 = new Library();
        b1.title = "DAA";
        b1.author = "ABC";
        b1.publicationYear = 2008;
        b1.price = 550.75f;
        b1.isAvailable = true;
        b1.category = "Programming";

        Library b2 = new Library();
        b2.title = "ML";
        b2.author = "XYZ";
        b2.publicationYear = 2018;
        b2.price = 420.50f;
        b2.isAvailable = true;
        b2.category = "Self-Help";

        Library b3 = new Library();
        b3.title = "Core Java";
        b3.author = "James Gosling";
        b3.publicationYear = 2017;
        b3.price = 740.00f;
        b3.isAvailable = false;
        b3.category = "Programming";

        Library b4 = new Library();
        b4.title = "HTML";
        b4.author = "PQR";
        b4.publicationYear = 1988;
        b4.price = 300.00f;
        b4.isAvailable = true;
        b4.category = "Fiction";

        Library b5 = new Library();
        b5.title = "BT";
        b5.author = "Monika";
        b5.publicationYear = 1997;
        b5.price = 350.40f;
        b5.isAvailable = true;
        b5.category = "Finance";

        Library b6 = new Library();
        b6.title = "STQA";
        b6.author = "Komsl";
        b6.publicationYear =2004;
        b6.price = 280.00f;
        b6.isAvailable = false;
        b6.category = "Programming";

        Library b7 = new Library();
        b7.title = "Advanced Java";
        b7.author = "CCC";
        b7.publicationYear = 2021;
        b7.price = 900.00f;
        b7.isAvailable = true;
        b7.category = "Programming";

        Library b8 = new Library();
        b8.title = "You Can Win";
        b8.author = "Shiv Khera";
        b8.publicationYear = 1998;
        b8.price = 250.00f;
        b8.isAvailable = true;
        b8.category = "Motivation";

        Library b9 = new Library();
        b9.title = "GK";
        b9.author = "DDD";
        b9.publicationYear = 2016;
        b9.price = 420.00f;
        b9.isAvailable = false;
        b9.category = "Global";

        Library b10 = new Library();
        b10.title = "Introduction to Algorithms";
        b10.author = "HHH";
        b10.publicationYear = 2009;
        b10.price = 1500.50f;
        b10.isAvailable = true;
        b10.category = "Computer Science";


        // Printing 10 books details
        System.out.println("\n----- Book 1 Details -----");
        System.out.println("Title: " + b1.title);
        System.out.println("Author: " + b1.author);
        System.out.println("Publication Year: " + b1.publicationYear);
        System.out.println("Price: " + b1.price);
        System.out.println("Available: " + b1.isAvailable);
        System.out.println("Category: " + b1.category);

        System.out.println("\n----- Book 2 Details -----");
        System.out.println("Title: " + b2.title);
        System.out.println("Author: " + b2.author);
        System.out.println("Publication Year: " + b2.publicationYear);
        System.out.println("Price: " + b2.price);
        System.out.println("Available: " + b2.isAvailable);
        System.out.println("Category: " + b2.category);

        System.out.println("\n----- Book 3 Details -----");
        System.out.println("Title: " + b3.title);
        System.out.println("Author: " + b3.author);
        System.out.println("Publication Year: " + b3.publicationYear);
        System.out.println("Price: " + b3.price);
        System.out.println("Available: " + b3.isAvailable);
        System.out.println("Category: " + b3.category);

        System.out.println("\n----- Book 4 Details -----");
        System.out.println("Title: " + b4.title);
        System.out.println("Author: " + b4.author);
        System.out.println("Publication Year: " + b4.publicationYear);
        System.out.println("Price: " + b4.price);
        System.out.println("Available: " + b4.isAvailable);
        System.out.println("Category: " + b4.category);

        System.out.println("\n----- Book 5 Details -----");
        System.out.println("Title: " + b5.title);
        System.out.println("Author: " + b5.author);
        System.out.println("Publication Year: " + b5.publicationYear);
        System.out.println("Price: " + b5.price);
        System.out.println("Available: " + b5.isAvailable);
        System.out.println("Category: " + b5.category);

        System.out.println("\n----- Book 6 Details -----");
        System.out.println("Title: " + b6.title);
        System.out.println("Author: " + b6.author);
        System.out.println("Publication Year: " + b6.publicationYear);
        System.out.println("Price: " + b6.price);
        System.out.println("Available: " + b6.isAvailable);
        System.out.println("Category: " + b6.category);

        System.out.println("\n----- Book 7 Details -----");
        System.out.println("Title: " + b7.title);
        System.out.println("Author: " + b7.author);
        System.out.println("Publication Year: " + b7.publicationYear);
        System.out.println("Price: " + b7.price);
        System.out.println("Available: " + b7.isAvailable);
        System.out.println("Category: " + b7.category);

        System.out.println("\n----- Book 8 Details -----");
        System.out.println("Title: " + b8.title);
        System.out.println("Author: " + b8.author);
        System.out.println("Publication Year: " + b8.publicationYear);
        System.out.println("Price: " + b8.price);
        System.out.println("Available: " + b8.isAvailable);
        System.out.println("Category: " + b8.category);

        System.out.println("\n----- Book 9 Details -----");
        System.out.println("Title: " + b9.title);
        System.out.println("Author: " + b9.author);
        System.out.println("Publication Year: " + b9.publicationYear);
        System.out.println("Price: " + b9.price);
        System.out.println("Available: " + b9.isAvailable);
        System.out.println("Category: " + b9.category);

        System.out.println("\n----- Book 10 Details -----");
        System.out.println("Title: " + b10.title);
        System.out.println("Author: " + b10.author);
        System.out.println("Publication Year: " + b10.publicationYear);
        System.out.println("Price: " + b10.price);
        System.out.println("Available: " + b10.isAvailable);
        System.out.println("Category: " + b10.category);
    }
}
