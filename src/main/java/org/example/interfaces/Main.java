package org.example.interfaces;

public class Main {
    public static void main(String[] args) {

//        Car car = new Car();
//        car.start();
//        car.accelerate();
//        car.brake();
//        car.stop();
//        Media carMedia = new Car();
//        carMedia.start();

        NiceCar niceCar = new NiceCar();
        niceCar.start();
        niceCar.startMusic();
        niceCar.upgradeEngine();
        niceCar.start();

    }
}
