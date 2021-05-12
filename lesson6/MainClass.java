package com.company.lesson6;

public class MainClass {

    public static void main(String[] args) {

        Animal catMurzik = new Cat("Мурзик");
        Animal catBarsik = new Cat("Барсик");
        Animal catVasya = new Cat("Вася");
        Animal dogRax = new Dog("Рэкс");
        Animal dogBobik = new Dog("Бобик");
        Cat catOne = new Cat("sss");

        catMurzik.mustRun(250);
        catMurzik.mustSwim(1);
        catBarsik.mustRun(80);
        catVasya.mustRun(190);
        dogRax.mustRun(700);
        dogRax.mustSwim(20);
        dogBobik.mustRun(400);
        dogBobik.mustSwim(1);

        Animal.printSumAnimals();
        Cat.printSumCats();
        Dog.printSumDogs();

    }

}
