package PracticeDay.Task1.DAO.Impl;

import PracticeDay.Task1.DAO.GroupDAO;
import PracticeDay.Task1.Model.Group;
import PracticeDay.Task1.Model.Student;

import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;

public class GroupDAOImpl implements GroupDAO {
    Group[] dataGroup = new Group[0];


    @Override
    public void addGroup(Group newGroup) {
        dataGroup = Arrays.copyOf(dataGroup, dataGroup.length + 1);
        dataGroup[dataGroup.length - 1] = newGroup;
    }

    @Override
    public Group[] getAllgroup() {
        return dataGroup;
    }

    @Override
    public Group findGroupById(long groupId) {
        Group findGroup = new Group();
        for (Group group : dataGroup) {
            if(group.getId() == groupId){
                findGroup = group;
            }
        }
        return findGroup;
    }

    @Override
    public void findByGroupName(String name) {
        Group findGroupById = new Group();
        for (Group group : dataGroup) {
            if (group.getGroupName().equalsIgnoreCase(name)){
                findGroupById = group;
            }
        }
        System.out.println(findGroupById);
    }

    @Override
    public void addStudentByGroupName(String groupName, Student newStudent) {
        boolean isCheck = false;
        for (Group group : dataGroup) {
            if(group.getGroupName().equalsIgnoreCase(groupName)){
                isCheck = true;
                Student[] addNewStudent = {newStudent};
                group.setStudents(addNewStudent);
                System.out.println("Successfully added new student to this: " + groupName + " group.");
            }
        }
        if(!isCheck){
            System.out.println("Can't find this name of group.");
        }
    }

    @Override
    public Student[] getAllStudent() {
        int totalStudents = 0;
        for (Group group : dataGroup) {
            if(group.getStudents() != null) {
                totalStudents += group.getStudents().length;
            }
        }
        Student[] allStudents = new Student[totalStudents];
        int index = 0;

        for (Group group : dataGroup) {
            Student[] students = group.getStudents();
            if(students != null){
                for (Student student : students) {
                    allStudents[index++] = student;
                }
            }
        }
        return allStudents;
    }

    @Override
    public void  deleteGroupById(long groupId) {
        boolean findGroup = false;
        int dataSize = dataGroup.length;
        for (int i = 0; i < dataSize; i++) {
            if(dataGroup[i].getId() == groupId){
                findGroup = true;
                for (int j = i; j < dataSize - 1; j++) {
                    dataGroup[j] = dataGroup[j + 1];
                }
                System.out.println("Successfully deleted group with this id: " + groupId);
            }
            dataSize--;
            dataGroup = Arrays.copyOf(dataGroup, dataGroup.length - 1);
        }
        if(!findGroup){
            System.out.println("Can't find this group ID.");
        }
    }

    @Override
    public Student findStudentById(long id) {
        boolean check = false;
        Student[] searchStudent = new Student[0];
        Student studentFind = new Student();
        for (Group group : dataGroup) {
            searchStudent = group.getStudents();
            for (Student student : searchStudent) {
                if(student.getId() == id){
                    check = true;
                    studentFind = student;
                }
            }
        }
        if(!check){
            return null;
        }
        return studentFind;
    }

    @Override
    public void findByStudentName(String studentName) {
        boolean check = false;
       Student[] searchStudent = new Student[0];
       Student studentFind = new Student();
        for (Group group : dataGroup) {
            searchStudent = group.getStudents();
            for (Student student : searchStudent) {
                if(student.getFirstName().equalsIgnoreCase(studentName)){
                    check = true;
                    studentFind = student;
                }
            }
        }
        System.out.println(studentFind);
        if(!check){
            System.out.println("Can't find student with this " + studentName);
        }
    }

}
