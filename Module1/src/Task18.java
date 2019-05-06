import com.sun.source.tree.WhileLoopTree;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task18 {



        public static void main(String[] args) {
            String text = "!Текстовая строка, которая нужна, чтобы-посчитать, !количество запятых.";
            int n=0;
            Pattern pattern= Pattern.compile ("[!.,;:?\\\\-]");
            Matcher matcher= pattern.matcher(text);

            while (matcher.find()){
                n++;



        }
            System.out.println("Количество знаков препинания: "+n);
    }

}
