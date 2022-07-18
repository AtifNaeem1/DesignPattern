package com.Memento;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<ArticleMemento> savedMomento = new ArrayList<ArticleMemento>();

        Article article = new Article(1, "My Article");
        article.setContent("ABC");    //original content
        System.out.println(article);

        savedMomento.add(article.createMemento()); //created immutable memento

        article.setContent("123");    //changed content
        System.out.println(article);

        article.restore(savedMomento.get(savedMomento.size()-1));   //UNDO change
        System.out.println(article);  //original content

        System.out.println("\n\n\n");

        article.setContent("123");
        savedMomento.add(article.createMemento()); //created immutable memento

        article.setContent("456");    //changed content
        System.out.println(article);

        article.restore(savedMomento.get(savedMomento.size()-1));   //UNDO change
        System.out.println(article);  //original content
    }
}
