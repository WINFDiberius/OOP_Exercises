package org.campus02.exercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentMapDemo {
    public static void main(String[] args) {
        /*
        Key | Value
        "Susi Sorglos"   | {1,2,3,4}
        "Max Mustermann" | {2,3,4,2,2}
         */

        HashMap<String, ArrayList<Integer>> gradesOfStudents = new HashMap<String, ArrayList<Integer>>();
        
        gradesOfStudents.put("Susi Sorglos", new ArrayList<>());
        gradesOfStudents.put("Max Mustermann", new ArrayList<>());

        System.out.println("gradesOfStudents = " + gradesOfStudents);
        
        ArrayList<Integer> grades;
        grades = gradesOfStudents.get("Susi Sorglos");
        grades.add(3);
        grades.add(2);
        System.out.println("gradesOfStudents = " + gradesOfStudents);

        grades = gradesOfStudents.get("Max Mustermann");
        grades.add(2);
        grades.add(2);
        grades.add(1);

        grades = gradesOfStudents.get("Susi Sorglos");
        grades.add(5);

        System.out.println("gradesOfStudents = " + gradesOfStudents);

        //gradesOfStudents.remove("Susi Sorglos");
        System.out.println("gradesOfStudents = " + gradesOfStudents);

        System.out.println("gradesOfStudents = " + gradesOfStudents.containsKey("Max Mustermann"));
        System.out.println("gradesOfStudents = " + gradesOfStudents.containsKey("Susi Sorglos"));

        System.out.println("gradesOfStudents = " + gradesOfStudents.keySet() + gradesOfStudents.values());



        ArrayList<String> keys = new ArrayList<>();

        keys.add("Key");

        for (int i = 0; i < keys.size(); i++) {
            String student = keys.get(i);
            System.out.println("student = " + student);
            
        }
        
        for(String student:keys)
        {
            System.out.println("student = " + student);
        }

        for (Map.Entry<String, ArrayList<Integer>> entry:
             gradesOfStudents.entrySet())
        {
            System.out.println("entry = " + entry);
        }
    }
}
