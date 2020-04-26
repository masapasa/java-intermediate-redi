import java.util.ArrayList;
import java.util.List;

public class Bucket {
    private final List<Point> items = new ArrayList<>();

    boolean contains(Point point) {
        for (Point item : items) {
            if (item.equals(point)) {
                return true;
            }
        }
        return false;
    }

    public void add(Point point) {
        if (!contains(point)) {
            items.add(point);
            System.out.println("You added a new point");
        }
    }

    public int size() {
        System.out.println("Size: " + this.items.size());
        return this.items.size();
    }
}
