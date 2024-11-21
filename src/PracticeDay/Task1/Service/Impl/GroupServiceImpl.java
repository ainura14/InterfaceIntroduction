package PracticeDay.Task1.Service.Impl;

import PracticeDay.Task1.DAO.GroupDAO;
import PracticeDay.Task1.DAO.Impl.GroupDAOImpl;
import PracticeDay.Task1.Model.Group;
import PracticeDay.Task1.Service.GroupService;

public class GroupServiceImpl implements GroupService {
    private final GroupDAOImpl groupDAO;

    public GroupServiceImpl(GroupDAOImpl groupDAO){
        this.groupDAO = groupDAO;
    }

    public void addGroup(Group newGroup){
        groupDAO.addGroup(newGroup);
    }

    @Override
    public Group[] getAllgroup() {
        return groupDAO.getAllgroup();
    }
}
