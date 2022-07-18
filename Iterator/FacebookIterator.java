package com.Iterator;

import java.util.List;

public class FacebookIterator  implements ProfileIterator{

    private Facebook facebook;
    private String profileId;
    private String type;

    // An iterator object traverses the collection independently
    // from other iterators. Therefore it has to store the
    // iteration state.

    private int currentPosition=0;
    List<Profile> cache;


    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }

    public FacebookIterator() {
    }

    private void lazyInit() {
        if (cache == null)
            cache = facebook.socialGraphRequest(profileId, type);
    }


    @Override
    public Profile getNext() {
        if (hasMore())
        {
            return cache.get(currentPosition++);
        }
        return null;
    }

    @Override
    public boolean hasMore() {
        lazyInit();
        return currentPosition < cache.size();
    }

}
