package homework.model.repository;

import homework.model.User;

public interface MyRepository {
    void report (User user);
    void save (User user);
    User createUser(String name);
}
