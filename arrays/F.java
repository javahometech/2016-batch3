// Find sum of all numbers, by skipping negative values

class F{
    public static void main(String[] args){
      int[] data = {1,7,-9,5,7,-3,4,7};
       int sum = 0;
       for(int i = 0; i<data.length; i++){
          if(data[i] <0;){
            continue;
           }
          sum = sum + data[i];
       }
    }
}
