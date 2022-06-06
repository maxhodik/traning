package com.company.vehiclas;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private int carrying;

    public Lorry(String marka, String classCar, String weght, Driver driver, Engine engine, int carrying) {
        super(marka, classCar, weght, driver, engine);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                "} " + super.toString();
    }
}

