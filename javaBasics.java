 import java.util.*;

 public class javaBasics{
      public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
         System.out.println("Enter the the Number between 1 to 4 : ");
         int Number = sc.nextInt();
         switch(Number){
             case 1 : System.out.println("I am Coming ");
             break;
             case 2 : System.out.println("Geeting package of 60 Lpa at Google");
               break;
             case 3 : System.out.println("Meeting with Hitesh Sir");
             break;
             case 4 : System.out.println("Going to office ");
             break;
             default : System.out.println("Going Home");
         }
      }
 }