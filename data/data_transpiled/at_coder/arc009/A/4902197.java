public static void print ( int n ) {
  int price = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    price += a * b ;
  }
  System . out . println ( ( int ) ( price * 1.05 ) ) ;
}
