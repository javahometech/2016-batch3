// Example of this keyword
class Animal{
   String name;
   void showName(){
     System.out.println(name);
   }

  public static void main(String[] args){
    Animal a1 = new Animal();
    a1.name = "Dog";
    Animal a2 = new Animal();
    a2.name = "Cat";
    
    a2.showName();// current object is a2
    a1.showName();// current object is a1
    
  }
 
}