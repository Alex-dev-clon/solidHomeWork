package homework.controller;

import homework.model.User;
import homework.model.repository.MyRepository;

public class UserController {
    private final MyRepository repository;

    public UserController(MyRepository repository) {
        this.repository = repository;
    }
    public User createUser(String name){
        return repository.createUser(name);
    }
    public void report (User user){
        repository.report(user);
    }
    public void save (User user){
        repository.save(user);
    }

}
