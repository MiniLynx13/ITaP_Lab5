package Lab5.Exercise2;

import java.util.regex.*;

public class PasswordChack {
    public static void main(String[] args) {
        String s = "What0f1tYouWant7";
        Pattern pat = Pattern.compile("^[A-Za-z0-9]{8,16}$");
        // Пароль от 8 до 16 символов из латинских букв и цифр.
        Matcher mat = pat.matcher(s);
        if (mat.find()) {
            pat = Pattern.compile("(?=[A-Z][A-Za-z0-9]*[0-9])|(?=[0-9][A-Za-z0-9]*[A-Z])");
            // Пароль, содержащий минимум одну заглавную букву и одну цифру.
            mat = pat.matcher(s);
            if (mat.find()) {
                System.out.println("Пароль введён корректно.");
            } else {
                System.out.println("Ошибка. Пароль введён некорректно.");
            }
        } else {
            System.out.println("Ошибка. Пароль введён некорректно.");
        }
    }
}

