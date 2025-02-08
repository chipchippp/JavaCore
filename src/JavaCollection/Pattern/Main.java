package JavaCollection.Pattern;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        c1
//        Pattern pattern = Pattern.compile("Ta.");
//        Matcher matcher = pattern.matcher("Tao");
//        System.out.println(matcher.matches());
////        giai thich: pattern la mot doi tuong Pattern, duoc tao ra tu phuong thuc compile cua lop Pattern.
////        Pattern.compile("Ta.") tao ra mot pattern kiem tra xem co chuoi nao bat dau bang "Ta" va tiep theo la mot ky tu bat ky hay khong.
////        matcher la mot doi tuong Matcher, duoc tao ra tu phuong thuc matcher cua doi tuong pattern.
//
////        c2
//        boolean result = Pattern.compile("Ta.").matcher("Tao").matches();
//        System.out.println(result);
//
////        c3
//        boolean matches = Pattern.matches("Ta.", "Tao");
//        System.out.println(matches);

//        Pattern pattern = Pattern.compile("[a-zA-Z1-9]");
//        Matcher matcher = pattern.matcher("a");
//        System.out.println(matcher.matches());

//        String regex = "[amn]";
//        System.out.println(Pattern.matches(regex, "abcd")); // false (not a or m or n)
//        System.out.println(Pattern.matches(regex, "a")); // true (among a or m or n)
//        System.out.println(Pattern.matches(regex, "ammmna")); // false (m and a comes more than once)

//        String i = "2";
//        String f = "2.2";
//        String d = "2.3";
//        String b = "5.5";
//
//        int x = Integer.parseInt(i);
//        System.out.println(x);
//
//        float y = Float.parseFloat(f);
//        System.out.println(y);
//
//        double z = Double.parseDouble(d);
//        System.out.println(z);
//
//        BigDecimal bigDecimal = new BigDecimal(b);
//        System.out.println(bigDecimal);

//        Date currentDate = new Date();
//        System.out.println("Current Date: " + currentDate);
//
//        String dateToStr = DateFormat.getInstance().format(currentDate);
//        System.out.println("DateFormat.getInstance(): " + dateToStr);
//
//        dateToStr = DateFormat.getDateInstance().format(currentDate);
//        System.out.println("DateFormat.getDateInstance(): " + dateToStr);
//
//        dateToStr = DateFormat.getTimeInstance().format(currentDate);
//        System.out.println("DateFormat.getTimeInstance(): " + dateToStr);
//
//        dateToStr = DateFormat.getDateTimeInstance().format(currentDate);
//        System.out.println("DateFormat.getDateTimeInstance(): " + dateToStr);
//
//        dateToStr = DateFormat.getTimeInstance(DateFormat.SHORT).format(currentDate);
//        System.out.println("DateFormat.getTimeInstance(DateFormat.SHORT): " + dateToStr);
//
//        dateToStr = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);
//        System.out.println("DateFormat.getTimeInstance(DateFormat.MEDIUM): " + dateToStr);
//
//        dateToStr = DateFormat.getTimeInstance(DateFormat.LONG).format(currentDate);
//        System.out.println("DateFormat.getTimeInstance(DateFormat.LONG): " + dateToStr);
//
//        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(currentDate);
//        System.out.println("DateFormat.getTimeInstance(DateFormat.LONG): " + dateToStr);

        Date date = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println("MM/dd/yyyy = " + strDate);

        formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("dd-M-yyyy hh:mm:ss = " + strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy");
        strDate = formatter.format(date);
        System.out.println("dd MMMM yyyy = " + strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
        strDate = formatter.format(date);
        System.out.println("dd MMMM yyyy zzzz = " + strDate);

        formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        strDate = formatter.format(date);
        System.out.println("E, dd MMM yyyy HH:mm:ss z = " + strDate);

        // Định dạng ngày tháng theo hai kiểu khác nhau
        String YYYY_MM_DD = "yyyy-MM-dd";
        String DD_MM_YYYY = "dd/MM/yyyy";

        // Chuyển đổi LocalDate thành chuỗi
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern(YYYY_MM_DD);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(DD_MM_YYYY);

        LocalDate localDate = LocalDate.now();

        String dateFormatted1 = localDate.format(formatter1);
        System.out.println("Formatted Date (yyyy-MM-dd): " + dateFormatted1);

        String dateFormatted2 = localDate.format(formatter2);
        System.out.println("Formatted Date (dd/MM/yyyy): " + dateFormatted2);
    }
}
