package Lab5.Exercise4;

import java.util.regex.*;

public class CheckIP {
    public static void main(String[] args) {
        String s = "107.0.13.255";
        Pattern pat = Pattern.compile("^(([1-9]?\\d)|(1\\d\\d)|(2[0-4]\\d)|(25[0-5]))([.])(([1-9]?\\d)|(1\\d\\d)|(2[0-4]\\d)|(25[0-5]))([.])" +
                "(([1-9]?\\d)|(1\\d\\d)|(2[0-4]\\d)|(25[0-5]))([.])(([1-9]?\\d)|(1\\d\\d)|(2[0-4]\\d)|(25[0-5]))$");
        // IP-адрес из четырёх чисел (от 0 до 255), разделённых точками.
        Matcher mat = pat.matcher(s);
        if (mat.find()) {
            System.out.println("IP-адрес введён корректно.");
        } else {
            System.out.println("Ошибка. IP-адрес введён некорректно.");
        }
    }
}

