 import java.util.*;

 public class javaBasics{
      public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
          System.out.println("Please Enter Your Age :");
         int age = sc.nextInt() ;
           if (age>=18){
               System.out.println("You can Drive the Vehicel");
           }
           if(age>=30){
            System.out.println("You are Adult Person");
           }
           else{
               System.out.println("You can't Drive the Vehicel");
           }
      }
 }