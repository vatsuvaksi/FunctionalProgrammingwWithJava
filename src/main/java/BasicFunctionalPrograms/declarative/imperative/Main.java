package BasicFunctionalPrograms.declarative.imperative;

import java.util.ArrayList;
import java.util.List;

import static java.util.List.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = of(
                new Person("vatsuvaksi",Gender.Male),

        new Person("shrey",Gender.Male),

        new Person("shefali",Gender.Female),

        new Person("naimish",Gender.Male)


        );
        //Imperative approach
List<Person> female = new ArrayList<>();
        for(Person person : people){
            if(Gender.Male.equals(person.gender)){
                female.add(person);
            }
        }
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
