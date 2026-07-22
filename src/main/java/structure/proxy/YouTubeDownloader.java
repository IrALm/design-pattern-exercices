package structure.proxy;

/**
 * Bibliothèque de téléchargement qui simule un accès réseau coûteux.
 */
public class YouTubeDownloader implements VideoDownloader {

    @Override
    public String downloadVideo(String videoId) {
        System.out.println("[YouTubeDownloader] Téléchargement de la vidéo '" + videoId + "' depuis YouTube...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Contenu vidéo de '" + videoId + "'";
    }
}
