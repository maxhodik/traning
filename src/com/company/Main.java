package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehiclas.Car;
import com.company.vehiclas.Lorry;
import com.company.vehiclas.SportCar;

public class Main {
    public static void main(String[] args) {
        Driver bmwDriver = new Driver("Иванов В.В.", 50);
        Engine bmwEngine = new Engine("60", "BMW");
        Car car = new Car("BMW", "C", "5000", bmwDriver, bmwEngine);

        Driver lorryDriver = new Driver("Петров В.В.", 45);
        Engine lorryEngine = new Engine("30", "LorryEngine");
        Lorry lorry = new Lorry("Грузовик", "D", "8000", lorryDriver, lorryEngine, 500);

        Driver sportDriver = new Driver("Сидоров В.В.", 30);
        Engine sportEngine = new Engine("80", "SportEngine");
        SportCar sportCar = new SportCar("SportCar", "C", "4000", sportDriver, sportEngine, 300);

        System.out.println(car);
        System.out.println(lorry);
        System.out.println(sportCar);
    }
}
