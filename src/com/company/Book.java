package com.company;

import java.util.ArrayList;

public class Book {

    private ArrayList<Book> library;
    private ArrayList<Chapters> chapters;
    private ArrayList<Pages> pages;
    private String title;
    private String chapter;
    private String page;


    public Book()
    {
        library = new ArrayList<Book>();
        chapters = new ArrayList<Chapters>();
        pages = new ArrayList<Pages>();
        this.title = title;
        this.chapter = chapter;
        this.page = page;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Book> getLibrary()
    {
        return library;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Chapters> getChapters() {
        return chapters;
    }

    public void setChapters(ArrayList<Chapters> chapters) {
        this.chapters = chapters;
    }

    public ArrayList<Pages> getPages() {
        return pages;
    }

    public void setPages(ArrayList<Pages> pages) {
        this.pages = pages;
    }

    public void addChapter(Chapters manyChapters)
    {
        chapters.add(manyChapters);
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public void addPage(Pages aPage)
    {
        pages.add(aPage);
    }
    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }


}
