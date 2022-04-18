package OOPtest;

public class Freelancer extends Employee{
    private String location;
    private int projectsAssigned;
    private double payment;

    public Freelancer(String name, int age, String location, int projectsAssigned) {
        super(name, age);
        this.location = location;
        this.projectsAssigned = projectsAssigned;
    }

    @Override
    public void showInfo() {
        System.out.println("Внештатный сотрудник: " + getName()  + " id: " + getId() + " Возраст: " + getAge() + " Локация: "
                + location + " Проекты в работе: " + projectsAssigned + " Размер выплаты: " + getPayment());
    }

    public double getPayment() {
        payment = getStarterSalary() * projectsAssigned;
        return payment;
    }
}
