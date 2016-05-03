class Person{
   String n;
   int a;
   Person(String name, int age){
      n = name;
      a = age;
   }
   Person(){
	 	   
   }
   Person(String name){
	 n = name; 	   
   }

 public static void main(String[] args){
   Person p1 = new Person("Prasad",29);  
   Person p2 = new Person("Swapna");
   Person p3 = new Person();

   System.out.println(p1.n); 
   System.out.println(p2.n);
   System.out.println(p1.a);
   System.out.println(p2.a);

 }

}