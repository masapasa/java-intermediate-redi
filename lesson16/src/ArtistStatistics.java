import java.util.HashMap;
import java.util.Map;

public class ArtistStatistics {
    Map<User, Integer> trackPlays = new HashMap<>();
    Map<User, Track> artistFan = new HashMap<>();

    //How many different users have streamed my music?
    public void recordPlay(User user) {
        if (trackPlays.containsKey(user)) {
            int totalStreams = this.trackPlays.get(user) + 1;
            this.trackPlays.put(user, totalStreams);
        } else {
            trackPlays.put(user, 1);
        }
    }

    //Who is my top fan? (Most played tracks)
    public void getTopFan(User user) {
        String favTrack = null;

        for (Track track : artistFan.values()) {
            int maxTrackPlays = 0;
            if (favTrack == null || favTrack != track.getName()) {
                favTrack = track.getName();
            } else if (favTrack == track.getName()) {
                maxTrackPlays++;
            }

        }


//        Loop over trackPlays map and find the Maximum integer.
//                Return the user of the maximum integer.
//        useful functions:
//        Map.keySet() =>returns all keys of the map
    }

    public int getDifferentUserCount() {
        return trackPlays.keySet().size();
    }
}
