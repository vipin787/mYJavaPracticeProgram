import java.sql.SQLOutput;
import java.util.Scanner;
public class practicce4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter Your Name");
        int age = sc.nextInt();
        System.out.println("Enter Your age");
        int marks = sc.nextInt();
        System.out.println("Enter your marks");

        if (age>=17 && age<=21)
        {
            if(marks>=80) {
                System.out.println(name + " Is Eligible");
            }
            else {
                System.out.println(name + "Is Not Eligible");
            }
        }
         else {
            System.out.println(name+ "Is Not Eligible");
        }
    }
}
