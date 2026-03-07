package service;

import database.UserDatabase;
import model.User;

import java.util.List;

public class UserManager implements IManager<User> {
    private List<User> users;

    public UserManager() {
        this.users = UserDatabase.getList();
    }

    private int getCurrentId() {
        if (this.users.isEmpty()) return 1;
        User lastUser = this.users.get(this.users.size() - 1);
        return lastUser.getId() + 1;
    }

    public void register(User user) {
        // validate regex
        // validate khong duoc trung username
        user.setId(getCurrentId());
        this.users.add(user);
        UserDatabase.saveData(this.users);
    }

    public boolean login(String username, String password) {
        for(User item: users) {
            if(item.getUsername().equals(username) && item.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(int id, User user) {

    }

    @Override
    public List<User> getAll() {
        return List.of();
    }
}
