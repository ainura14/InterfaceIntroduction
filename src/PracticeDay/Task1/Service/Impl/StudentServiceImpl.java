package PracticeDay.Task1.Service.Impl;

import HomeWorkLMS.Task1.School;
import PracticeDay.Task1.DAO.Impl.GroupDAOImpl;
import PracticeDay.Task1.Model.Student;
import PracticeDay.Task1.Service.StudentService;

public class StudentServiceImpl implements StudentService {
    private final GroupDAOImpl groupDAO;

    public StudentServiceImpl(GroupDAOImpl groupDAO){
        this.groupDAO = groupDAO;
    }

    @Override
    public void addStudentByGroupName(String groupName, Student newStudent) {
        groupDAO.addStudentByGroupName(groupName, newStudent);
    }

    @Override
    public Student[] getAllStudent() {
        return groupDAO.getAllStudent();
    }

    @Override
    public Student findStudentById(long id) {
        return groupDAO.findStudentById(id);
    }

    @Override
    public void findByStudentName(String studentName) {
        groupDAO.findByStudentName(studentName);
    }


}
