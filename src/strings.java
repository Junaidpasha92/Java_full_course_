import java.util.Locale;
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        String name =sc.nextLine();
//        System.out.println("Assalamuwalekum "+name);



       // String Methods : -


        String name = "English";


        System.out.println(name.length());

        System.out.println(name.toUpperCase());

        System.out.println(name.toLowerCase());

        System.out.println(name.trim());

        System.out.println(name.substring(2));

        System.out.println(name.substring(2,4));

        System.out.println(name.replace('E','V'));

        System.out.println(name.startsWith("Eng"));

        System.out.println(name.endsWith("sh"));

        System.out.println(name.charAt(2));

        System.out.println(name.indexOf('s'));











    }
}
