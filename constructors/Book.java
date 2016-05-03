class Book{
  String name;
  double cost;
  
   void setName(String name){
      this.name = name;
   }  

  Book(String name, double cost){
    this.name = name;
    this.cost = cost;
  }

  public static void main(String[] args){
    Book b1 = new Book("Java",550);
    Book b2 = new Book("Scala",750);

    System.out.println("Name->"+b1.name+" Cost->"+b1.cost);
    System.out.println("Name->"+b2.name+" Cost->"+b2.cost);
  }

}