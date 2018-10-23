package Models;

public class ArtistModel {
        String artistName;
        String artistAbout;
        int artistImageId;

        public ArtistModel(String artistName, String artistAbout, int artistImageId ) {
            this.artistName=artistName;
            this.artistAbout=artistAbout;
            this.artistImageId=artistImageId;
        }

        public String getArtistName() {
            return artistName;
        }

        public String getArtistAbout() {
            return artistAbout;
        }

        public int getArtistImageId() {
            return artistImageId;
        }
}
