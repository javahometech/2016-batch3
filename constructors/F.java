class F{
  
  static void x(){
   System.out.println("A");
  }
  public static void main(String[] args){
    x();
    F.x();
    F f = new F();
    f.x();
  }

}