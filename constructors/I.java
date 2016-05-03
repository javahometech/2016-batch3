class I{
    
   static void demo(int...i){// 0-n number of arguments
     System.out.println("var-arg");
   }

  public static void main(String[] args){
       demo(); 

       demo(10);       
       demo(10,20,30);
  }
}