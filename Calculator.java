// version 1.0

// import java.util.*;

// public class Calculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         String operator = sc.next();

//         if (Objects.equals(operator, "+")) {
//             System.out.println(a+b);
//         } else if (Objects.equals(operator, "-")) {
//             System.out.println(a-b);
//         } else if (Objects.equals(operator, "*")) {
//             System.out.println(a * b);
//         } else if (Objects.equals(operator, "/")) {
//             System.out.println(a/b);
//         } else if (Objects.equals(operator, "%")) {
//             System.out.println(a%b);
//         }else {
//             System.out.println("invalid operator");
//         }

//     }
// }

// Version 2.0

import java.util.*;

public class Javabasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("The addition is:" + (a + b));
                break;
            case '-':
                System.out.println("The subtraction is:" + (a - b));
                break;
            case '*':
                System.out.println("The multiplication is:" + (a * b));
                break;
            case '/':
                System.out.println("The divition is:" + (a / b));
                break;
            case '%':
                System.out.println("The modulo is:" + (a % b));
                break;
            default:
                System.out.println("Wrong Operator");
        }

    }
}
