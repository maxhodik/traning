import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

interface Auto {
    void move();
    void launch();
    void isMoving();
}

public abstract class Car implements Auto {
    private String name;
    private String color;

    public abstract void move();

    public void launch() {
        System.out.println("launch");
    }

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Truck extends Car  {
    private boolean pricep;

    public Truck(String name, String color) {
        super(name, color);
    }

    public boolean isPricep() {
        return pricep;
    }

    public void setPricep(boolean pricep) {
        this.pricep = pricep;
    }

    @Override
    public void move() {
        System.out.println("TRuck move");
    }

    @Override
    public void isMoving() {
        System.out.println("yes");
    }
}

class Taxi extends Car {

    public Taxi(String name, String color) {
        super(name, color);
    }

    @Override
    public void move() {
        System.out.println("Taxi move");
    }
    @Override
    public void launch(){
        System.out.println("Taxi launch");
    }

    @Override
    public void isMoving() {
        System.out.println("no");
    }

}

class Comparator<T> {
    void compare(T a, T b){
        System.out.println(a.equals(b));
    }
}

class MainMain {
    public static void main(String[] args) {
        Comparator comparator = new Comparator();
        Auto truck = new Truck("truck", "Blue");
        Car car1 = new Taxi("taxi", "Red");
        truck.launch();
        car1.launch();

        List<Car> cars = new ArrayList<>();
        //cars.add(car);
        cars.add(car1);
        for (Auto auto : cars) {
            auto.launch();
            auto.move();
            auto.isMoving();
        }
    }
}
