class C{
// Finding mac value from Array
public static void main(String[] args){
    int[] x = {23,5,7,9,45,6};
    int max = x[0];
    for(int i =1 ; i<x.length; i++){
       if(x[i] > max){
	 max = x[i];
       }
    }
    System.out.println("Max value is "+max);      
}

}