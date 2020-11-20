package Streams;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.List.of;

public class _Streams {
    public static void main(String[] args) {
        List<Person> people = of(
                new Person("vatsuvaksi", Gender.Male),
                new Person("shrey", Gender.Male),
                new Person("shefali", Gender.Female),
                new Person("naimish", Gender.Male)
        );
        //give all the genders of the list
       List<Gender> peopleGender= people.stream().map(person -> person.gender).collect(Collectors.toList());
         System.out.println(peopleGender);
         //Get all the names of people from the list
        people.stream().map(person -> person.name).collect(Collectors.toList()).forEach(System.out::println);
        //Check if all are males
        boolean containsAllMen =people.stream().allMatch(person -> Gender.Male.equals(person.gender));
        System.out.println(containsAllMen);

    }
    static class Person{
        private String name;
        private Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }


        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        Male, Female
    }
}
