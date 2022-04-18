package OOPtest;

public class Staffer extends Employee {
    private String position;
    private String positionLevel;
    private int experience;
    private double salary;
    public Staffer(String name, int age, String position, String positionLevel, int experience) {
        super(name, age);
        this.position = position;
        this.positionLevel = positionLevel;
        this.experience = experience;
    }

    public double getSalary() {
        salary = getStarterSalary() * positionLevelMultiplier() + experienceBonus();
        return salary;
    }

    private double positionLevelMultiplier() {
        double multiplier = 1;
        if (positionLevel.equalsIgnoreCase("Junior")) {
            multiplier = 1.5;
        } else if (positionLevel.equalsIgnoreCase("Middle")) {
            multiplier = 2.0;
        } else if (positionLevel.equalsIgnoreCase("Senior")) {
            multiplier = 2.5;
        } else if (positionLevel.equalsIgnoreCase("Lead")) {
            multiplier = 3;
        }
        return multiplier;
    }


    private double experienceBonus() {
        double bonus = 1;
        if (experience % 2 == 0) {
            bonus = experience / 2 * 5 * getStarterSalary() / 100;
        }
        return bonus;
    }

    @Override
    public void showInfo() {
        System.out.println("Сотрудник:" + getName() + " id: " + getId() + " Возраст: " + getAge() + " Должность: " + positionLevel + " " + position
        + " Опыт: " + experience + " Зарплата: " + getSalary());
    }
}

