package by.bat.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("John Black", 4, 5.0);
        Student st2 = new Student("Jonatan Smith", 2, 3.5);
        Student st3 = new Student("Cory Teylor", 5, 4.9);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents(){
        System.out.println("Start working methods getStudents");
        System.out.println(students.get(3));
        System.out.println("Information from method get Students: ");
        System.out.println(students);
        return students;
    }

}
