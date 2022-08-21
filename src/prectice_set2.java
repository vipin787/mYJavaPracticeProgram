import java.util.Scanner;

public class prectice_set2 {

    public static void main(String[] args) {
 /*       float a= (7/4.0f)*(9/2.0f);
        System.out.println(a);
*/
 /*      String name = "VIPIN_CHAUHAN";
         name = name.toLowerCase();
        System.out.println(name); */

     /*   String name= "VIPIN CHAUHAN";

        name = name.replace(" ", "_");
        System.out.println(name); */

     /*  String name= "Dear  <!name!> Thanks a lot";
       name= name.replace("<!name!>", "Vipin_Chauhan");
        System.out.println(name);*/

  /*      Scanner sc= new Scanner(System.in);
        int n;
        int a = sc.nextInt();
        System.out.println("Goru is always right"); */

        // if else conditiional problems;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Physics Marks");
        int a = sc.nextInt();
        System.out.println("Enter Your Chemistry Marks");
        int b = sc.nextInt();
        System.out.println("Enter Your Maths Marks");
        int c = sc.nextInt();

        float avg = (a+b+c)/3.0f;

        if(avg>=40 && a>=33 && b >= 33 && c>=33) {
            System.out.println("You are Promoted");
        }
        else{
            System.out.println("You are Not Promoted");
        }
    }
}

