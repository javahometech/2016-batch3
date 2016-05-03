class J{
    
   static void add(int...i){
     int add = 0;
     for(int x : i){
      add = add+x;
     }
     System.out.println("Result "+add);
   }

  public static void main(String[] args){
       add(); 

       add(10);       
       add(10,20,30);
  }
}