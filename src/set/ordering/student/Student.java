package set.ordering.student;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student>{
    private final long registration;
    private final String name;
    private final double grade;

    public Student(long registration, String name, double grade) {
        this.registration = registration;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return registration == student.registration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(registration);
    }

    @Override
    public int compareTo(Student o) {
        return name.compareToIgnoreCase(o.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "registration=" + registration +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    static class ComparatorStudentByGrade implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return Double.compare(o1.getGrade(), o2.getGrade());
        }
    }

    public long getRegistration() {
        return registration;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }
}
