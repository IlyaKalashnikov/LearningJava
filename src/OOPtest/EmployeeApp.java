package OOPtest;

public class EmployeeApp {
    public static void main(String[] args) {

        Employee [] employees = new Employee[2];
        employees[0] = new Staffer("Калашников И.Е.", 25, "Java developer",
                "Junior", 2);
        employees[1] = new Freelancer("Иванов И.И.", 21, "Санкт-Петербург",
                3);
        for (int i = 0; i < employees.length; i++) {
            employees[i].showInfo();
        }
    }
}
