import java.util.*;
class B{
 public static void main(String[] args){

      Scanner s = new Scanner(System.in); 
     
      System.out.println("Enter value one");

      int i = s.nextInt();

      System.out.println("Enter value two");
      int j = s.nextInt();

       if(i>j){
         System.out.println("Max values "+i);        
       }else{
         System.out.println("Max values "+j);  
       }    
 }
}