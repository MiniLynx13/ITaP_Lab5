package Lab5.Exercise3;

import java.util.regex.*;

public class LowUpFollow {
    public static void main(String[] args) {
        String s = "iF You th1nК яH!е 007 th@n iF Ты&*%. bcЁ";
        Pattern pat = Pattern.compile("([a-z][A-Z])|([а-яё][А-ЯЁ])|([a-z][А-ЯЁ])|([а-яё][A-Z])");
        // Сразу после строчной буквы идёт заглавная.
        Matcher mat = pat.matcher(s);
        int[] h = new int[] {0, s.length()};
        while (mat.find()) {
            for (int i = h[0]; i < h[1] - 1; i++) {
                if (String.valueOf(mat.group()).equals(String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i + 1)))) {
                    s = s.substring(0, i) + "!" + String.valueOf(mat.group()) + "!" + s.substring(i + 2);
                    h[0] = i + 4;
                    h[1] += 2;
                    break;
                }
            }
        }
        System.out.println(s);
    }
}

