import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner input =new Scanner(System.in);
            int mark;
            System.out.println("Enter the Student's Mark");
            mark = input.nextInt();;
            if(mark>=90){
                System.out.println("A+");
            }else if (mark>=85){
                System.out.println("A");
            }else if (mark>=80){
                System.out.println("A-");
            }else if (mark>=75){
                System.out.println("B+");
            }else if (mark>=70){
                System.out.println("B");
            }else if (mark>=65){
                System.out.println("B-");
            }else if (mark>=60){
                System.out.println("C+");
            }else if (mark>=50){
                System.out.println("C");
            }else{
                System.out.println("Fall");
            }

        }
    }