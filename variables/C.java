class C{
  public static void main(String[] args){
    int i = 1;
    for(int j = 1; j<=3; j++){
        if(j%2 == 0){
            i++;
            i++;
        }else{
            i++;
        }
    }
    System.out.println(i);
  }

}