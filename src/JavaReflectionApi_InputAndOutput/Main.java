package JavaReflectionApi_InputAndOutput;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Class<?> userClass = User.class;
        Object obj = userClass.getDeclaredConstructor().newInstance();

        Method method = userClass.getDeclaredMethod("printUser");
//        method.setAccessible(true);
//        method.invoke(obj);
//
//        Field fieldId = userClass.getDeclaredField("id");
//        fieldId.setAccessible(true);
//        fieldId.set(obj, 1);
//
//        Field field = userClass.getDeclaredField("name");
//        field.setAccessible(true);
//        field.set(obj, "Nguyen Van A");
//
//        method.invoke(obj);
//        System.out.println(obj);

        if (method.isAnnotationPresent(SampleAnnotation.class)) {
            SampleAnnotation sampleAnnotation = method.getAnnotation(SampleAnnotation.class);
            System.out.println(sampleAnnotation.value());
        }
    }
}
