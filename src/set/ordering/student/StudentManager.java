package set.ordering.student;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentManager {

    private Set<Student> students;

    public StudentManager(){
        students = new HashSet<>();
    }

    public void addStudent(long registration, String name, double grade){
        students.add(new Student(registration, name, grade));
    }

    public void removeStudent(long registration){
        for(Student s : students){
            if(s.getRegistration() == registration){
                students.remove(s);
                break;
            }
        }
    }

    public Set<Student> getAllStudentsByName(){
        return new TreeSet<>(students);
    }

    public Set<Student> getAllByGrade(){
        Set<Student> studentsByGrade = new TreeSet<>(new Student.ComparatorStudentByGrade());
        studentsByGrade.addAll(students);
        return studentsByGrade;
    }
    public Set<Student> getAll(){
        return students;
    }
    public static void main(String[] args) {

        StudentManager sm = new StudentManager();
        sm.addStudent(4458L, "Aelmajan", 10d);
        sm.addStudent(2235L, "Pancrácio", 8d);
        sm.addStudent(1189L, "Vilma", 7d);
        sm.addStudent(6589L, "Bernardo", 7.5d);

        sm.removeStudent(6589);

        System.out.println(sm.students);
        System.out.println(sm.getAllStudentsByName());
        System.out.println(sm.getAllByGrade());
        System.out.println(sm.getAll());
    }
}
