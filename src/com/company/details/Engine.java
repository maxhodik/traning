package com.company.details;

public class Engine {
    private String power;
    private String company;

    public Engine(String power, String company) {
        this.power = power;
        this.company = company;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power='" + power + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
