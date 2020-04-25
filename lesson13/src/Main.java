public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(3, 4);
        Point point3 = new Point(2, 5);
        Point point4 = point1;

        System.out.println(point1.equals(point2));
        System.out.println(point1 == point2);
        System.out.println(point1.equals(point1));
        System.out.println(point1.equals(point4));
        System.out.println(point1 == point1);
        System.out.println(point1 == point4);
        System.out.println(point1.equals(point3));
    }
}
