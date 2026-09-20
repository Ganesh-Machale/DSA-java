 import java.util.*;

 public class javaBasics{
      public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
         System.out.println("Enter the the Number: ");
         int Number = sc.nextInt();
         String Result = ((Number%2) == 0) ? "Even" : "ODD";
         System.out.println("Answer is :" + Result);
      }
 }