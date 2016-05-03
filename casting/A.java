class A{
    public static void main(String[] args){
      short   i = 130;
      byte    j = (byte)i;
//    We see unecxpected data because we lost significant bit
      System.out.println(j); 
    }
}