package org.campus02.student;

import java.util.Objects;

public class Student {
    private Integer matrNr;
    private String fullName;

    public Student(Integer matrNr, String fullName) {
        this.matrNr = matrNr;
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(matrNr, student.matrNr) && Objects.equals(fullName, student.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matrNr, fullName);
    }

    public Integer getMatrNr() {
        return matrNr;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "matrNr=" + matrNr +
                ", fullName='" + fullName + '\'' +
                '}';
    }

}
