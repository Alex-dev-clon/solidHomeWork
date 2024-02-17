package homework.view;

import homework.controller.UserController;
import homework.model.User;

public class UserView {
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }
    public void run (){
        User user = userController.createUser("Bob");
        userController.report(user);
        userController.save(user);
    }
}
