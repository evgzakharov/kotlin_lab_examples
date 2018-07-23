package test;

import java.util.*;

public class Persons {
    private Map<Gender, List<Person>> values = new HashMap<>();

    public Persons() {
        values.put(Gender.FEMALE, new ArrayList<>());
        values.put(Gender.MALE, new ArrayList<>());
    }

    public void add(Person person) {
        values.get(person.getGender())
                .add(person);
    }

    public void remove(Person person) {
        values.get(person.getGender())
                .remove(person);
    }

    public boolean contains(Person person) {
        return values.get(person.getGender())
                .contains(person);
    }

    @Override
    public String toString() {
        return "Operators{" +
                "values=" + values +
                '}';
    }
}
