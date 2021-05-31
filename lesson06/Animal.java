package lesson06;

public abstract class Animal {

    private final String name;
    private int maxRun;
    private int maxSwim;
    private static int sumAnimals;

    public Animal(String name) {
        this.name = name;
        sumAnimals += 1;
    }

    public abstract void mustRun (int runningDistance);
    public abstract void mustSwim (int swimmingDistance);

    public static void printSumAnimals() {
        System.out.println("Число созданных животных: " + sumAnimals);
    }

    public String getName() {
        return name;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
    }

    public int getMaxSwim() {
        return maxSwim;
    }
}
