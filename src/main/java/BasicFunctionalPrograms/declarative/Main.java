package BasicFunctionalPrograms.declarative;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.List.of;

public class Main {
    public static void main(String[] args) {
        List<Person> people = of(
                new Person("vatsuvaksi", Gender.Male),

                new Person("shrey", Gender.Male),

                new Person("shefali", Gender.Female),

                new Person("naimish", Gender.Male)


        );
        //Declarative approach
         /*
        people.stream()
                .filter(person -> Gender.Female.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);
         */
        //collecting it in a list
        List<Person> female =  people.stream()
                .filter(person -> Gender.Female.equals(person.gender))
                .collect(Collectors.toList());
        System.out.println(female);

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
