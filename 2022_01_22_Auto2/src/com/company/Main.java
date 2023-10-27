package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
/*
        Car car = new Car(2, 3, 4);
        System.out.println(car);
        System.exit(0);
*/

        Random rand = new Random();
        Car car1 = new Car(rand.nextInt(31) + 20,
                rand.nextInt(3) + 1);
        Car car2 = new Car();
        Car car3 = new Car(20, 50,
                1, 2);
        Car car4 = new Car(25, 20,
                2, 4);
        Car car5 = new Car(250, 201,
                22, 43);
        Car car6 = new Car(25, 20,
                2, 4);

//        Car car4 = new Car(30, 60,
//                2, 3);

//        for(;;) {
        while(true) {
            car1.step();
            car2.step();
            car3.step();

//            System.out.println(car1.info());
//            System.out.println(car2.info());
//            System.out.println(car3.info());

//            car1.printInfoToScreen();
//            car2.printInfoToScreen();
//            car3.printInfoToScreen();
            System.out.println(car1);
            System.out.println(car2);
            System.out.println(car3);
            System.out.println();

            if(car1.didCarWin() || car2.didCarWin() || car3.didCarWin()) {
                break;
            }

            //Altatatom a programot 1 másodpercet.
            try {
                Thread.sleep(1000);
            } catch(InterruptedException ie) {
                System.out.println(ie);
            }
            //Altatás vége

        } //Ciklus vége


        if(car1.didCarWin()) {
            System.out.println("Car1 nyert!");
        }

        if(car2.didCarWin()) {
            System.out.println("Car2 nyert!");
        }

        if(car3.didCarWin()) {
            System.out.println("Car3 nyert!");
        }

    }
}
