package com.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork  {
    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return new FacebookIterator(this, profileId, "friends");
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return new FacebookIterator(this, profileId, "coworkers");

    }

    List<Profile> socialGraphRequest(String profileId, String type)
    {
        List<Profile> temp = new ArrayList<Profile>();

        if(type=="friends")
        {
            temp.add(new Profile("ax2s3e","wxyz@gmail.com"));
            temp.add(new Profile("by2s3e","jazqwe@gmail.com"));
            temp.add(new Profile("z6me34","buttler@gmail.com"));
        }
        if(type == "coworkers")
        {
            temp.add(new Profile("m24we9","anil@gmail.com"));
            temp.add(new Profile("p8i7y1","amit@gmail.com"));
            temp.add(new Profile("q12w3e","morgan@gmail.com"));
        }

        return temp;
    }
}
