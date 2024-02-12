import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter the firest number?!");
        num1=input.nextInt();
        System.out.println("Enter the second number?");
        num2=input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sumation of additionm is \t"+sum);

        }
    }
