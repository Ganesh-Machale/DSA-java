 import java.util.*;

 public class javaBasics{
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the Break line Number Between 1-25");
          int n = sc.nextInt();
          int Counter = 1 ;
          for(int i=1; i<=25;i++){
            if(i == n){
               break;
            }
            System.out.println(i);
          }
      }
 }