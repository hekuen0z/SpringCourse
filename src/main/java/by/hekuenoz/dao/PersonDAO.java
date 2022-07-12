package by.hekuenoz.dao;

import by.hekuenoz.models.Person;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hekuen0z - Alexei Kaptur
 */
@Component
public class PersonDAO {
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(1, "Tom"));
        people.add(new Person(2, "Bob"));
        people.add(new Person(3, "Lap"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

}
