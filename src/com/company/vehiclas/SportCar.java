package com.company.vehiclas;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private double speed;

    public SportCar(String marka, String classCar, String weght, Driver driver, Engine engine, double speed) {
        super(marka, classCar, weght, driver, engine);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}
