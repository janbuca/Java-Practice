import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                int num1, num2;
        System.out.println("Enter the first intger number");
        num1 = input.nextInt();
        num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println(num1 == num2);
        System.out.println((num1 != num2));
        System.out.println(num1 < num2);
        System.out.println(num1 > num2);
        System.out.println((num1 <= num2));
        System.out.println((num1 >= num2));
    }
}