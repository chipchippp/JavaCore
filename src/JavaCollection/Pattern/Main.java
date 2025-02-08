package JavaCollection.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        String regex = "[amn]";
        System.out.println(Pattern.matches(regex, "abcd")); // false (not a or m or n)
        System.out.println(Pattern.matches(regex, "a")); // true (among a or m or n)
        System.out.println(Pattern.matches(regex, "ammmna")); // false (m and a comes more than once)


    }
}
