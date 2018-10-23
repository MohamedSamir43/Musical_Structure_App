package Models;

public class AlbumModel {
    String albumBand;
    String albumName;
    int albumCoverImageId;

    public AlbumModel(String albumBand, String albumName, int albumCoverImageId) {
        this.albumBand = albumBand;
        this.albumName = albumName;
        this.albumCoverImageId = albumCoverImageId;
    }

    public String getAlbumBand() {
        return albumBand;
    }

    public String getAlbumName() {
        return albumName;
    }

    public int getAlbumCoverImageId() {
        return albumCoverImageId;
    }
}
