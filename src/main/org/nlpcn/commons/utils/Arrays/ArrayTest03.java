package main.org.nlpcn.commons.utils.Arrays;

public class ArrayTest03 {
    public static void main(String[] args) {
        //创建数组
        Animal[] animals = new Animal[4];

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat c1 = new Cat();
        Cat c2 = new Cat();

        animals[0] = dog1;
        animals[1] = dog2;
        animals[2] = c1;
        animals[3] = c2;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Dog){
                Dog d =(Dog) animals[i];
                d.eat();
                System.out.println(d);
            }else {
                Cat c = (Cat) animals[i];
                c.move();
            }
        }
    }
}

class Animal {

}

class Dog extends Animal {
    public void eat() {
        System.out.println("dog eat");
    }

    @Override
    public String toString() {
        return "dog eat";
    }
}

class Cat extends Animal {
    public void move() {
        System.out.println("cat run");
    }
}
