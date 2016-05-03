class Calculator{

   void add(int i, int j){
     int r = i+j;
      System.out.println("Add result "+r);
   }

   void multiply(int i, int j){
     int r = i*j;
     System.out.println("Multiplication result "+r);
   }
  public static void main(String[] args){
    Calculator c = new Calculator();
    c.add(10,40);
    c.multiply(5,15);
  }
   
}