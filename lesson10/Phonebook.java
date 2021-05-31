package lesson10;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    private final Map<String, String> phonebook = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        phonebook.merge(surname, phoneNumber, (oldVal, newVal) -> oldVal + ", " + newVal);
    }

    public void get(String surname) {
        if (phonebook.containsKey(surname)) {
            System.out.println("Телефон(ы) для абонента " + surname + ": " + phonebook.get(surname));
        } else {
            System.out.println("Такой фамилии не найдено!");
        }
    }
}
