package CreationalDesignPattern.SingletonPattern;

//@Service
public class MySingletonService {
//    Mô tả: Đảm bảo một class chỉ có một instance duy nhất.
//Spring Boot: Mặc định các bean trong Spring là singleton.

    // Logic của service
    public void logic() {
        System.out.println("Đây là logic của service");
    }

    //    @Bean
    //    public MySingletonService mySingletonService() {
    //        return new MySingletonService();
    //    }

//    -> MySingletonService chỉ có một instance trong toàn bộ ứng dụng.
}
