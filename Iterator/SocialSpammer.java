package com.Iterator;

public class SocialSpammer {
        private Profile profile;

        void send(ProfileIterator iterator, String message) {
        while(iterator.hasMore()){
                profile =iterator.getNext();
                sendEmail(profile.getEmail(),message);
                 }
        }

        private void sendEmail(String email, String message)
        {
                System.out.println("Sending mail to " + email);
        }
}