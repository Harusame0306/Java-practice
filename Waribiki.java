class Waribiki{
  public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    int price = a+b;
    double rate = 0.1;
    int amount, discount;
   // int discount;

    if( price >= 5000 ){
      discount = 500;
    } else if( price >= 3000 ){
      discount = 300;
    } else {
      discount = 0;
    }

    amount = (int)(( price - discount ) * ( 1 + rate ));

    System.out.println( "金額：" + amount + "円");
  }
}