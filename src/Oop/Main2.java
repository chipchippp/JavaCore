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

//        class Animal{
//            public void sound(){
//                System.out.println("I'm an animal");
//            }
//        }
////        Override
//        class Dog extends Animal{
//            @Override
//            public void sound(){
//                System.out.println("I'm a dog");
//            }
//        }
//        Overloading
        class MathOperations {
            int add(int a, int b) {
                return a + b;
            }
            double add(double a, double b) {
                return a + b;
            }
            int add(int a, int b, int c) {
                return a + b + c;
            }
        }


//          Một function có access modifier là private hoặc static có thể overriding không
//          Một phương thức final có thể kế thừa được  không ? ///////////////////////////////////////
        class ParentClass{
            private void privateMethod(){
                System.out.println("This is a private method from ParentClass");
            }
            static void staticMethod(){
                System.out.println("This is a static method from ParentClass");
            }
            final void finalMethod(){
                System.out.println("This is a final method from ParentClass");
            }
        }
        class ChildClass extends ParentClass{
//            @Override
//            private void privateMethod(){
//                System.out.println("Trying to override a private method.");
//            }
//            @Override
//            static void staticMethod(){
//                System.out.println("Trying to override a static method.");
//            }
//            @Override
//            public void finalMethod(){
//                System.out.println("Trying to override a final method.");
//            }
        }// `privateMethod` và `staticMethod` trong `ParentClass` không thể được ghi đè trong `ChildClass`.
        ChildClass child = new ChildClass();
        child.finalMethod(); // Gọi phương thức finalMethod() được kế thừa từ ParentClass


        //Trong ví dụ trên, `finalMethod` trong `ParentClass` được đánh dấu là `final`, nên không thể ghi đè trong `ChildClass`.
        // Nếu bạn cố gắng ghi đè phương thức `final`, trình biên dịch Java sẽ báo lỗi.

        //////////////////- Phân biệt hai từ khóa This và Super ///////////////////////////////////////
        //Trong Java, `this` và `super` là hai từ khóa quan trọng:
        //
        //1. `this`: Từ khóa `this` được sử dụng để tham chiếu đến đối tượng hiện tại, nghĩa là nó trỏ đến instance của lớp hiện tại. `this` có thể được sử dụng để:
        //   - Tham chiếu đến thuộc tính của lớp hiện tại.
        //   - Gọi phương thức của lớp hiện tại.
        //   - Gọi constructor của lớp hiện tại.

        //2. `super`: Từ khóa `super` được sử dụng để tham chiếu đến đối tượng của lớp cha. `super` có thể được sử dụng để:
        //   - Tham chiếu đến thuộc tính của lớp cha.
        //   - Gọi phương thức của lớp cha.
        //   - Gọi constructor của lớp cha.

        //Ví dụ về sử dụng `this`:
        //Ví dụ về sử dụng `super`:
        class Animal {
            private String name;
            public Animal(String name) {
                this.name = name; // 'this.name' tham chiếu đến biến instance 'name'
            }// Constructor của Animal sử dụng 'this' để tham chiếu đến biến instance
            void makeSound() {
                System.out.println(this.name + " makes a generic animal sound.");
            } // Phương thức makeSound sử dụng 'this.name' để truy cập biến instance
        }
        class Dog extends Animal {
            private String breed;
            public Dog(String name, String breed) {
                super(name); // Gọi constructor của Animal
                this.breed = breed;}
            @Override
            public void makeSound() {
                super.makeSound(); // Gọi phương thức makeSound() của lớp cha Animal
                System.out.println("Woof woof!");
            }// Phương thức makeSound của Dog ghi đè phương thức của lớp cha
            public void introduce() {
                System.out.println("This dog's breed is: " + this.breed); // 'this' truy cập thuộc tính breed của Dog
                super.makeSound();}// Phương thức giới thiệu về Dog, sử dụng cả 'this' và 'super'
        }Dog myDog = new Dog("Buddy", "Golden Retriever");
        myDog.introduce(); // Gọi phương thức introduce() để thấy sự khác biệt giữa 'this' và 'super'
        myDog.makeSound();




    }
}
