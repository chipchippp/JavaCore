package JavaCollection.Array;

public class Lesson {
    private int day; // Thứ mấy
    private int period; // Tiết thứ mấy
    private String subject; // Môn học
    private String teacher; // Giáo viên

    public Lesson(int day, int period, String subject, String teacher) {
        this.day = day;
        this.period = period;
        this.subject = subject;
        this.teacher = teacher;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void display() {
        System.out.println("Thứ " + day + " - Tiết " + period + ": " + subject + " - Giáo viên: " + teacher);
    }
}
