import java.util.*;

class D{

public static void main(String[] args){
 Scanner s = new Scanner(System.in);
 System.out.println("Enter Marks");
 int marks = s.nextInt();
 
  if(marks>=60){
   System.out.println("First Class");
  }else if(marks>=50){
   System.out.println("Second Class");
  }else if(marks>=35){
   System.out.println("Third Class");
  }else{
   System.out.println("Failed!");
  }

}

}