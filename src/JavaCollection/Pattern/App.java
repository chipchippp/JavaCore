package JavaCollection.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        String [] searchCondition = {"username:Loc", "gender:male", "sort:asc"};
        for (String condition : searchCondition){
            Pattern pattern = Pattern.compile("(\\w+?)(:)(.*)");
            Matcher matcher = pattern.matcher(condition);
            if (matcher.find()){
                System.out.println("Condition: " + condition);
                if (matcher.group(1).equalsIgnoreCase("sort")){
                    System.out.println("sort by " + matcher.group(3).toUpperCase());
                }
//                else {
//                    System.out.println("Field: " + matcher.group(1));
//                    System.out.println("Operator: " + matcher.group(2));
//                    System.out.println("Value: " + matcher.group(3));
//                }
            }
        }
    }
}
