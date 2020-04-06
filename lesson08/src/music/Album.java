package music;

import java.util.ArrayList;
import java.util.List;

public class Album {
    String albumName;
    public Artist artist;
    List<Track> tracks;
    int publishingYear;


    public Album(String albumName, Artist artist, int publishingYear){
        this.albumName = albumName;
        this.artist = artist;
        this.publishingYear = publishingYear;
        List<Track> tracks = new ArrayList<>();
    }

}
