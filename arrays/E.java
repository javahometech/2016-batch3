class E{
    public static void main(String[] args){
      int[] data = {1,7,9,5,7,3,4,7};
      // logic to search for 7 in this array
      int searchFor = 7;
      for(int i=0; i<data.length; i++){
           if(searchFor == data[i]){
               System.out.println(searchFor+" found at index "+i);
               break;// stops the loop
           }
      } 
    }
}

// find no of occurances of a given number
// find second occurance of a given number
