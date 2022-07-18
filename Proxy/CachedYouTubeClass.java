package com.Proxy;

import java.util.HashMap;
import java.util.List;

public class CachedYouTubeClass implements ThirdPartyYouTubeLib{
    private ThirdPartyYouTubeLib service;
    List<Video> listCache;
    Video videoCache;
    boolean needReset, isDownloaded;

    private HashMap downloadExists = new HashMap();
    private HashMap videoDetailExists = new HashMap();

    public CachedYouTubeClass(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    @Override
    public List<Video> listVideos() {
        if (listCache == null || needReset) {
            listCache = service.listVideos();
        }
        else{
            System.out.println("getting list of videos from cache");
        }
        return listCache;
    }

    @Override
    public Video getVideoInfo(int id) {
        if (videoDetailExists.get(id) == null || needReset) {
            videoCache = service.getVideoInfo(id);
            videoDetailExists.put(id,true);
        }
        else{
            System.out.println("getting video info from cache");
        }
        return videoCache;
    }

    @Override
    public void downloadVideo(int id) {
        if (!downloadExists(id) || needReset) {
            service.downloadVideo(id);
            downloadExists.put(id, true);
        }
    }

    private boolean downloadExists(int id) {
        return (boolean)downloadExists.get(id);
    }
}
