package structure.proxy;

public class Main {

    public static void main(String[] args) {
        VideoDownloader downloader = new CachedYouTubeDownloader(new YouTubeDownloader());

        telecharger(downloader, "video-1");
        telecharger(downloader, "video-2");
        telecharger(downloader, "video-1");
        telecharger(downloader, "video-1");
        telecharger(downloader, "video-3");
        telecharger(downloader, "video-2");
        telecharger(downloader, "video-3");
    }

    private static void telecharger(VideoDownloader downloader, String videoId) {
        long debut = System.currentTimeMillis();
        String contenu = downloader.downloadVideo(videoId);
        long duree = System.currentTimeMillis() - debut;
        System.out.println("=> " + contenu + " (" + duree + " ms)");
        System.out.println();
    }
}
