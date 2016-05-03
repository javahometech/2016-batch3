class Circle{
   final static double PI = 3.14;

   int radius;

   void area(){

    double area = PI*radius*radius;
    System.out.println("Area is "+area);
    
   }
public static void main(String[] args){
   Circle c1 = new Circle();
   c1.radius = 6;
   c1.area();

   Circle c2 = new Circle();
   c2.radius = 10;
   c2.area();

}

}