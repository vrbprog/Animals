public abstract class Animal {
    private final String name;

    protected int limitRun;
    protected int limitSwim;
    static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    static void printCountOfAnimal(){
        System.out.println("Общее число животных : " + animalCount);
    }

    public void setLimitRun(int limitRun) {
        this.limitRun = limitRun;
    }

    public void setLimitSwim(int limitSwim) {
        this.limitSwim = limitSwim;
    }

    public abstract void run(int length);

    public abstract void swim(int length);

    public String getName() {
        return name;
    }
}
