package PracticeDay.Task1;

import PracticeDay.Task1.DAO.Impl.GroupDAOImpl;
import PracticeDay.Task1.Model.Group;
import PracticeDay.Task1.Model.Student;
import PracticeDay.Task1.Service.Impl.GroupServiceImpl;
import PracticeDay.Task1.Service.Impl.StudentServiceImpl;

import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GroupDAOImpl groupDAO= new GroupDAOImpl();
        GroupServiceImpl groupService = new GroupServiceImpl(groupDAO);

        StudentServiceImpl studentService = new StudentServiceImpl(groupDAO);

        groupService.addGroup(new Group(1l, "java16"));
        System.out.println(Arrays.toString(groupService.getAllgroup()));

        studentService.addStudentByGroupName("java16", new Student(1l, "Ainura", "Nusubalieva", LocalDate.of(2004, 11, 14), 'F', 990990990));
        System.out.println(Arrays.toString(groupService.getAllgroup()));

    }
}
