package com.k001.canh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        InformationOfBooks informationOfBooks = new InformationOfBooks();
        Book[] books = new Book[100];
        Scanner scanner = new Scanner(System.in);
        int numberOfBooks = 0, option;

        do {
            System.out.println("Choose an option:\n1. Add a book\n2. Dislay list of books\n0. Get out");
            option = informationOfBooks.importNumber();
            if (option != 1 && option != 2){
                System.out.println("Illegal option input. Please choose again!");
                continue;
            }
            if (option == 1) {
                numberOfBooks++;
                books[numberOfBooks] = informationOfBooks.addABook();
            }
            if (option == 2) {
                informationOfBooks.displayList(books, numberOfBooks);
            }
        } while (option != 0);
    }
}
