package CreationalDesignPattern.BuilderPattern;

public class User {
//    Mô tả: Dùng để tạo các đối tượng phức tạp từng bước.
//Spring Boot: Thường áp dụng khi cần khởi tạo cấu hình hoặc đối tượng dữ liệu phức tạp.
    private String username;
    private String password;
    private String email;

    private User(UserBuilder builder) {
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;
    }

    public static class UserBuilder {
        private String username;
        private String password;
        private String email;

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    User user = new User.UserBuilder()
            .setUsername("john")
            .setPassword("password123")
            .setEmail("john@example.com")
            .build();
}
