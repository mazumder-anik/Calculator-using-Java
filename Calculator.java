import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String operator = sc.next();

        if (Objects.equals(operator, "+")) {
            System.out.println(a+b);
        } else if (Objects.equals(operator, "-")) {
            System.out.println(a-b);
        } else if (Objects.equals(operator, "*")) {
            System.out.println(a * b);
        } else if (Objects.equals(operator, "/")) {
            System.out.println(a/b);
        } else if (Objects.equals(operator, "%")) {
            System.out.println(a%b);
        }else {
            System.out.println("invalid operator");
        }

    }
}
