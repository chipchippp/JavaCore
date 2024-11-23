package PrimitiveAndObjectType;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Các kiểu dữ liệu nguyên thủy

//        -128 to 127
        byte myByte = 12;
//        -32,768 to 32,767 - Never use this really
        short myShort = 1234;
//        -2,147,483,648 to 2,147,483,647
        int myInt = 283700000;
//        -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long myLong = 12323;
//        khoảng 6 chữ số thập phân: about 6 decimal digits
        float myFloat = 6.3f;
//        about 15 decimal digits
        double myDouble = 45.213434;
//        true or false
        boolean myBoolean = false;
        boolean moreThanh = (myInt > 1000);
//        System.out.println(moreThanh);
//        one Character
        char myChar = 'w';
//      Vd:
        int num = 10;
        double pi = 3.14;
        // Casting double sang int sẽ bị làm tròn xuống. (x)
        num = (int)10.99999999999;
        pi = 3;
//        System.out.printf("Num after casting 10,99999 double to int: ");
//        System.out.println(num);
//        System.out.printf("Pi after assign 3,14 to 3 int: ");
//        System.out.println(pi);

//        Kiểu dữ liệu Object
        String str = "Hello world";
        Integer integer = Integer.valueOf(7);
        ArrayList<String> list = new ArrayList<>();
//        System.out.println(list);

//        Object type is null
        integer = null;
//        Primitive type is not null
//        myInt = null;

//        có thể chuyển đổi giữa kiểu dữ liệu nguyên thủy và kiểu dữ liệu đối tượng (o data type)
//        điều này được gọi là boxing và unboxing

        int toBoxing = 54;
//        Boxing là quá trình chuyển đổi primitive data type thành object data type tương ứng. Ví dụ
        Integer beingBoxed = Integer.valueOf(toBoxing);
//        Unboxing là quá trình chuyển đổi object data type thành primitive data type tương ứng. ví dụ:
        int unboxing = beingBoxed.intValue();

//        java cung cấp tự động boxing and unboxing, nghĩa là bạn không cần phải gọi phương thức valueOf or intValue
//        java automatically provide boxing and unboxing, it means you don't need to call the method valueOf or intValue
//       explicitly ( một cách rõ ràng ) . Example:
        Integer autoBoxing = toBoxing;
        int autoUnboxing = beingBoxed;
//        Tuy nhiên, cần lưu ý rằng việc sử dụng tự động boxing and unboxing có thể dẫn đến NullPointerException
//        However, it should be noted that using automatic boxing and unboxing can lead to NullPointerException

//        nếu đối tượng là null.
//        if the ob is null.
//        // // // // Có thể so sánh 2 kiểu dữ liệu này với nhau 0?
//        // // // // Can these two data types compared with each other?

//        Không thể so sanh trực tiếp giữa 2 kiểu dữ liệu nguyên thủy và kiểu dữ lệu đối tượng trong java.
//        it is not possible to directly compare primitive data type and ob data type in java

//        so sánh kiểu dữ liệu nguyên thủy: khi so sánh kiểu dữ liệu nguyên thủy và kiểu dữ liệu đối tượng in java.
//        comparison of primitive data type: when comparing primitive data type and ob data type in java.
//        U can use các toán tử so sánh như ==, >, <, <=, >=. Example:
//        U can use comparison operators like ==, >, <, <=, >=. Example:

        int num1 = 10;
        int num2 = 20;
        if (num1 == num2){
            System.out.println("Primitive Equal");
        } else {
            System.out.println("Primitive not equal");
        }

//        comparison of primitive data type: when comparing two object, you need to use a method .equal().
//        điều này bởi vì khi bạn sử dụng toán tử == với đối tượng
//        this is cause when you use the == operator with object
//        bạn đang so sánh xem hai tham chiếu có trỏ đến cùng một đối tượng hay không.
//        u comparing whether two references point to the same object.
        String str1 = new String("hello");
        String str2 = new String("hello");

        if (str1.equals(str2)){
            System.out.println("Object equal");
        } else {
            System.out.println("Object not equal");
        }

//        output Object equal because nội dung của hai chuỗi là giống nhau
//        because the content of the two strings is the same,
//        mặc dù chúng là two types khác nhau in bộ nhớ
//        even though they are two different object in memory

//        => u can compare between primitive data types and object data types
//        in java,  but u need phải chắc chắn rằng ob type đã đc unboxing thành kiểu dữ liệu.
//        but u need to ensure that the object type has been unboxing into the primitive type.
//        primitive tương ứng trc khi so sánh
//        corresponding primitive type before comparison
//        dưới đây là một 1 example về việc compare between primitive data type and ob data type.
//        here's an example of comparing between primitive type and object type:

        int primitiveNum = 10;
        Integer objectNum = 10;

        if (primitiveNum == objectNum){
            System.out.println("Object and Primitive Equal");
        } else {
            System.out.println("Object and Primitive Not Equal");
        }

//        Giá trị khởi tạo biến với 2 loại kiểu dữ liệu là gì?
//        What are the initialization values for variables of these two types of data?
//        Khi khởi tạo biến với 2 loại data types này in java, values mặc định sẽ khác nhau:
//        When initializing variables with these two data types in java, the default values will be different:
//        primitive type: when u initialize a primitive data type variables mà kh gán (without assignment)
//        giá trị, nó sẽ được gán một giá trị mặc định tùy thuộc vào kiểu dữ liệu:
//        values, it will be assigned a default values depending on the data types
        //byte, short, int, long: 0
        //float, double: 0.0
        //char: '\u0000' (null character)
        //boolean: false

        int primitiveInt;
        primitiveInt = 0;
        System.out.println(primitiveInt); // output = 0
//        ob data type: when u initialize a ob data type variable without assigning a value, it will be assigned the default value of null
        Integer obInt;
        obInt = null;
        System.out.println(obInt); //output = null

        // Lưu ý: Trong ví dụ trên, nếu bạn thử in ra primitiveInt hoặc objectInt mà không gán giá trị cho chúng,
        // bạn sẽ nhận được lỗi biên dịch vì Java không cho phép sử dụng biến chưa được khởi tạo.
    }
}
