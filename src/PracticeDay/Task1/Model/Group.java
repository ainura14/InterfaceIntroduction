package PracticeDay.Task1.Model;

import java.util.Arrays;

public class Group {
    private long id;
    private String groupName;
    private Student[] students;

    public Group() {
    }

    public Group(long id, String groupName) {
        this.id = id;
        this.groupName = groupName;
    }

    public Group(long id, String groupName, Student[] students) {
        this.id = id;
        this.groupName = groupName;
        this.students = students;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
