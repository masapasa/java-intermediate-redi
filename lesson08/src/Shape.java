import javax.crypto.spec.PSource;

public class Shape {
    String shapeName;
    double sideA;
    double sideB;
    double radius;
    double square = 0;

    public Shape(String shapeName, double sideA, double sideB) {
        this.shapeName = shapeName;
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public Shape(String shapeName, double radius) {
        this.shapeName = shapeName;
        this.radius = radius;
    }

    void getArea() {
        if(this.shapeName == "Rectangle"){
            square=sideA*sideB;
        }
        else if(this.shapeName == "Triangle"){
            square=sideA*sideB;
        }
        else if (this.shapeName == "Circle"){
            square=(radius*radius)*3.14;
        }
        System.out.println(square);
    }
}
