package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Book myBook = new Book();
        Chapters myChapters = new Chapters();
        Pages myPages = new Pages();

        Book book1 = new Book();
        book1.setTitle("Book title: Fun Times at Java Boot Camp");

        Chapters chapter1 = new Chapters();
        chapter1.setTitle("Chapter 1: The Crazy Instructors");
        myBook.addChapter(chapter1);

        Pages page1 = new Pages();
        page1.setPage("Page 1: All about Dave");
        book1.addPage(page1);

        Pages page2 = new Pages();
        page2.setPage("Page 2: Fun with Fi");
        book1.addPage(page2);
        

            for (Chapters c : myBook.getChapters()) {
                System.out.println(c.getTitle());
                System.out.println(c.getPage());
                System.out.println(page1.getPage());
                System.out.println(page2.getPage());
            }



        String answer;

        Scanner keyboard = new Scanner(System.in);


        do {
            System.out.println("Do you want to add another chapter?:");
            answer = keyboard.nextLine();
            System.out.println("Enter chapter title:");
            answer = keyboard.nextLine();

            do {
                System.out.println("Do you want to add another page?:");
                answer = keyboard.nextLine();
                System.out.println("Enter page title:");
                answer = keyboard.nextLine();

            } while (answer.equalsIgnoreCase("y"));
        } while (answer.equalsIgnoreCase("y"));
    }
}


