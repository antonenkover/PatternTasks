package com.wiki.article;

public class Main {

    public static void main(String[] args) {
        WikiArticle wikiArticle = new WikiArticle("How to make tea", "Benedict Cumberbatch");
        WikiArticle clonedWikiArticle = (WikiArticle) wikiArticle.clone();

        System.out.println("Wiki Article is: " + wikiArticle.toString());
        System.out.println("Cloned Wiki Article is: " + clonedWikiArticle.toString());
        clonedWikiArticle.setTitle("How to make coffee");

        System.out.println("Changed title in Cloned Wiki Article");
        System.out.println("Wiki Article is: " + wikiArticle.toString());
        System.out.println("Cloned Wiki Article is: " + clonedWikiArticle.toString());

        System.out.println("Wiki Article == Cloned Wiki Article: " + (wikiArticle == clonedWikiArticle));
    }
}
