import java.util.ArrayList;
import java.util.List;

public class Main {

    private static Point point;

    public static void main(String[] args) {
        System.out.println("*********************");
        Point point1 = new Point(3, 4);
        Point point2 = new Point(3, 4);
        Point point3 = new Point(2, 5);
        Point point4 = point1;

        System.out.println("*********************");
        Bucket bucket = new Bucket();
        bucket.add(point1);
        bucket.add(point4);
        bucket.add(point3);
        bucket.contains(point2);
        bucket.size();

        bucket.contains(point1);
        bucket.contains(point2);
        bucket.contains(point3);
        bucket.contains(point4);

        System.out.println("*********************");
        MyHashSet buckets = new MyHashSet();

        buckets.add(new Point(3, 4));
        buckets.add(new Point(2, 5));
        buckets.contains(new Point(1, 6));
        buckets.contains(new Point(3, 4));
        buckets.add(new Point(0, 0));
        buckets.size();
        System.out.println("*********************");



//        System.out.println(point1.equals(point2));
//        System.out.println(point1 == point2);
//        System.out.println(point1.equals(point1));
//        System.out.println(point1.equals(point4));
//        System.out.println(point1 == point1);
//        System.out.println(point1 == point4);
//        System.out.println(point1.equals(point3));
    }
}
