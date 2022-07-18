package com.Proxy;

import java.util.List;

public class YoutubeManager {

    protected ThirdPartyYouTubeLib service;

    public YoutubeManager(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    void renderVideoPage(int id) {
        Video info = service.getVideoInfo(id);
        System.out.println("Rendering video page");
    }

    void renderListPanel(){
        List<Video> list = service.listVideos();
        System.out.println("Rendering the list of video thumbnails.");
    }

    void reactOnUserInput(int id){
        renderVideoPage(id);
        renderListPanel();
    }


}
