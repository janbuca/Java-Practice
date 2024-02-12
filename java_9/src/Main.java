import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while(i<10);
        System.out.println("This is the false" +i);

        int n=0, sum =0;
        do {
            sum += n;
            n ++;
        }while(n<5);
        System.out.println(sum);
        System.out.println("This is the false values \t" +n);
    }
}