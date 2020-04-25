public class Circle {
    double radius;
    Point origin;

    public Circle(double radius, Point origin) {
        this.radius = radius;
        this.origin = origin;
    }

    public boolean equals(Object object){
        if (object instanceof Circle){
            Circle circle = (Circle) object;
            return this.origin.equals(circle.origin) && this.radius == circle.radius;
        }
        return false;
    }
}
