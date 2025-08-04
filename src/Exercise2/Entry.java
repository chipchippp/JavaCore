package Exercise2;

public class Entry {
    public static void main(String[] args) {
//        System.out.println(Math.PI);
//        System.out.println(Math.abs(-2));
//        System.out.println(Math.add(2, 3));
//        System.out.println(Math.subtract(2, 3));
//        System.out.println(Math.min(2, 3));
//        System.out.println(Math.max(2, 3));
//        System.out.println(Math.pow(2, 3));

        int[] arr1 = new int[]{3, 4, 2};
        double[] arr2 = new double[]{1.3, 4.2, 6.7};
        System.out.println(ArrayCalculator.sumOfArray(arr1));
        System.out.println(ArrayCalculator.sumOfArray(arr2));
        System.out.println(ArrayCalculator.maxOfArray(arr1));
        System.out.println(ArrayCalculator.maxOfArray(arr2));
        System.out.println(ArrayCalculator.minOfArray(arr1));
        System.out.println(ArrayCalculator.minOfArray(arr2));


        Customer customer = new Customer();
        customer.display(); // Hiển thị thông tin khách hàng mặc định
        Customer customer1 = new Customer("Nguyen Van A");
        customer1.display(); // Hiển thị thông tin khách hàng với tên
        Customer customer2 = new Customer('m');
        customer2.display(); // Hiển thị thông tin khách hàng với giới tính
        Customer customer3 = new Customer("Nguyen Van B", 'f');
        customer3.display(); // Hiển thị thông tin khách hàng với tên và giới tính
        Customer customer4 = new Customer("Nguyen Van C", 'f');
        customer4.display(); // Hiển thị thông tin khách hàng với tên và giới tính

    }
}
