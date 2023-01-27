package dev.cosmingherghe;

import java.io.IOException;
import java.util.List;

import dev.cosmingherghe.model.Person;
import dev.cosmingherghe.model.UtilData;

public class App {
    public static void main(String[] args) throws IOException {

        List<Person> persons = UtilData.getPeople("resources\\people.json", Person.class);

        System.out.println(persons.get(0));

        persons.stream()
                .filter(p -> p.getId() < 10)
                .forEach(p -> System.out.println(p.getFirstName()));

        System.out.println("--- Generics ---");

    }
}
