package main.org.nlpcn.commons.utils.接口.Car;

public class Car {
    Engine e;

    public Car(Engine e) {
        this.e = e;
    }

    public void testEngine(){
        e.start();
    }

}
