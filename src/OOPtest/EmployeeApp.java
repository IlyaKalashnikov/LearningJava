package OOPtest;

import OOPtest.enums.Position;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];

        employees[0] = new Staffer("Калашников И.Е.", 25, "Java developer",
                Position.JUNIOR, 2);
        employees[1] = new Freelancer("Иванов И.И.", 21, "Санкт-Петербург", 3);

        for (Employee employee : employees) {
            System.out.println(employee);

            employee.showInfo();
        }
    }
}
