package com.company.vehiclas;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String marka;
    private String classCar;
    private String weght;
    private Driver driver;
    private Engine engine;

    public String getMarka() {
        return marka;
    }

    public Car(String marka, String classCar, String weght, Driver driver, Engine engine) {
        this.marka = marka;
        this.classCar = classCar;
        this.weght = weght;
        this.driver = driver;
        this.engine = engine;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getClassCar() {
        return classCar;
    }

    public void setClassCar(String classCar) {
        this.classCar = classCar;
    }

    public String getWeght() {
        return weght;
    }

    public void setWeght(String weght) {
        this.weght = weght;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public static void start(){
        System.out.println("Start");
    }
    public static void stop(){
        System.out.println("Stop");
    }
    public static void turnRight(){
        System.out.println("Turn right");
    }
    public static void turnLeft(){
        System.out.println("Turn left");
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", classCar='" + classCar + '\'' +
                ", weght='" + weght + '\'' +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
