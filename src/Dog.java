public class Dog extends Animal{

    static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
        setLimitRun(500);
        setLimitSwim(10);
    }

    static void printCountOfDog(){
        System.out.println("Общее число собак : " + dogCount);
    }

    @Override
    public void run(int length) {
        if(length <= limitRun) {
            System.out.println("Dog " + getName() + " пробежал " + length + " метров");
        }else {
            System.out.println("Dog " + getName() + " не может пробежать " + length + " метров");
        }
    }

    @Override
    public void swim(int length) {
        if(length <= limitSwim) {
            System.out.println("Dog " + getName() + " проплыл " + length + " метров");
        }else {
            System.out.println("Dog " + getName() + " не может проплыть " + length + " метров");
        }
    }
}
