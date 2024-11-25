package Oop;

public class Main2 {
    public static void main(String[] args) {

//        Class (Lớp):
//        Là bản thiết kế (blueprint) cho đối tượng.
//        Chứa thuộc tính và phương thức, nhưng không tiêu tốn bộ nhớ cụ thể cho dữ liệu.
//        Instance (Đối tượng):
//        Được tạo ra từ class, thực thể của class, chứa dữ liệu và thực hiện hành vi.
//        Tiêu tốn bộ nhớ để lưu trữ dữ liệu của đối tượng.

        class Car {
//            thuộc tính
            protected String color;
            private String brand;
            private String model;
//            phương thức
            public void drive(String brand){
                System.out.println("The car " + brand + "is driving");
            }
        }

        Car myCar = new Car();
//        myCar là instance của `class` `Car`
        myCar.brand = "Mercedes Benz";
        myCar.drive(myCar.brand);
        System.out.println(myCar.brand);

        class Animal{
            public void sound(){
                System.out.println("I'm an animal");
            }
        }

//        Override
//        Overriding xảy ra khi lớp con cung cấp cài đặt cụ thể cho phương thức đã định nghĩa trong lớp cha.
//                Phương thức ở lớp con phải có cùng tên, cùng kiểu trả về, và cùng danh sách tham số với phương thức ở lớp cha.
//                Overriding được sử dụng để cung cấp hành vi của phương thức từ lớp cha.

        class Dog extends Animal{
            @Override
            public void sound(){
                System.out.println("I'm a dog");
            }
        }

//        Overloading
//        Overloading xảy ra khi nhiều phương thức trong cùng một lớp có cùng tên nhưng khác số lượng hoặc kiểu tham số.
//        Mục đích: Định nghĩa nhiều cách thực hiện một hành động dựa trên tham số truyền vào
        class Cat{
            public void sound(){
                System.out.println("I'm a meow");
            }
        }
        Cat myCat = new Cat();
        myCat.sound();
        Dog myDog = new Dog();
        myDog.sound();

//          Một function có access modifier là private hoặc static có thể overriding không?
//          Không, một phương thức có access modifier là `private` hoặc `static` không thể được ghi đè (overriding) trong Java.
//
//          Vì phương thức private không thể truy cập được trong lớp con.
//          Nếu định nghĩa một phương thức static trong lớp con, đó là method hiding chứ không phải method overriding.

        class ParentClass{
            private void privateMethod(){
                System.out.println("This is a private method from ParentClass");
            }
            static void staticMethod(){
                System.out.println("This is a static method from ParentClass");
            }
        }

        class ChildClass extends ParentClass{
//            @Override
//            private void privateMethod(){
//                System.out.println("Trying to override a private method.");
//            }
//
//            @Override
//            static void staticMethod(){
//                System.out.println("Trying to override a static method.");
//            }
        }
        //Trong ví dụ trên, `privateMethod` và `staticMethod` trong `ParentClass` không thể được ghi đè trong `ChildClass`.

        //////////////////- Một phương thức final có thể kế thừa được  không ? ///////////////////////////////////////
        //Có, một phương thức `final` có thể được kế thừa trong Java. Tuy nhiên, bạn không thể ghi đè (overriding) một phương thức `final` trong lớp con.
        //
        //Khi bạn đánh dấu một phương thức là `final`, bạn đang nói với Java rằng phương thức đó không thể được thay đổi nữa,
        // nghĩa là không có lớp con nào có thể ghi đè phương thức đó.

        //Dưới đây là một ví dụ minh họa:
        class ParentClass2 {
            public final void finalMethod(){
                System.out.println("This is a final method from ParentClass2");
            }
        }

        class ChildClass2 extends ParentClass2{
//            @Override
//            public void finalMethod(){
//                System.out.println("Trying to override a final method.");
//            }
        }

        //Trong ví dụ trên, `finalMethod` trong `ParentClass` được đánh dấu là `final`, nên không thể ghi đè trong `ChildClass`.
        // Nếu bạn cố gắng ghi đè phương thức `final`, trình biên dịch Java sẽ báo lỗi.

        //////////////////- Phân biệt hai từ khóa This và Super ///////////////////////////////////////
        //Trong Java, `this` và `super` là hai từ khóa quan trọng:
        //
        //1. `this`: Từ khóa `this` được sử dụng để tham chiếu đến đối tượng hiện tại, nghĩa là nó trỏ đến instance của lớp hiện tại. `this` có thể được sử dụng để:
        //
        //   - Tham chiếu đến thuộc tính của lớp hiện tại.
        //   - Gọi phương thức của lớp hiện tại.
        //   - Gọi constructor của lớp hiện tại.
        //Ví dụ về sử dụng `this`:

        //2. `super`: Từ khóa `super` được sử dụng để tham chiếu đến đối tượng của lớp cha. `super` có thể được sử dụng để:
        //
        //   - Tham chiếu đến thuộc tính của lớp cha.
        //   - Gọi phương thức của lớp cha.
        //   - Gọi constructor của lớp cha.
        //
        //Ví dụ về sử dụng `super`:

        class ParentClassHaveSuper {
            private int x;
            public ParentClassHaveSuper(int x){}
        }

        class ChildClassHaveSuper extends ParentClassHaveSuper{
            private int y;
            public ChildClassHaveSuper(int x, int y) {
                super(x);
                this.y = y;
//                This tham chiếu đến thuộc tính 'y' của lớp hiện tại

            }
            public void printX(){
                System.out.println(super.x); // 'super' tham chiếu đến thuộc tính 'x' của lớp cha
            }

            //Trong ví dụ trên, `ChildClass` kế thừa từ `ParentClass`. Khi tạo một instance của `ChildClass`,
            // nó sử dụng từ khóa `super` để gọi constructor của `ParentClass` và thiết lập giá trị cho thuộc tính `x` của `ParentClass`.
        }
    }
}
