package l17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person (String firstName , String lastName , int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main (String[] args) {
        Person person1 = new Person("Tom" , "Hardy" , 42);
        Person person2 = new Person("Chris" , "Hemsworth" , 36);
        Person person3 = new Person("Ryan" , "Gosling" , 39);
        Person person4 = new Person("Ryan" , "Reynolds" , 43);
        Person person5 = new Person("Matthew" , "McConaughey" , 50);

        List<Person> actors = new ArrayList<>();
        actors.add(person1);
        actors.add(person2);
        actors.add(person3);
        actors.add(person4);
        actors.add(person5);

        String fullName = actors.stream()
                .filter(person -> (person.getFirstName() + person.getLastName()).length() < 15)
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .map(person -> person.getFirstName() + " " + person.getLastName() + " " + person.getAge())
                .findFirst().get();
        System.out.println(fullName);

    }

    public String getFirstName () {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public int getAge () {
        return age;
    }

}
