package oopBasics;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Калашников И.Е.", "Ответственный", "onduty@yandex.ru", "3331666", 1500, 25);
        employees[1] = new Employee("Иванов И.И.", "Заместитель ответственного", "onduty2@mail.ru", "3331555", 1300, 24);
        employees[2] = new Employee("Петров П.П.", "Ответственный секретарь", "secretaryonduty@mail.ru", "3331444", 1250, 42);
        employees[3] = new Employee("Сергеев С.С.", "Безответственный секретарь", "unavailable@mail.ru", "3331000", 1000, 45);
        employees[4] = new Employee("Николаев Н.Н.", "Буфетчик", "food@yandex.ru", "3331222", 5000, 25);


        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].showInfo();
            }
        }
    }
}
