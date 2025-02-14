package JavaReflectionApi_InputAndOutput;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) throws Exception {
        CheckRoleUser(null);
    }

    private static void CheckRoleUser(Integer userId) {
        System.out.println("Check role user");
        UserService userService = new UserServiceImpl();
        UserInvocationHandler handler = new UserInvocationHandler(userService);
        UserService proxy = (UserService) Proxy.newProxyInstance(
                userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                handler
        );

        if (userId == null) {
            userId = 0;
            proxy.getUser(userId);
        } else {
            System.out.println(proxy.getUser(userId));
        }
        proxy.getUser(userId);
    }
}
