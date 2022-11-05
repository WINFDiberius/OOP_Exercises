package org.campus02.arrayList;

import org.campus02.student.Student;

import java.util.HashSet;

public class StudentSetDemo {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<Student>();

        Student adi = new Student(4,"Adolf Postl");
        Student katja = new Student(5,"Katja Feyrer");
        Student daniel = new Student(3,"Daniel Sattler");
        students.add(adi);
        students.add(katja);
        students.add(daniel);
        students.add(daniel);

        students.remove(daniel);

        System.out.println(students.equals(katja));

        for (Student student:students )
            System.out.println("student = " + student);


        Student daniel2 = new Student(3,"Daniel Sattler");




    }
}
