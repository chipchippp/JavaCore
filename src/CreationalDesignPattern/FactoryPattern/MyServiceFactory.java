//package CreationalDesignPattern.FactoryPattern;
//
//public class MyServiceFactory implements FactoryBean<MyService> {
//
//Mô tả: Tách biệt việc tạo đối tượng với việc sử dụng đối tượng.
//Spring Boot: Sử dụng FactoryBean.
//
//    @Override
//    public MyService getObject() {
//        return new MyService();
//    }
//    @Override
//    public Class<?> getObjectType() {
//        return MyService.class;
//    }
//
//    -> Định nghĩa bean trong cấu hình Spring:
// <bean id="myService" class="com.example.MyServiceFactory"/>
//}
