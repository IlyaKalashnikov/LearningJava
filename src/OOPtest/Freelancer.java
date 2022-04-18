package OOPtest;

public class Freelancer extends Employee {
    private final String location;
    private final int projectsAssigned;

    public Freelancer(String name, int age, String location, int projectsAssigned) {
        super(name, age);
        this.location = location;
        this.projectsAssigned = projectsAssigned;
    }

    @Override
    public void showInfo() {
        System.out.println("Внештатный сотрудник: " + getName() + " id: " + getId() + " Возраст: " + getAge() + " Локация: "
                + location + " Проекты в работе: " + projectsAssigned + " Размер выплаты: " + calcPayment());
    }

    public double calcPayment() {
        return starterSalary * projectsAssigned;
    }
}
