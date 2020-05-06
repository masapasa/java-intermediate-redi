import java.util.HashMap;
import java.util.Map;

//Our users are interested in:
//
//Who was their top artist?
//Which was their favorite track?
public class UserStatistics {
    Map<Track, Integer> trackPlays = new HashMap<>();
    Map<Artist, Integer> artistPlays = new HashMap<>();

    public void recordPlay(Track track) {
        if (trackPlays.containsKey(track)) {
            int totalTrackStreams = this.trackPlays.get(track) + 1;
            this.trackPlays.put(track, totalTrackStreams);
        } else {
            trackPlays.put(track, 1);
        }

        if (artistPlays.containsKey(track.getArtist())) {
            int totalArtistStreams = this.artistPlays.get(track.getArtist()) + 1;
            this.artistPlays.put(track.getArtist(), totalArtistStreams);
        } else {
            artistPlays.put(track.getArtist(), 1);
        }
    }

    public Track getFavoriteTrack() {
        int currentMax = 0;
        Track maxTrack = null;
        for (Track t : trackPlays.keySet()) {
            int trackNumber = trackPlays.get(t);
            if (trackNumber > currentMax) {
                currentMax = trackNumber;
                maxTrack = t;
            }
        }
        if (currentMax == 0) {
            System.out.println("No streams, therefore no top track");
            return maxTrack;
        }
        return maxTrack;
    }

    public Artist getFavoriteArtist() {
        int currentMax = 0;
        Artist maxArtist = null;
        for (Artist art : artistPlays.keySet()) {
            int artistNumber = artistPlays.get(art);
            if (artistNumber > currentMax) {
                currentMax = artistNumber;
                maxArtist = art;
            }
        }
        if (currentMax == 0) {
            System.out.println("No streams, therefore no top artist");
            return maxArtist;
        }
        return maxArtist;
    }
}
