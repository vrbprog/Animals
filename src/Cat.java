public class Cat extends Animal{

    static int catCount = 0;

    public Cat(String name) {
        super(name);
        catCount++;
        setLimitRun(200);
        setLimitSwim(0);
    }

    static void printCountOfCat(){
        System.out.println("Общее число котов : " + catCount);
    }

    @Override
    public void run(int length) {
        if(length <= limitRun) {
            System.out.println("Cat " + getName() + " пробежал " + length + " метров");
        }else {
            System.out.println("Cat " + getName() + " не может пробежать " + length + " метров");
        }
    }

    @Override
    public void swim(int length) {
        if(length <= limitSwim) {
            System.out.println("Cat " + getName() + " проплыл " + length + " метров");
        }else {
            System.out.println("Cat " + getName() + " не может проплыть " + length + " метров");
        }
    }
}
