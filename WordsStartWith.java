package Lab5.Exercise5;

import java.util.regex.*;

public class WordsStartWith {
    public static void main(String[] args) {
        String text = "И сказал: \"Вот уж не знаю, что ты нашёл в Ней...\"\f" +
                "-Это невозможно передать словами .\n" +
                "Really a shame though. At least a bit.\f" +
                "- Никому-то я не памятен... кроме неё.";
        String letter = String.valueOf('н');
        Pattern pat = Pattern.compile("(([^A-Za-zА-ЯЁа-яё])|(^))((" + letter.toUpperCase() + "[A-Za-zА-ЯЁа-яё]*(-[A-Za-zА-ЯЁа-яё]+)*)|(" +
                letter.toLowerCase() + "[A-Za-zА-ЯЁа-яё]*(-[A-Za-zА-ЯЁа-яё]+)*))");
        // Слова, начинающееся с указанной буквы.
        Pattern patHelp = Pattern.compile("[A-Za-zА-ЯЁа-яё]+(-[A-Za-zА-ЯЁа-яё]+)*");
        Matcher mat1 = pat.matcher(text);
        Matcher mat2;
        while (mat1.find()) {
            mat2 = patHelp.matcher(mat1.group());
            if (mat2.find()) {
                System.out.println(mat2.group());
            }
        }
    }
}

