public class Point {
    final Integer x;
    final Integer y;

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

//    public boolean equals (Object object){
//        if (object instanceof Point){
//            Point point = (Point) object;
//            return this.x.equals(point.x) && this.y.equals(point.y);
//        }
//        return false;
//    }

//    public int hashCode() { return x + y; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (!x.equals(point.x)) return false;
        return y.equals(point.y);
    }

    @Override
    public int hashCode() {
        int result = x.hashCode();
        result = 31 * result + y.hashCode();
        return result;
    }
}

