import StudentTest.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Student s1 = new Student("no name 1", "no id 1", "not determined 1",0, "not specified 1", "not Started 1");
        Student s2 = new Student("no name 2", "no id 2", "not determined 2",0, "not specified 2", "not Started 2");
        Student s3 = new Student("no name 3", "no id 3", "not determined 3",0, "not specified 3", "not Started 3");
        Student s4 = new Student("no name 4", "no id 4", "not determined 4",0, "not specified 4", "not Started 4");
        Student s5 = new Student("no name 5", "no id 5", "not determined 5",0, "not specified 5", "not Started 5");
    System.out.printf("%5s%10S%12s%15s%15s%12s%n", "Name", "Id", "Sex", "Age", "Dept", "Year");
        displayAll(s1);
        displayAll(s2);
        displayAll(s3);
        displayAll(s4);
        displayAll(s5);
        String name, id, sex, dept, yr;
        int age;
        int c;
        System.out.println("\n\n1. Add Student Information");
        System.out.println("n2. Show Student Information\n\n");
        System.out.println("Enter you choice, please or -1 to Exit");
        String a1 = input.nextLine();
        c = Integer.parseInt(a1);
        // c = in.nextInt();

        while (c!=-1){
            switch (c){
                case 1:
                    System.out.println("\n\nwe are about to Enter a new data!\n\n");
                    System.out.println("Enter your name, please!");
                    name = input.nextLine();
                    System.out.println("Enter your Id, please!!!");
                    id = input.nextLine();
                    System.out.println("Enter your sex please!!!");
                    sex = input.nextLine();
                    System.out.println("Enter your Age, Please!!!");
                    String a = input.nextLine();
                    age = Integer.parseInt(a);
                    // age = in.nextInt();
                    System.out.println("Enter your Department, plasea");
                    dept = input.nextLine();
                    System.out.println("Enter your year, please!!!");
                    yr = input.nextLine();
                    addstudent(name, id, sex, age, dept, yr, s1);
                    break;
                case 2:
                    System.out.printf("%5s%10S%12s%15s%15s%12s%n", "Name", "Id", "Sex", "Age", "Dept", "Year");
                    displayAll(s1);
                default:
                    System.out.println("Wrong choices ");
                    break;
            }
            System.out.println("\n\n1. Add Student Information");
            System.out.println("n2. Show Student Information\n\n");
            System.out.println("Enter you choice, please or -1 to Exit");
            c = input.nextInt();
        }
    }
    public static void addstudent(String n, String id, String sex, int age, String dept, String yr. Student s){
        s.setName(n);
        s.setId(id);
        s.setSex(sex);
        s.setAge(age);
        s.setDept(dept);
        s.setYear(yr);
    }
    public static void displayAll(Student s){
        System.out.printf("%5s%10S%12s%15s%15s%12s%n", s.getName(), s.getId(), s.getSex(),s.getAge(), s.getDept(), s.getYear());
    }
}