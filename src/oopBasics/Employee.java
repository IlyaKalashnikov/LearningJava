package oopBasics;

public class Employee {
    /**
     * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
     * Конструктор класса должен заполнять эти поля при создании объекта.
     * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
     * Создать массив из 5 сотрудников.
     * С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
     */
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    public Employee(String name, String position, String email, String phoneNumber, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("ФИО: " + name + "; Должность: " + position + "; E-mail: " + email + "; Телефон: " + phoneNumber + "; Зарплата: " + salary + "; Возраст: " + age + ";");
    }

    public int getAge() {
        return age;
    }

}
