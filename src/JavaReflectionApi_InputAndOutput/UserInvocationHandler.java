package JavaReflectionApi_InputAndOutput;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserInvocationHandler implements InvocationHandler {
    private Object target;

    public UserInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Chạy trước khi gọi method " + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("Chạy sau khi gọi method " + method.getName());
        return result;
    }
}
