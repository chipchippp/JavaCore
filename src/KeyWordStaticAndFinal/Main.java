package KeyWordStaticAndFinal;

public class Main {
    public static void main(String[] args) {
        /////////////////- Tại sao phương thức main luôn được khai báo là static ?
        // Phương thức main trong Java luôn được khai báo là static vì nó được gọi bởi JVM mà không cần tạo một đối
        // tượng của lớp chứa nó. Nếu phương thức main không được khai báo là static, JVM sẽ cần tạo một đối tượng
        // của lớp chứa phương thức main trước khi có thể gọi phương thức đó. Điều này sẽ gây ra mâu thuẫn vì
        // phương thức main được gọi khi chương trình bắt đầu chạy, trước khi bất kỳ đối tượng nào được tạo.

        ///////////////////////////// - Thế nào là static ?
        //Trong Java, từ khóa static được sử dụng để tạo các thành viên (biến, phương thức, khối và lớp lồng nhau)
        // thuộc lớp, không thuộc bất kỳ đối tượng cụ thể nào của lớp đó.

        // 1.Biến static: Biến static được khởi tạo chỉ một lần, tại thời điểm tải lớp. Nó là một biến thuộc lớp,
        // không thuộc đối tượng. Do đó, tất cả các đối tượng của lớp đó chia sẻ cùng một bản sao của biến static.
        class ClassStaticVariable {
            static int staticVariable = 10;
        }

        // 2.Phương thức static: Phương thức static thuộc về lớp, không thuộc về đối tượng. Bạn có thể gọi phương thức
        // static mà không cần tạo đối tượng của lớp. Phương thức static chỉ truy cập được biến static và các thành viên static khác.
        class ClassStaticMethod {
            static void staticMethod() {
                System.out.println("This is a static method.");
            }
        }

        // 3. Khối static: Khối static được sử dụng để khởi tạo các biến static. Nó được thực thi một lần khi lớp được tải.
        class ClassStaticBlock {
            static {
                // static block
            }
        }
        // 4. Lớp static: Lớp static là một lớp chỉ áp dụng cho lớp lồng nhau. Không cần tham chiếu tới lớp bên ngoài.
        class ClassStaticClass {
            static class StaticNestedClass {
                // ...
            }
        }

        // =>> Lưu ý rằng từ khóa static không thể được áp dụng cho các lớp ở cấp độ cao nhất, chỉ có thể áp dụng
        // cho các lớp lồng nhau.

        ////////////////// Phương thức, thuộc tính khai báo bằng từ khóa static được sử dụng khi nào ?
        // Phương thức và thuộc tính khai báo bằng từ khóa static trong Java được sử dụng khi bạn muốn chúng thuộc về lớp,
        // chứ không phải một đối tượng cụ thể nào của lớp đó. Dưới đây là một số trường hợp cụ thể:

        //Biến static: Khi bạn muốn chia sẻ một giá trị chung cho tất cả các đối tượng của lớp.

        // Ví dụ, bạn có thể sử dụng biến static để đếm số lượng đối tượng của lớp:
        class Counter {
            static int count = 0;
            Counter() {
                count++;
            }
        }
        // Và sau đó, bạn có thể sử dụng biến static count để kiểm tra số lượng đối tượng đã được tạo:
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        // print
        System.out.println(Counter.count); // 3

        // Phương thức static thường được sử dụng để tạo các phương thức tiện ích hoặc các phương thức không phụ thuộc vào
        // trạng thái của đối tượng.

        //Ví dụ, bạn có thể tạo một lớp MathUtils với các phương thức static để thực hiện các phép toán toán học:
        class MathUtils {
            static int myStaticVariable = 10;
            static int add(int a, int b) {
                return a + b;
            }
            static int subtract(int a, int b) {
                return a - b;
            }
        }
        // Và sau đó, bạn có thể gọi các phương thức này mà không cần tạo một đối tượng của MathUtils:
        int sum = MathUtils.add(10, 20);
        int difference = MathUtils.subtract(20, 10);
        // print
        System.out.println(sum); // 30
        System.out.println(difference); // 10

        ///////////////// Làm thế nào để truy cập được tới phương thức, thuộc tính static
        // Để truy cập đến phương thức hoặc thuộc tính static trong Java,
        // bạn có thể truy cập trực tiếp thông qua tên lớp mà không cần tạo đối tượng.
        int getStaticVariable = MathUtils.myStaticVariable;
        //Lưu ý rằng việc truy cập đến các thành viên static thông qua một thực thể (đối tượng) của lớp thay vì
        // trực tiếp thông qua lớp là không được khuyến nghị, vì nó có thể gây nhầm lẫn.
        // int getStaticVariable = c1.myStaticVariable; // Không khuyến nghị

        ///////////////////- Thế nào là final ?
        // Từ khóa final được sử dụng để chỉ định rằng một biến, phương thức hoặc lớp không thể được thay đổi hoặc kế thừa.
        // Biến final không thể thay đổi giá trị sau khi đã khởi tạo.
        // Điều này có nghĩa là bạn có thể gán giá trị cho một biến final một lần duy nhất.
        final int myFinalVariable = 10;
        //	Phương thức final: Không thể bị ghi đè (override) trong một lớp con.
//        public final void myFinalMethod() {
//            // ...
//        }
        //	Lớp final không thể kế thừa
        final class MyFinalClass {
            // ...
        }

        //+Lưu ý rằng từ khóa final không làm cho một đối tượng trở nên không thể thay đổi. Nó chỉ ngăn chặn việc gán lại tham chiếu đến
        //đối tượng đó. Nếu đối tượng là một đối tượng có thể thay đổi (như một ArrayList, ví dụ), bạn vẫn có thể thay đổi nội dung của nó.

        /////////////// Khai báo 1 biến final khác gì với static, biến khai báo bằng final có thể chỉnh sửa được không ?
        // Nếu được cho ví dụ minh họa.

        // Biến final và static trong Java có những đặc điểm riêng:
        //Biến final: không thể thay đổi giá trị sau khi đã khởi tạo.
        // Điều này có nghĩa là bạn chỉ có thể gán giá trị cho một biến final một lần duy nhất.
        // Biến final không phải là một biến chung của lớp, mỗi đối tượng của lớp đều có một bản sao riêng của biến final.
//        final int myFinalVariable = 10;
        // myFinalVariable = 20; // Lỗi biên dịch, không thể thay đổi giá trị của biến final

        // Biến static: thuộc về lớp, không thuộc về đối tượng cụ thể
        // Tất cả các đối tượng của lớp đều chia sẻ cùng một bản sao của biến static.
        // Giá trị của biến static có thể thay đổi và thay đổi này sẽ ảnh hưởng đến tất cả các đối tượng của lớp.
//        static int myStaticVariable = 10;
        MathUtils.myStaticVariable = 20; // Được phép, giá trị mới sẽ ảnh hưởng đến tất cả các đối tượng của lớp

        // Tuy nhiên, nếu một biến là static final, nó vừa là biến chung của lớp vừa không thể thay đổi giá trị sau khi khởi tạo.
        // Biến static final thường được sử dụng để định nghĩa các hằng số.
        // static final int MY_CONSTANT = 10;
        // MY_CONSTANT = 20; // Lỗi biên dịch, không thể thay đổi giá trị của biến static final
    }
}
