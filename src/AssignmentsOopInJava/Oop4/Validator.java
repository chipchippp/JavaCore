package AssignmentsOopInJava.Oop4;

public class Validator {
    public static boolean isValidPhoneNumber(String phone) {
        return phone.matches("^\\d{10}$");
    }

    public static boolean isValidEmail(String email) {
        return email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
    }

    public static boolean isNotNullOrEmpty(String str) {
        return str != null && !str.isEmpty();
    }
    // giải thích :
    // ^ : bắt đầu chuỗi
    // $ : kết thúc chuỗi
    // \\d : số
    // {10} : 10 ký tự
    // ^\\d{10}$ : chuỗi có 10 số

    // ^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$ : chuỗi có dạng email
    // ^ : bắt đầu chuỗi
    // $ : kết thúc chuỗi
    // [a-zA-Z0-9+_.-] : ký tự từ a-z, A-Z, 0-9, +, _, ., -
    // + : 1 hoặc nhiều ký tự
    // @ : ký tự @
    // [a-zA-Z0-9.-] : ký tự từ a-z, A-Z, 0-9, .
    // + : 1 hoặc nhiều ký tự
    // $ : kết thúc chuỗi

    // str != null : chuỗi khác null
    // !str.isEmpty() : chuỗi không rỗng
}
