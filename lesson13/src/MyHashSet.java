import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class MyHashSet {
    private final List<Bucket> buckets = new ArrayList<>();

    public MyHashSet() {
        buckets.add(new Bucket());
        buckets.add(new Bucket());
        buckets.add(new Bucket());
        buckets.add(new Bucket());
        buckets.add(new Bucket());
        buckets.add(new Bucket());
        buckets.add(new Bucket());
        buckets.add(new Bucket());
        buckets.add(new Bucket());
        buckets.add(new Bucket());
    }


    public void add(Point point) {
        Bucket bucket = buckets.get(point.hashCode());
        if (!bucket.contains(point)) {
            bucket.add(point);
            System.out.println("You added a new point");
        }
    }

    public boolean contains(Point point) {
        Bucket bucket = buckets.get(point.hashCode());
        if (!bucket.contains(point)) {
            System.out.println("You already have this point");
            return true;
        } else {
            System.out.println("This point is not found");
            return false;
        }
    }

    public int size() {
        int size = 0;
        for (Bucket bucket : buckets) {
            size += bucket.size();
        }
        System.out.println("All buckets size is " + size);
        return 0;
    }
}
