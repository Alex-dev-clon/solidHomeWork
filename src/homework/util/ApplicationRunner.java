package homework.util;

import homework.controller.UserController;
import homework.model.User;
import homework.model.repository.MyRepository;
import homework.model.repository.impl.UserRepository;
import homework.view.UserView;

public class ApplicationRunner {
    private ApplicationRunner() {
    }

    public static void startApplication (){
        MyRepository repository = new UserRepository();
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();
    }

}
