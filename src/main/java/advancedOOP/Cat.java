package advancedOOP;

public class Cat extends Animal {
    private static int CAT_COUNT = 0;
    private String cat;

    public Cat() {
        super();
        this.cat = "Кот";
        CAT_COUNT++;
    }

    public Cat(String name) {
        super(name);
        this.cat = "Кот";
        CAT_COUNT++;
    }

    @Override
    public void run(int distance) {
        verifyInfoAndRun(distance);
    }

    private void verifyInfoAndRun(int distance) {
        if (distance > 200) {
            System.out.println("Кот может пробежать только 200 м.");
        } else if (distance < 0) {
            System.out.println("Некорректное значение расстояния.");
        }
        else if (getName() == null) {
            System.out.println(cat + " пробежал " + distance + " м.");
        }
        else {
            System.out.println(cat + " " + getName() + " пробежал " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать.");
    }

    public static int getCatCount() {
        return CAT_COUNT;
    }
}
