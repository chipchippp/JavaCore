package JavaReflectionApi_InputAndOutput;

public class UserServiceImpl implements UserService {
    @Override
    public User getUser(int id) {
        System.out.println("--------getUser---------id = " + id);
        return new User(id, "Nguyen Van A" + id);
    }
}
