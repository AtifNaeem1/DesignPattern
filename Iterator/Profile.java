package com.Iterator;

public class Profile {
    private String profileId;
    private String email;

    public Profile(String profileId, String email) {
        this.profileId = profileId;
        this.email = email;
    }

    public Profile()
    {

    }
    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
