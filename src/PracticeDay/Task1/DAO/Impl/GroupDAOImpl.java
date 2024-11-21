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
    public void addStudentByGroupName(String groupName, Student newStudent) {
        boolean isCheck = false;
        for (Group group : dataGroup) {
            if(group.getGroupName().equalsIgnoreCase(groupName)){
                isCheck = true;
                Student[] addNewStudent = {newStudent};
                group.setStudents(addNewStudent);
                System.out.println("Successfully added.");
            }
        }
        if(!isCheck){
            System.out.println("Can't find this name of group.");
        }
    }

}
