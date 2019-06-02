package com.k001.canh;

import java.util.Scanner;

public class InformationOfBooks extends Book {

    public Integer importNumber() {
        Scanner scanner = new Scanner(System.in);
        boolean checkInput = false;
        Integer number = 0;
        while (!checkInput) {
            try {
                number = scanner.nextInt();
                checkInput = true;
            } catch (Exception e) {
                System.out.println("Input number is illegal! Please put again!");
                scanner.nextLine();
            }
        }
        return number;
    }

    public Book addABook() {
        Book newBook = new Book();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a major (Select a option):\n1. Information Technology\n2. Science - Life\n3. Literature - Art");
        int option = importNumber();
        switch (option) {
            case 1: {
                newBook.setMajor("Information Technology");
                break;
            }
            case 2: {
                newBook.setMajor("Science - Life");
                break;
            }
            case 3: {
                newBook.setMajor("Literature - Art");
                break;
            }
        }

        //scanner.nextLine();

        System.out.println("ID of book:");
        newBook.setId(scanner.nextLine());

        System.out.println("Name of book:");
        newBook.setName(scanner.nextLine());

        System.out.println("Name of Author:");
        newBook.setAuthor(scanner.nextLine());

        System.out.println("Name of Publisher:");
        newBook.setPublisher(scanner.nextLine());

        System.out.println("Number of Pages:");
        newBook.setNumberOfPages(importNumber());

        return newBook;
    }

    public void displayList(Book[] books, int numberOfBooks) {
        for (int i = 1; i <= numberOfBooks; i++) {
            System.out.println("ID: " + books[i].getId());
            System.out.println("Name: " + books[i].getName());
            System.out.println("Author: " + books[i].getAuthor());
            System.out.println("Publisher: " + books[i].getPublisher());
            System.out.println("Major: " + books[i].getMajor());
            System.out.println("Number of Pages: " + books[i].getNumberOfPages());
        }
    }

}
