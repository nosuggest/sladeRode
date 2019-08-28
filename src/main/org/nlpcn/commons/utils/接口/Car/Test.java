package main.org.nlpcn.commons.utils.接口.Car;


import main.org.nlpcn.commons.utils.多态.Cat;

public class Test {
    public static void main(String[] args) {
//        YAMAHA e1 = new YAMAHA();
//        Engine e2 = new YAMAHA();
//        Car c = new Car(e1);
//        c.testEngine();
//        Car c2 = new Car(e2);
//        c2.testEngine();
//        Engine e3 = new NONDA();
//        Car c3 = new Car(e3);
//        c3.testEngine();


        Engine e4 = new NONDA();
        NONDA e5 = new NONDA();
        e4.start();
        e5.start();

    }
}
