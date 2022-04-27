package OOPtest;

import OOPtest.enums.Position;

public class Staffer extends Employee {
    private final String role;
    private final Position position;
    private final int experience;

    public Staffer(String name,
                   int age,
                   String role,
                   Position position,
                   int experience) {
        super(name, age);
        this.role = role;
        this.position = position;
        this.experience = experience;
    }

    public double getSalary() {
        return starterSalary * positionLevelMultiplier() + experienceBonus();
    }

    private double positionLevelMultiplier() {
        return switch (position) {
            case JUNIOR -> 1.5;
            case MIDDLE -> 2.0;
            case SENIOR -> 2.5;
            case LEAD -> 3.0;
        };
    }

    private double experienceBonus() {
        return experience % 2 == 0 ? 1 : experience / 2 * 5 * starterSalary / 100;
    }

    @Override
    public void showInfo() {
        System.out.println("Сотрудник:" + getName() + " id: " + getId() + " Возраст: " + getAge() + " Должность: " +
                position.getDescription() + " " + position + " Опыт: " + experience + " Зарплата: " + getSalary());
    }

    @Override
    public String toString() {
        return getName();
    }
}

