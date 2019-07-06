package com.example.carobjecthw;

import java.io.Serializable;

public class Car implements Serializable {


    private String model, make, year, color, bodyType, engineType, horsePower, seatCount, cost, imageUrl;

    public Car(String model, String make, String year, String color, String bodyType, String engineType, String horsePower, String seatCount, String cost, String imageUrl) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.color = color;
        this.bodyType = bodyType;
        this.engineType = engineType;
        this.horsePower = horsePower;
        this.seatCount = seatCount;
        this.cost = cost;
        this.imageUrl = imageUrl;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(String horsePower) {
        this.horsePower = horsePower;
    }

    public String getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(String seatCount) {
        this.seatCount = seatCount;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
