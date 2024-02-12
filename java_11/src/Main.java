import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       float a, b, c;
       System.out.println("Enter the three Floating Number?");
       a = input.nextFloat();
       b = input.nextFloat();
       c = input.nextFloat();
            if((a>b) && (a>c))
                System.out.println("The value of first number  is greatest!!!");
            else if ((b>a) && (b>c))
                System.out.println("The value of Second number is Greatest!!!");
            else if ((c>a) && (c>b))
                System.out.println("The value of thread  number is Greatest!!!");
            else
                System.out.println("All of the given values is Equall");
    }
}