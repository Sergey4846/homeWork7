import java.util.regex.Pattern;


public class Task19 {
    public static void main(String[] args) {
        String text = "Регулярное выражение описывается в программе с помощью строк, подходящих под определённый правилами шаблон.";
        String text1 = text.trim();

        int a = text1.split("\\s+").length;
        System.out.println("Количество пробелов в строке: " + a);

    }
}
