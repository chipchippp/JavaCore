package Exercise;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        // nhân viên full time luôn làm việc 8 tiếng một ngày nên lớp FullTimeEmployee không có thuộc tính workingHours
        return getPaymentPerHour() * 8;
    }
}
