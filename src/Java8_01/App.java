package Java8_01;

import Java8_01.model.Order;
import Java8_01.service.MocUp;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
//        cũ
//        List<Order> orders = MocUp.orderList();
//        orders.forEach(System.out::println);

//        mới với stream API
//        MocUp.orderList()
//                .stream()
//                .filter(order -> order.getProductName().equals("Laptop"))
//                .forEach(System.out::println);

//        List<String> vendor = MocUp.orderList()
//                .stream()
//                .map(Order::getVendor)
//                .collect(Collectors.toList());
//        allMatch();
//        anyMatch();
//        noneMatch();
//        streamBuilder();
//        collect();
//        streamConcat();
//        distinct();
//        findAny();
//        findFirst();
//        flatMap();
//        generate();
//        common();
//        sort();
//        skip();
//        peek();
    }

    private static void allMatch() {
        List<Order> orders = MocUp.orderList()
                .stream()
                .filter(order -> Objects.equals(order.getProductName(), "Laptoppa"))
                .collect(Collectors.toList());
        System.out.println("Check all orders are Electronics: ");
        boolean isMobile = orders.stream().allMatch(order -> Objects.equals(order.getProductName(), "Laptopap"));
        if (isMobile) {
            System.out.println("All orders are Electronics");
        }
    }

    private static void anyMatch() {
        boolean flag = MocUp.orderList()
                .stream()
                .anyMatch(order -> Objects.equals(order.getProductName(), "Mobile"));
        System.out.println(flag);
    }

    private static void noneMatch() {
        boolean check = MocUp.orderList()
                .stream()
                .filter(order -> order.getVendor().equals("Samsung"))
                .noneMatch(order -> order.getPrice() > 150000.00);
        System.out.println(check);
    }

    private static void streamBuilder() {
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> stream = builder.add("One").add("Two").add("Three").build();
        stream.forEach(System.out::println);
    }

    private static void collect() {
        System.out.println("Collect to List: All Samsung products");
        List<Order> samsungProducts = MocUp.orderList()
                .stream()
                .filter(order -> order.getVendor().equals("Samsung"))
                .toList();
        System.out.println(samsungProducts);

        System.out.println("Collect to Set: All Vendor");
        Set<String> vendors = MocUp.orderList()
                .stream()
                .map(Order::getVendor)
                .collect(Collectors.toSet());
        System.out.println(vendors);
    }

    private static void distinct() {
        List<String> productType = MocUp.orderList()
                .stream()
                .map(Order::getProductType)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(productType);
    }

    private static void findAny() {
        Optional<String> product = MocUp.orderList()
                .stream()
                .map(Order::getProductName)
                .distinct()
                .findAny();
        product.ifPresentOrElse(System.out::println, () -> System.out.println("No product found"));
    }

    private static void findFirst() {
        List<String> productType = MocUp.orderList()
                .stream()
                .map(Order::getProductType)
                .distinct()
                .collect(Collectors.toList());
        Optional<String> check = productType.stream().findFirst();
        check.ifPresentOrElse(System.out::println, () -> System.out.println("No product found"));
    }

    private static void flatMap() {
        List<Order> orders = MocUp.orderList();
        List<String> productName = orders.stream()
                .flatMap(order -> Stream.of(order.getProductName()))
                .collect(Collectors.toList());
        List<String> productType = orders.stream()
                .flatMap(order -> Stream.of(order.getProductName()))
                .collect(Collectors.toList());
        List<List<String>> product = new ArrayList<>();
        product.add(productName);
        product.add(productType);

        System.out.println("Distinct all product type: ");
        product.stream()
                .flatMap(list -> list.stream().distinct())
                .forEach(System.out::println);
        System.out.println("\n Total price ");
        double totalPrice = MocUp.orderList()
                .stream()
                .map(Order::getPrice)
                .flatMapToDouble(DoubleStream::of)
                .sum();
        System.out.println(totalPrice);
        System.out.println("Print first character ");
        productName.stream().flatMap(s -> Stream.of(s.toUpperCase().charAt(0))).forEach(System.out::println);
    }

    private static void generate() {
        Stream.generate(new
                Random()::nextInt).limit(10).forEach(System.out::println);
        Stream.generate(new
                Random()::nextDouble).limit(3).forEach(System.out::println);
    }

    private static void common() {
        List<Order> personList = MocUp.orderList();
        double totalSalary = personList.stream()
                .mapToDouble(Order::getPrice)
                .sum();
        System.out.println("Sum by Lambda: " + totalSalary);
        Double totalSalary2 = personList.stream()
                .map(Order::getPrice)
                .reduce(0.0, Double::sum);
        System.out.println("Sum by Method Reference: " + totalSalary2);
        Double totalSalary3 = personList.stream()
                .map(Order::getPrice)
                .reduce(0.0, (sum, salary) -> sum + salary);
        System.out.println("Sum by reduce, Lambda: " + totalSalary3);

        Double totalSalary4 = personList.stream()
                .collect(Collectors.summingDouble(Order::getPrice));
        System.out.println("Sum by Collectors.summingDouble: " + totalSalary4);

        System.out.println("\n-- Max salary: ");
        System.out.println(personList.stream()
                .mapToDouble(Order::getPrice)
                .max()
                .getAsDouble());
        System.out.println("\n-- Min salary: ");
        System.out.println(personList.stream()
                .mapToDouble(Order::getPrice)
                .min()
                .getAsDouble());
        System.out.println("\n-- Average salary: ");
        System.out.println(personList.stream()
                .mapToDouble(Order::getPrice)
                .average()
                .getAsDouble());
    }

    private static void sort() {
        MocUp.orderList()
                .stream()
                .sorted(Comparator.comparing(Order::getPrice))
                .forEach(System.out::println);
    }

    private static void skip() {
        MocUp.orderList()
                .stream()
                .skip(2)
                .forEach(System.out::println);
    }

    private static void peek() {
        MocUp.orderList()
                .stream()
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

}
