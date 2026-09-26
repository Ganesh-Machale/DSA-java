 import java.util.*;

 public class javaBasics{
      public static void main(String[] args) {
         int n =10899;
         int Rev = 0;

         while(n>0) {
          int lastdigit = n%10; 
           Rev = (Rev*10)+lastdigit;
           n = n/10; 
         } 
         System.out.println(Rev);
      }

 }