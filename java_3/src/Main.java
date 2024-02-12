import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Addition Ended");
        addition();
        System.out.println("Subtraction Ended");
        subtraction();
        System.out.println("Multiplication Ended");
        multiplication();
        System.out.println("Division Ended");
        Division();
        System.out.println("Remainder Ended");
        remainder();

        }
        public static void addition(){
            Scanner input = new Scanner(System.in);
            int num1, num2, sum;
            System.out.println("Enter the firest number?");
            num1 = input.nextInt();
            System.out.println("enter the second number?");
            num2 = input.nextInt();
            sum = num1 + num2;
            System.out.println("The Addition of two Number is "+ sum);
        }
        public static void subtraction() {
            Scanner input = new Scanner(System.in);
            int num1, num2, sub;
            System.out.println("Enter the firest number?");
            num1 = input.nextInt();
            System.out.println("enter the second number?");
            num2 = input.nextInt();
            sub = num1 - num2;
            System.out.println("The subtraction of two Number is " + sub);
        }
        public static void  multiplication(){
            Scanner input = new Scanner(System.in);
            int num1, num2, pro;
            System.out.println("Enter the firest number?");
            num1 = input.nextInt();
            System.out.println("enter the second number?");
            num2 = input.nextInt();
            pro = num1 * num2;
            System.out.println("The Production of two Number is " + pro);
        }
        public static void  Division(){
            Scanner input = new Scanner(System.in);
            int num1, num2, div;
            System.out.println("Enter the firest number?");
            num1 = input.nextInt();
            System.out.println("enter the second number?");
            num2 = input.nextInt();
            div = num1 / num2;
            System.out.println("The Division of two Number is " + div);
        }
        public static void remainder(){
            Scanner input = new Scanner(System.in);
            int num1, num2, mod;
            System.out.println("Enter the firest number?");
            num1 = input.nextInt();
            System.out.println("enter the second number?");
            num2 = input.nextInt();
            mod = num1 % num2;
            System.out.println("The Modulo of two Number is " + mod);
        }
        }


