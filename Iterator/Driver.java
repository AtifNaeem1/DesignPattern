package com.Iterator;

public class Driver {
    public static void main(String[] args) {
        Application app = new Application();

        System.out.println("\n\nsending spam to friends : \n");
        app.sendSpamToFriends(new Profile("as2f4","kkcharan@gmail.com"));

        System.out.println("\n\nsending spam to coworkers : \n");
        app.sendSpamToCoworkers(new Profile("as2f4","kkcharan@gmail.com"));
    }
}
