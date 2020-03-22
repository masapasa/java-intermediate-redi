public class Car {
    String name;
    int fuelLevel;
    int maxSpeed;
    boolean broken;
//    String [] names;

    public Car(String name, int fuelLevel, int maxSpeed, boolean broken){   //String [] names
        this.name = name;
        this.fuelLevel = fuelLevel;
        this.maxSpeed = maxSpeed;
        this.broken = broken;
//        this.names = names;
    }


    void drive() {
        if (broken) {
            System.out.println("Car " + name + " is broken");
        } else if (fuelLevel > 0) {
            System.out.println("Car " + name + " is driving with speed " + maxSpeed);
            fuelLevel -= 50;
        } else {
            System.out.println("Out of fuel");
        }
    }

    void refuel() {
        System.out.println("Refueling the car " + name);
        fuelLevel = 100;
    }
}
