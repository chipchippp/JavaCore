package JavaCollection.Array;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        String[][] subjects = {
                {"Toán", "Cô Lan"}, {"Lý", "Thầy Hùng"}, {"Hóa", "Cô Hoa"},
                {"Văn", "Cô An"}, {"Anh", "Thầy Minh"}, {"Sinh", "Thầy Quang"},
                {"Sử", "Cô Linh"}, {"Địa", "Thầy Nam"}, {"GDCD", "Cô Hạnh"}
        };

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int day = 2; day <= 7; day++) { // Thứ 2 đến thứ 7
            for (int period = 1; period <= 5; period++) { // 5 tiết mỗi ngày
                int index = (day + period) % subjects.length; // Lấy môn học và giáo viên ngẫu nhiên
                Lesson lesson = new Lesson(day, period, subjects[index][0], subjects[index][1]);

                // Chạy mỗi tiết học trên một luồng riêng biệt
                executor.execute(lesson::display);
            }
        }

        executor.shutdown(); // Đóng ExecutorService sau khi hoàn thành
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thời khóa biểu đã được tạo xong.");

    }
}
