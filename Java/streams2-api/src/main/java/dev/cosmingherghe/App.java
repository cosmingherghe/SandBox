package dev.cosmingherghe;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import dev.cosmingherghe.model.Person;
import dev.cosmingherghe.model.PersonDTO;
import dev.cosmingherghe.model.UtilData;

public class App {
    public static void main(String[] args) throws IOException {

        List<Person> persons = UtilData.getPeople("resources\\people.json", Person.class);

        // Map Person to PersonDTO
        // First approach
        List<PersonDTO> personsListDTO = persons.stream()
                .map(p -> {
                    PersonDTO pDto = new PersonDTO(
                            p.getId(), p.getLastName(), p.getAge());
                    return pDto;
                })
                .collect(Collectors.toList());

        // Second approach
        List<PersonDTO> personDTOs = persons.stream()
                .map(p -> UtilData.mapToPersonDTO(p))
                .collect(Collectors.toList());

        // ------------------------------------------------------

        // Imperative Programming
        ArrayList<Person> age18OrLess = new ArrayList<>();

        for (int i = 0, k = 0; i < persons.size(); i++) {
            if (persons.get(i).getAge() <= 18) {
                System.out.println(persons.get(i));
                k++;
                if (k == 10)
                    break;
            }
        }

        // Declarative programming
        System.out.println("--- Streams ---");
        persons.stream()
                .filter(p -> p.getAge() <= 18)
                .limit(10)
                .forEach(System.out::println);

    }
}
