package PrimitiveAndObjectType;

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
        System.out.println(moreThanh);

//        one Character
        char myChar = 'w';
        String myString = "abc";

        int num = 10;
        double pi = 3.14;
        // Casting double sang int sẽ bị làm tròn xuống. (x)
        num = (int)10.99999999999;
        pi = 3;
        System.out.printf("Num after casting 10,99999 double to int: ");
        System.out.println(num);
        System.out.printf("Pi after assign 3,14 to 3 int: ");
        System.out.println(pi);
    }
}
