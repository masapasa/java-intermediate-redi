public class RediStreamingService {

    public static void main(String... args) {
        Player player = new Player();
        User user = new User();
        User user2 = new User();
        Track track = new Track();
        Track track1 = new Track();
        Track track2 = new Track();
        Track track3 = new Track();

        player.play(track, user);
        player.play(track1, user);
        player.play(track2, user2);
        player.play(track3, user);
//	player.play(track, user2);
//	player.play(track, user2);
//	player.play(track, user2);
//	player.play(track, user2);
//	player.play(track, user2);
//	player.play(track, user);
//	player.play(track3, user);
//	player.play(track4, user);
//	player.play(track5, user);
//	player.play(track6, user);
//
//	// call the statistics from player
    }

}
