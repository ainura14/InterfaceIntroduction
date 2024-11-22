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

        // Add
        groupService.addGroup(new Group(1l, "java 16"));
        groupService.addGroup(new Group(2l, "java 15"));
        groupService.addGroup((new Group(3l, "java 14")));

        // AddStudentByGroupName
        System.out.println("Add student by group name: ");
        studentService.addStudentByGroupName("java 16", new Student(1l, "Ainura", "Nusubalieva", LocalDate.of(2004, 11, 14), 'F', 990990990));
        // Get all group
        System.out.println("All groups: ");
        System.out.println(Arrays.toString(groupService.getAllgroup()));

        // Get all student
        System.out.println("All students: ");
        System.out.println(Arrays.toString(studentService.getAllStudent()));

        // Delete group by ID
        System.out.println("Delete group by ID: ");
        groupService.deleteGroupById(2l);
        System.out.println(Arrays.toString(groupService.getAllgroup()));

        // Find group by ID
        System.out.println("Find group by ID: \n" + groupService.findGroupById(1l));

        // Find Student by ID
        System.out.println("Find student by ID: ");
        System.out.println(studentService.findStudentById(1l));

        // Find group by Name
        System.out.println("Find group by name: ");
        groupService.findByGroupName("java 16");

        // Find student by name
        System.out.println("Find student with name: ");
        studentService.findByStudentName("Ainura");

    }
}
