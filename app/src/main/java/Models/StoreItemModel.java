package Models;

public class StoreItemModel {
    String albumBand;
    String albumName;
    int albumCoverImageId;

    public StoreItemModel(String albumBand, String albumName, int albumCoverImageId) {
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
