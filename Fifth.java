/**
 * Java. Level 1. Lesson 5. Homework.
 * OOP
 * @author Nikishin Alexandr
 * @date 26.12.2021
 */

class Employee { 
    private String fullName;
    private String position;
    private String email;
    private long phoneNumber;
    private long salary;
    private int age;
    
    public Employee(String fullName, String position, String email, long phoneNumber, long salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
        
    public void info() {
        System.out.println("fullName:" + fullName + ";position:" + position + ";email:" + email + ";phoneNumber:" + phoneNumber + ";salary" + salary + ";age" + age);
    }
}
public class Fifth {
    public static void main (String[] args) {
        Employee employee = new Employee("Булатов Радислав Михайлович", "Фулл-стак-гений", "bulatoslav@mail.ru", 892053476, 999999, 15);
        Employee[] arr = new Employee[5];
        arr[0] = new Employee ("Саввин Ростик Эдуардович", "Уборщик", "Savvin@mail.ru", 896258329, 99, 20);
        arr[1] = new Employee ("Печкин Дмитрий Михайлович", "Верстальщик", "Pechka@mail.ru", 892253465, 150000, 30);
        arr[2] = new Employee ("Ростинский Евгений Михайлович", "Разработчик", "Rostinsky@mail.ru", 894053467, 200000 , 45);
        arr[3] = new Employee ("Каменский Максим Михайлович", "Полезный", "kamen@mail.ru", 892053476, 9999999, 25);
        arr[4] = new Employee ("Тихобай Никита Намидович", "Дизайнер", "Tihoba@mail.ru", 891934354, 9999, 60);
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() > 40) {
                arr[i].info();
            }
        }
    }
}

    
    

