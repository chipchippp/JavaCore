package CreationalDesignPattern.PrototypePattern;

//@Component
//@Scope("prototype")
public class MyPrototypeBean {
//    Mô tả: Tạo ra một instance mới mỗi khi được yêu cầu.
//Spring Boot: Dùng @Scope("prototype").

    // Logic của bean
    public void logic() {
        System.out.println("Đây là logic của bean");
    }

//    -> Mỗi lần gọi, Spring sẽ tạo một instance mới của MyPrototypeBean.
}
