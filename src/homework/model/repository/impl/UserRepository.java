package homework.model.repository.impl;

import homework.model.User;
import homework.model.repository.MyRepository;

public class UserRepository implements MyRepository {

    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }

    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }

    @Override
    public User createUser(String name) {
        return new User(name);
    }
}
