import java.util.ArrayList;
import java.util.List;

public class Bucket {
    private final List<Point> items = new ArrayList<>();

    public boolean contains(Point point) {
        for (Point item : items) {
            if (item.equals(point)) {
                System.out.println("You already have this point");
                return true;
            } else if(!item.equals(point)){
                System.out.println("This point is not found");
            }
        }
                return false;       //результатом метода всегда будет false?

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
