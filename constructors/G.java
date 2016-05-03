class G{

  public static void main(String[] args){
    int[] data = {1,9,8,5,6,4};
    // Regular for loop
    for(int i=0; i<data.length; i++){
      System.out.println(data[i]);
    }

    // Enhanced Forloop OR Foreach loop
    for(int x:data){
      System.out.println(x);    
    }
  }

}