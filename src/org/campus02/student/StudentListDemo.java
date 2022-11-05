package org.campus02.student;

import java.util.ArrayList;

public class StudentListDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student(1, "Susi Sorglos"));


        Student susi = students.get(0);

        Student resi = new Student(1,"Susi Sorglos");

        System.out.println("susi = " + susi);
        System.out.println("resi = " + resi);

        Student max = new Student(2, "Max Mustermann");
        students.add(max);

        for (int i = 0; i < students.size(); i++) {
            System.out.println("students = " + students);
        }

        students.remove(max);
        for (int i = 0; i < students.size(); i++) {
            System.out.println("students = " + students);
        }

        System.out.println(students.toString());

        boolean containSusi = students.contains(susi);
        System.out.println("containSusi = " + containSusi);

        boolean containSusi2 = containsName(students,"Susi Sorglos");
        System.out.println("containSusi2 = " + containSusi2);
        
        boolean containMatrNrSusi = containsMatrNr(students, 1);
        System.out.println("containMatrNrSusi = " + containMatrNrSusi);

        boolean containBoth = containsName(students, "Susi Sorglos") && containsMatrNr(students, 1);
        System.out.println("containBoth = " + containBoth);
        boolean containEquals = students.equals(susi);
        System.out.println("containEquals = " + containEquals);


    }
    public static boolean containsName(ArrayList<Student> studentList, String searchName){
        for (Student student:studentList) {
            if (student.getFullName().equals(searchName)){
                return true;
            }
        }
        return false;
    }

    public static boolean containsMatrNr(ArrayList<Student> studentList, int searchMatrNr)
    {
        for (Student student:studentList) {
            if(student.getMatrNr().equals(searchMatrNr)){
                return true;
            }
        }
        return false;
    }
}
