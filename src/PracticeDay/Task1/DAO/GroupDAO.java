package PracticeDay.Task1.DAO;

import PracticeDay.Task1.Model.Group;
import PracticeDay.Task1.Model.Student;

public interface GroupDAO {
    public abstract void addGroup(Group newGroup);
    Group[] getAllgroup();

    void addStudentByGroupName(String groupName, Student newStudent);
}
