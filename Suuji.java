class Suuji{
  public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    if( a > b ){
      System.out.println("大きいのは" + a );
    } else if( b > a ){
      System.out.println("大きいのは" + b );
    } else {
      System.out.println("同じです");
    }
  }
}