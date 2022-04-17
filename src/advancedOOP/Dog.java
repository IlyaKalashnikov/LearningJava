package advancedOOP;

public class Dog extends Animal {
    private static int DOG_COUNT = 0;
    private String dog;

    public Dog () {
        super();
        this.dog = "Собака";
        DOG_COUNT++;
    }
    public Dog(String name) {
        super(name);
        this.dog = "Собака";
        DOG_COUNT++;
    }

    @Override
    public void run(int distance) {
        verifyInfoAndRun(distance);
    }

    private void verifyInfoAndRun(int distance) {
        if (distance > 500) {
            System.out.println("Собака может пробежать только 500 м.");
        } else if (distance < 0) {
            System.out.println("Некорректное значение расстояния.");
        } else if (getName() == null) {
            System.out.println(dog + " пробежала " + distance + " м.");
        }
        else {
            System.out.println(dog + " " + getName() + " пробежала " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        verifyInfoAndSwim(distance);
    }

    private void verifyInfoAndSwim(int distance) {
        if (distance > 10) {
            System.out.println("Собака может проплыть только 10 м.");
        } else if (distance < 0) {
            System.out.println("Некорректное значение расстояния.");
        } else if (getName() == null) {
            System.out.println(dog + " проплыла " + distance + " м.");
        }
        else {
            System.out.println(dog + " " + getName() + " проплыла " + distance + " м.");
        }
    }

    public static int getDogCount() {
        return DOG_COUNT;
    }
}
