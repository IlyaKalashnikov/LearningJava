package OOPtest;

import java.util.Random;

public abstract class Employee {
    protected final double starterSalary = 40000.0;
    private final int id = new Random().nextInt(2147483647);
    private final String name;
    private final int age;

    public Employee(String name, int age) {
        System.out.println(id);
        this.name = name;
        this.age = age;
    }

    public abstract void showInfo();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
