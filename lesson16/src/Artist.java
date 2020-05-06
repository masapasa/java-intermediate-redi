import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Artist {
    private String name;
    Map<String, List<Track>> albums = new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}