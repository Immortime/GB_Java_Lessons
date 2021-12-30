abstract class Animal {
    private final int maxRunLenth = 0;
    private final int  maxSwimLength = 0;
    abstract void run(int rlength);
    abstract void swim(int slength);
}
class Cat extends Animal {
    private final int maxRunLenth = 200;
    void run (int rlength) {
        if ((rlength >= 0) && (rlength <= maxRunLenth)) {
            System.out.println("Cat is running: " + rlength + " meters");
        }
        else {
            System.out.println("She can't run that long");
        }
    }
    void swim (int slength) {
        System.out.println("What are you doing?! She can't swim");
    }
}
class Dog extends Animal {
    private final int maxRunLenth = 500;
    private final int maxSwimLength = 10;
    void run (int rlength) {
        if ((rlength >= 0) && (rlength <= maxRunLenth)) {
            System.out.println("Dog is running: " + rlength + " meters");
        }
        else {
            System.out.println("Good boy can't run that long");
        }
    }
    void swim (int slength) {
        if ((slength >= 0) && (slength <= maxSwimLength)) {
            System.out.println("Dog is swimming: " + slength + " meters");
        }
        else {
            System.out.println("Good boy can't swim that long");
        }
    } 
}
public class SixthHomework {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.run(100);
        cat.swim(10);
        dog.run(300);
        dog.swim(5);
    }   
}