class K{
   // compile time erro, var-args must be last argument 
   static void add(int...i, String j){
    
   }

  public static void main(String[] args){
       add(); 

       add(10);       
       add(10,20,30);
  }
}