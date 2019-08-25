package main.org.nlpcn.commons.utils.多态;

public class Cat extends Animal{
    @Override
    public void main() {
        System.out.println("it's maoing!");
    }

    public void catchMouse(){
        System.out.println("it's catching!");
    }
}
