package OOPtest;

import java.util.Random;

public abstract class Employee {
    private static int EMPLOYEES_COUNT;
    private int id;
    private String name;
    private int age;
    private double starterSalary = 40000.0;

    public Employee() {
    }

    public Employee(String name, int age) {
        this.id = new Random().nextInt(2147483647);
        this.name = name;
        this.age = age;
        EMPLOYEES_COUNT++;
    }

    public abstract void showInfo();

    public static int getEmployeesCount() {
        return EMPLOYEES_COUNT;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getStarterSalary() {
        return starterSalary;
    }
}
