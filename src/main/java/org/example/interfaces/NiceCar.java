package org.example.interfaces;

public class NiceCar {
    private Engine engine;
    private Media player = new CDPlayer();
    // If we don't use this constructor, we can use the default constructor
    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
