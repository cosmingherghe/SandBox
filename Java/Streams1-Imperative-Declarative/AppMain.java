import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class AppMain {
  public static void main(String[] args) {

    // Imperative approach❌
    System.out.println("\n Imperative approach \n");
    List<Person> persons = PersonUtil.getPersons();

    List<Person> females = new ArrayList<>();

    for (Person person : persons) {
      if (person.getGender().equals(Gender.FEMALE))
        females.add(person);
    }

    females.forEach(System.out::println);

    // Declarative approach✔️

    System.out.println("\n Declarative approach \n");

    // Filter
    System.out.println("\nFilter\n .forEach(System.out::println); \n");
    persons.stream()
        .filter(p -> p.getGender().equals(Gender.FEMALE))
        .forEach(System.out::println);

    System.out.println("\nFilter\n .collect(Collectors.toList()); \n");
    List<Person> females2 = persons.stream()
        .filter(p -> p.getGender().equals(Gender.FEMALE))
        .collect(Collectors.toList());
    females2.forEach(System.out::println);

    // Sort
    System.out.println("\nSort\n .sorted(Comparator.comparing(Person::getName).reversed() \n");
    persons.stream()
        .sorted(Comparator.comparing(Person::getName).reversed())
        .forEach(System.out::println);

    // Match
    System.out.println("\nSort\n  .allMatch(p -> p.getAge() == 75) \n");
    boolean isAge75InList = persons.stream()
        .allMatch(p -> p.getAge() == 75);
    System.out.println(isAge75InList);

    // AnyMatch
    System.out.println("\nSort\n  .anyMatch(p -> p.getAge() == 75) \n");
    boolean isGreaterThan8 = persons.stream()
        .anyMatch(p -> p.getAge() > 8);
    System.out.println(isGreaterThan8);

    // noneMatch
    System.out.println("\nSort\n  .noneMatch() \n");
    boolean isNoneMatch = persons.stream()
        .noneMatch(p -> p.getName().equals("Alex Boz"));
    System.out.println(isNoneMatch);

    // Group
    System.out.println("\nGroup\n groupByGender\n");
    Map<Gender, List<Person>> groupByGender = persons.stream()
        .collect(Collectors.groupingBy(Person::getGender));
    groupByGender.forEach((gender, ppl) -> {
      System.out.println(gender);
      ppl.forEach(System.out::println);
    });

    // noneMatch
    System.out.println("\nMax / Min\n\n");
    persons.stream()
        .max(Comparator.comparing(Person::getAge))
        .ifPresent(System.out::println);

    Optional<Person> PersonMaxAge = persons.stream()
        .min(Comparator.comparing(Person::getAge));
    System.out.println(PersonMaxAge);

    // Chain
    System.out.println("\nChain / Chain\n\n");
    // find every female, the oldest, return first name
    Optional<String> oldestFemaleName = persons.stream()
        .filter(p -> p.getGender().equals(Gender.FEMALE))
        .max(Comparator.comparing(Person::getAge))
        .map(Person::getName);
    oldestFemaleName.ifPresent(name -> System.out.println(name));
  }
}