package com.Proxy;

public class Application {
    public static void main(String[] args) {
        ThirdPartyYouTubeLib aYouTubeService = new ThirdPartyYouTubeClass();
        ThirdPartyYouTubeLib aYouTubeProxy = new CachedYouTubeClass(aYouTubeService);
        YoutubeManager manager = new YoutubeManager(aYouTubeProxy);

        System.out.println("Making first request on id = 5");
        manager.reactOnUserInput(5);
        System.out.println("\n\nMaking second request on id = 5");
        manager.reactOnUserInput(5);
        System.out.println("\n\nMaking new request on id = 6");
        manager.reactOnUserInput(6);
    }
}
