package com.wiki.article;

public class WikiArticle implements Cloneable {

    String title;
    String author;

    public WikiArticle(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public WikiArticle clone(){
        return new WikiArticle(title, author);
    }

    @Override
    public String toString() {
        return "WikiArticle{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
