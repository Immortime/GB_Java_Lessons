/**
 * Java. Level 1. Lesson 7. Homework.
 * OOP
 * @author Nikishin Alexandr
 * @date 03.01.2022
 */


class SeventhHomework {
    public static void main(String[] args) {
        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Chelick", 5, 10);
        cat[1] = new Cat("Barsik", 10, 15);
        cat[2] = new Cat("Kto-to", 15, 14);
        cat[3] = new Cat("On samiy", 12, 13);
        cat[4] = new Cat("Vot on", 8, 12);
        Plate plate = new Plate(15);
        
        for (Cat i : cat) {
            if (i.getFullness() == 0) {
                if (!plate.howMuchFood(i.getAppetite())) {
                    plate.addFood();
                }
                i.eat(plate);
                System.out.println("Cat " + i.getName() + " eat " + i.getAppetite() + " food units");
            }
        System.out.println("Cat " + i.getName() + " is now full by " + i.getFullness() + " units");
        }
    }
}

class Cat {
    private String name;
    private int appetite;
    private int fullness;
    
    Cat(String name, int appetite, int fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = 0;
    }
   
    String getName() {
        return name;
    }
    
    int getAppetite() {
        return appetite;
    }
    
    int getFullness() {
        return fullness;
    }
    
    void setFullness(int fullness) {
        this.fullness = fullness;
    }
    
    void eat(Plate plate) {
        plate.decreaseFood(appetite);
        fullness += appetite;
        
    }
}

class Plate {
    private int food;
    
    Plate(int food) {
        this.food = food;
    }
    
    void decreaseFood(int a) {
        this.food -= a;
    }
    
    boolean howMuchFood(int b) {
        return (food - b) >= 0;
    }
    
    void addFood() {
        this.food += 100;
        System.out.println("Food have been added");
    }
}

