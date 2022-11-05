package org.campus02.arrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {


    HashSet<String> strings = new HashSet<>();


        //zum set hinzufügen
        strings.add("Hallo");
        strings.add("Servus");
        System.out.println("strings.size() = " + strings.size());
        System.out.println("strings.toString() = " + strings.toString());

        strings.add("hallo");
        System.out.println("strings.size() = " + strings.size());
        System.out.println("strings.toString() = " + strings.toString());

        HashSet<Person> people = new HashSet<>();

        HashSet<Person> persons = new HashSet<>();
        persons.add(new Person("Max", "Mustermann"));
        //Person Max nochmals hinzufügen
        persons.add(new Person("Max", "Mustermann"));
        System.out.println(persons.toString());

    }
}
