package advancedOOP;

public class AnimalsApp {
    public static void main(String[] args) {
        Dog druzhok = new Dog("Дружок");
        Cat barsik = new Cat("Барсик");
        Dog bobik = new Dog("Бобик");
        Animal tuzik = new Dog("Тузик");
        Cat murka = new Cat();
        tuzik.swim(8);
        druzhok.run(250);
        bobik.run(600);
        bobik.swim(5);
        barsik.run(300);
        barsik.run(150);
        barsik.swim(20);
        murka.run(150);
        System.out.println(Animal.getAnimalsCount());
        System.out.println(Dog.getDogCount());
        System.out.println(Cat.getCatCount());
    }
}
