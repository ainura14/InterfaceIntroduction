package PracticeDay.Task1.Service;

import PracticeDay.Task1.Model.Group;

public interface GroupService {
    public abstract void addGroup(Group newGroup);
    Group[] getAllgroup();
    void deleteGroupById (long groupId);
    Group findGroupById(long groupId);
    void findByGroupName(String name);

}
