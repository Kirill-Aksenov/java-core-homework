package lesson05;

public class MainClass {

    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Aksenov Kirill", "Android-developer",
                "kirill.aksenov@internet.ru", 89207446041L, 170000, 30);
        empArray[1] = new Employee("Arkhipenkov Petr", "Quality Assurance",
                "petr.andreevich@mail.ru", 89006457712L, 65000, 30);
        empArray[2] = new Employee("Bozhanov Kirill", "System administrator", "kiryusha@gmail.com",
                89606564144L, 50000, 30);
        empArray[3] = new Employee("Gribov Vladimir", "ios-developer", "gribov@ya.ru",
                89191286642L, 150000, 54);
        empArray[4] = new Employee("Safronov Sergey", "Data Scientist", "ultra-hardcore@gmail.com",
                89007770000L, 220000, 42);

        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40) {
                empArray[i].printInfo();
            }
        }
    }

}
