import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mark;
        System.out.println("Enter the the mark of the Student");
        mark = input.nextInt();
        String x = mark >= 80?"passed!!!" : "Failed";
        System.out.println(x);

    }
}