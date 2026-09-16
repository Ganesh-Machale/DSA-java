 import java.util.*;

 public class javaBasics{
      public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter the value radius : ");
         float rad = sc.nextFloat();
        float area =  3.14f*rad*rad;
        System.out.println("Area of a circle is : " + area);

      }
 }