package Exercise;

public abstract class Employee implements IEmployee {
    private String name;
    private int paymentPerHour; // lần lượt là các thuộc tính chỉ tên và số tiền mà nhân viên nhận được trên 1 giờ làm việc.

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
}
