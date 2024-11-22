package PracticeDay.Task1.DAO;

import PracticeDay.Task1.Model.Group;
import PracticeDay.Task1.Model.Student;

public interface GroupDAO {
    // ---------------- Group -------------------
    public abstract void addGroup(Group newGroup);
    Group[] getAllgroup();
    Group findGroupById(long groupId);
    void findByGroupName(String name);

///////////////////////////////////////////////////////

    //------------  Student  -------------------
    void addStudentByGroupName(String groupName, Student newStudent);
    Student[] getAllStudent();
    void  deleteGroupById(long groupId);
    Student findStudentById(long id);
    void findByStudentName(String studentName);
}
