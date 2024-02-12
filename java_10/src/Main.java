import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i=0; i<2; i++){
            for (int j = 0; j<3; j++)
                System.out.print(" " +i + " ");
                System.out.println();
        }

        int n =0;
        int x;
        while (n<2){
            x=0;
            while (x<5){
                System.out.print(x);
                x++;
            }
            System.out.println();
            n++;
        }

    }
}