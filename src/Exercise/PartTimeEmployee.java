package Exercise;

public class PartTimeEmployee extends Employee {
    private int workingHours; //  là thuộc tính chỉ số giờ làm việc trên 1 ngày của nhân viên.

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return workingHours * getPaymentPerHour();
    }
}
