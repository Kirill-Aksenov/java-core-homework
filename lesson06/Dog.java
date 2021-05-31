package lesson06;

public class Dog extends Animal {

    private static int sumDogs;

    public Dog(String name) {
        super(name);
        setMaxRun(500);
        setMaxSwim(10);
        sumDogs += 1;
    }

    @Override
    public void mustRun(int runningDistance) {
        if (runningDistance > getMaxRun()) {
            System.out.println("Пёс " + getName() + " не может пробежать так много!");
        } else if (runningDistance <= 0) {
            System.err.println("Введите положительное число!");
        } else {
            System.out.println("Пёс " + getName() + " пробежал метров: " + runningDistance);
        }
    }

    @Override
    public void mustSwim(int swimmingDistance) {
        if (swimmingDistance > getMaxSwim()) {
            System.out.println("Пёс " + getName() + " не может проплыть так много!");
        } else if (swimmingDistance <= 0) {
            System.err.println("Введите положительное число!");
        } else {
            System.out.println("Пёс " + getName() + " проплыл метров: " + swimmingDistance);
        }
    }

    public static void printSumDogs() {
        System.out.println("Число созданных собачек: " + sumDogs);
    }
}
