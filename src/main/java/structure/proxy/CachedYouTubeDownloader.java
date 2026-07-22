package structure.proxy;

import java.util.HashMap;
import java.util.Map;

public class CachedYouTubeDownloader implements VideoDownloader {

    private final VideoDownloader downloader;
    private final Map<String, String> cache = new HashMap<>();

    public CachedYouTubeDownloader(VideoDownloader downloader) {
        this.downloader = downloader;
    }

    @Override
    public String downloadVideo(String videoId) {
        if (cache.containsKey(videoId)) {
            System.out.println("[CachedYouTubeDownloader] Vidéo '" + videoId + "' servie depuis le cache.");
            return cache.get(videoId);
        }
        String contenu = downloader.downloadVideo(videoId);
        cache.put(videoId, contenu);
        return contenu;
    }
}
