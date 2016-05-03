// Object count example
class Car{
 static int count;
 Car(){
  count++;
  System.out.println("Object count is "+count);
 }  


public static void main(String[] args){
   new Car();
   new Car();
   new Car();
   new Car();
 }
}