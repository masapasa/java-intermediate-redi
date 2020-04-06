package music;

import java.util.ArrayList;
import java.util.List;

public class MusicStore {
    List<Album> albums;

    public List<Album> getAlbumsOfArtist(Artist art) {  // Given an music.Artist it returns all Albums that are available in the store
        List<Album> result = new ArrayList<>();
        for (Album album : albums) {
            if (album.artist.artistName.equals(art.artistName)) {
                result.add(album);
            }
        }
        return result;
    }

    public List<Album> getAlbumsOfTrack(Track track) {  // Given a music.Track it returns all Albums where this track appears on
        List<Album> result = new ArrayList<>();
        for (Album album : albums) {
            for (Track tr : album.tracks) {
                if (tr.trackName.equals(track.trackName)) {
                    result.add(album);
                }
            }
        }
        return result;
    }

    public String getLabelOfArtist(Artist artist) {   // Given an music.Artist it returns the label of the artist
        String label = artist.labelName;
        return label;
    }

}
