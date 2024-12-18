package PracticeDay.Task1.Service;

import PracticeDay.Task1.Model.Student;

public interface StudentService {
    void addStudentByGroupName(String groupName, Student newStudent);
    Student[] getAllStudent();
    Student findStudentById(long id);
    void findByStudentName(String studentName);
  }
