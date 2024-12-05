package KeyWordStaticAndFinal;

import MemoryAndHandleException.In;

public class Finals {
    // Biến final
    final int finalVariable = 10;

    // Biến final tham chiếu đến đối tượng
    final StringBuilder finalObject = new StringBuilder("Initial Value");

    void changeValues() {
        // Không thể thay đổi giá trị của biến finalVariable
        // finalVariable = 20; // Sẽ gây lỗi biên dịch


        // Có thể thay đổi trạng thái của đối tượng mà finalObject tham chiếu tới
        finalObject.append(" - Modified");
    }

    public static void main(String[] args) {
        Finals example = new Finals();


        // In giá trị của finalVariable
        System.out.println("Final Variable: " + example.finalVariable);


        // In giá trị của finalObject trước khi thay đổi
        System.out.println("Final Object before modification: " + example.finalObject);


        // Thay đổi trạng thái của đối tượng finalObject
        example.changeValues();


        // In giá trị của finalObject sau khi thay đổi
        System.out.println("Final Object after modification: " + example.finalObject);

//        Final Variable: 10
//Final Object before modification: Initial Value
//Final Object after modification: Initial Value - Modified

//        Biến finalVariable không thể thay đổi giá trị sau khi gán.
//finalObject tham chiếu đến đối tượng StringBuilder, có thể thay đổi trạng thái của đối tượng,
// nhưng không thể thay đổi tham chiếu đến đối tượng khác.
    }
}
