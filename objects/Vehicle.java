class Vehicle{

  void start(){
   System.out.println("Vehicle started");
  }

  void stop(){
   System.out.println("Vehicle stopped");
  }
 
  void drive(){
   System.out.println("Vehicle moving");
  }

  public static void main(String[] args){
    Vehicle v = new Vehicle();
    v.start();
    v.drive();
    v.stop();
  }
}