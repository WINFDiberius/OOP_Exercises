package org.campus02.arrayList;

import org.campus02.student.Student;

import java.util.HashSet;

public class StudentSetDemo {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<Student>();

        Student hashsetadi = new Student(4,"Adolf Postl");
        Student hashsetekatja = new Student(5,"Katja Feyrer");
        Student hashsetdaniel = new Student(3,"Daniel Sattler");
        students.add(hashsetadi);
        students.add(hashsetekatja);
        students.add(hashsetdaniel);
        students.add(hashsetdaniel);

        students.remove(hashsetdaniel);

        System.out.println(students.equals(hashsetekatja));

        for (Student student:students )
            System.out.println("student = " + student);


        Student daniel2 = new Student(3,"Daniel Sattler");

        System.out.println("Zeigt ob User schon hinzugefügt wurde: students.contains(hashsetdaniel) = " + students.contains(hashsetekatja));
        System.out.println("students.contains(new Student(4,\"Adolf Postl\")) = " + students.contains(new Student(4,"Adolf Postl")));


    }
}
