package com.Iterator;

public class Application {
    private SocialNetwork network;
    private SocialSpammer spammer;

     Application() {
         this.network = new Facebook();
         this.spammer = new SocialSpammer();
    }

    void sendSpamToFriends(Profile profile) {
        ProfileIterator iterator = network.createFriendsIterator(profile.getProfileId());
        spammer.send(iterator, "Very important message");
    }



    void  sendSpamToCoworkers(Profile profile) {
        ProfileIterator iterator = network.createCoworkersIterator(profile.getProfileId());
        spammer.send(iterator, "Very important message");
    }
}
