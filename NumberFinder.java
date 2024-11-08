package Lab5.Exercise1;

import java.util.regex.*;

public class NumberFinder {
    public static void main(String[] args) {
        String s = "You sh0u1d know th363 -4ur 2007.08%$13/07 ...42.";
        Pattern pat = Pattern.compile("-?\\d+([./]\\d+)?");
        // Положительные и отрицательные целые и дробные (натурельные и десятичные) числа.
        Matcher mat = pat.matcher(s);
        while (mat.find()) {
            System.out.println(mat.group());
        }
    }
}

