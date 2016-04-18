// Declaring char datatypes

class E{
 public static void main(String[] args){

    char x = 'A';
    char y = '8';
    char z = '#';

    char i = 65;

     System.out.println(x);
     System.out.println(y);
     System.out.println(z);
     System.out.println(i);
    
     // unicode representation of character
     System.out.println('\u0001');

      // compile time error, assci codes cannot be negatives
      char j = -20;


  }


}