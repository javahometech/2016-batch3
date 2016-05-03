class D{
  D(){
    System.out.println("B");
  }

  D(int i){
    System.out.println("C");
    this();// call to current class default constructor
    System.out.println("A");
  }

public static void main(String[] args){
   D d1 = new D(10);
 }
}