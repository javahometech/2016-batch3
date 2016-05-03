class B{

public static void main(String[] args){
   int[] data = new int[50];   
// Storing data from 1 to 50
   for(int i=0; i<data.length; i++){
       data[i] = i+1;
   }
//  Displaying data in Array
   for(int j =0; j<data.length; j++){
      System.out.println(data[j]);
   }            
}

}