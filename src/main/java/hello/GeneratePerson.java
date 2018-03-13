package hello;

import com.google.common.collect.ImmutableList;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class GeneratePerson{

    public List<Person> people = new ArrayList<>();

    private List<String> names = new ArrayList<>();

    private List<String> surnames = new ArrayList<>();

    private List<String> domain = new ArrayList<>();

    public GeneratePerson(List<String> names,List<String> surnames, List<String> domain) {
        this.names = names;
        this.surnames = surnames;
        this.domain = domain;
    }

    private Random rand = new Random();
    private String name;
    private String surname;
    private String email;

    public void getRandomPerson() {
        name = names.get(rand.nextInt(names.size()));
        surname = surnames.get(rand.nextInt(surnames.size()));
        email = name + surname + domain.get(rand.nextInt(domain.size()));

        people.add(new Person(name,surname, email));
    }

    public void sortPeople() {

    Comparator<Person> byNames = Comparator.comparing(person -> person.name);
    Comparator<Person> bySurnames = Comparator.comparing(person -> person.surname);
    Comparator<Person> byEmail = Comparator.comparing(person -> person.email);

    people = people.stream().sorted(byNames.thenComparing(bySurnames).thenComparing(byEmail))
            .collect(Collectors.toList());


    }
}