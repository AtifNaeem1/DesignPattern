package com.Proxy;

import java.util.ArrayList;
import java.util.List;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib{
    @Override
    public List<Video> listVideos() {
        System.out.println("getting list of videos from YouTube server.");
        return new ArrayList<Video>();
    }

    @Override
    public Video getVideoInfo(int id) {
        System.out.println("getting video info from Youtube server");
        return new Video();
    }

    @Override
    public void downloadVideo(int id) {
        System.out.println(" Downloading a video file from YouTube server.");
    }
}
