package advancedOOP;

public abstract class Animal {
    /**Создать классы Собака и Кот с наследованием от класса Животное. Все животные могут бежать и плыть.
     * В качестве параметра каждому методу передается длина препятствия.
     * Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
     * У каждого животного есть ограничения на действия
     * (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
     * Добавить подсчет созданных котов, собак и животных.
     *
     */
    private static int ANIMALS_COUNT = 0;
    private String name;

    public Animal () {
        ANIMALS_COUNT++;
    }

    public Animal (String name) {
        this.name = name;
        ANIMALS_COUNT++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public String getName(){
        return name;
    }

    public static int getAnimalsCount() {
        return ANIMALS_COUNT;
    }
}
