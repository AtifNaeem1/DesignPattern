package com.Proxy;

import java.util.List;

// The interface of a remote service.
public interface ThirdPartyYouTubeLib {
    public List<Video> listVideos();
    public Video getVideoInfo(int id);
    public void downloadVideo(int id);
}
