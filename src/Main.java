public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Тузик");
        cat.run(100);
        cat.swim(5);
        dog.run(600);
        dog.swim(5);
        Cat.printCountOfCat();
        Dog.printCountOfDog();
        Animal.printCountOfAnimal();

    }
}
