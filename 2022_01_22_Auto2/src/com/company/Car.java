package com.company;

import java.util.Random;

/*
1. Autóverseny. Autó osztályt hozunk létre. Legyen nekik üzemanyagszintjük
(20-50), sebességük (1 vagy 2), legyen pozíciójuk (0-30)
(0 a start, 30 a cél) Véletlen számokkal töltsük fel az üzemanyagszintet,
a sebességet, a pozíció mindig 0.
Hozzunk létre annyi kocsit amennyi tetszik.
(Vagy tömbben, vagy 3 kocsit külön.)
*/
public class Car {
    int fuel;
    int position;
    int speed;
    final int goalPosition = 30;

    public Car(int fuelParam, int speedParam) {
        fuel = fuelParam;
        speed = speedParam;
        position = 0;
    }
/*
    public Car(int fuelParam, int speedParam, int positionParam) {
        fuel = fuelParam;
        speed = speedParam;
        position = positionParam;
    }
*/
    public Car(int fuel, int speed, int position) {
        this.fuel = fuel;
        this.speed = speed;
        this.position = 0;
    }

    public Car() {
        Random rand = new Random();
        fuel = rand.nextInt(31) + 20;
        speed = rand.nextInt(2) + 1;
        position = 0;
    }

    public Car(int fuelLowerBound, int fuelUpperBound,
               int speedLowerBound, int speedUpperBound) {
        Random rand = new Random();
        fuel = rand.nextInt(fuelUpperBound - fuelLowerBound + 1)
                + fuelLowerBound;
        speed = rand.nextInt(speedUpperBound - speedLowerBound + 1)
                    + 1;
        position = 0;
    }

    public void step() {
        if(fuel >= 0) {
            fuel -= speed;
            position += speed;
        }
    }

    public void printInfoToScreen() {
//        System.out.println("car position: " + position +
//                " fuel: " + fuel);
//        System.out.println(info());
        System.out.println(toString());
//        System.out.println(this);
    }

    public String info() {
        return "car position: " + position +
                " fuel: " + fuel;
    }

    public String toString() {
        return "car position: " + position +
                " fuel: " + fuel;
    }

    public boolean didCarWin() {
        if(position >= goalPosition) {
            return true;
        }
        return false;
    }

}
