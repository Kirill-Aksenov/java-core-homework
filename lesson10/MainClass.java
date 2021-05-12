package com.company.lesson10;

import java.util.*;

public class MainClass {

    public static void main(String[] args) {


        List<String> animalsList = new ArrayList<>(Arrays.asList("Баран", "Осёл", "Олень", "Медведь", "Осёл", "Волк",
                "Лиса", "Барсук", "Заяц", "Ёж", "Белка", "Бобёр", "Олень", "Ёж", "Белка", "Олень", "Медведь", "Осёл",
                "Ёж", "Заяц"));

        Set<String> uniqueAnimals = new HashSet<>(animalsList);
        System.out.println("Список уникальных слов: " + uniqueAnimals);
        Map<String, Integer> countWordsMap = new HashMap<>();
        for (String word : animalsList) {
            countWordsMap.merge(word, 1, Integer::sum);
        }
        System.out.println(countWordsMap);


        Phonebook phonebook = new Phonebook();
        phonebook.add("Aksenov", "89207554066");
        phonebook.add("Aksenov", "89531447022");
        phonebook.add("Petrushin", "8900712248");
        phonebook.add("Maklashov", "89603648125");
        phonebook.add("Sopov", "89004672241");
        phonebook.add("Opalev", "89532880194");
        phonebook.add("Trapeznikov", "89817823236");
        phonebook.add("Trapeznikov", "89054872264");

        phonebook.get("Aksenov");
    }
}
