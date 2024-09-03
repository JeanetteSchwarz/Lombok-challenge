package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student rachel = new Student("123", "Rachel", "New York",2);
        Student monika = new Student("456", "Monika", "New York",1);
        Student joey = new Student("789", "Joey", "New York",3);

        Teacher ross = new Teacher("345", "Dr. Geller", "Paleontology");
        Teacher chandler = new Teacher("987", "Mr. Bing", "Numbers");

        List<Student> students = new ArrayList<>();

        students.add(rachel);
        students.add(monika);
        students.add(joey);

        Course dinos = new Course("100", "Paleontology", ross, students);
        Course numbers = new Course("200", "Numbers", chandler, students);

        System.out.println(dinos);
        System.out.println(ross);
        System.out.println(joey);

        chandler = chandler.withSubject("Bad Jokes");
        System.out.println(chandler);
    }

    }



