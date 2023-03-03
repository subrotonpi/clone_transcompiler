public static void solve ( int cas , int n ) {
  for ( int i = 1 ;
  i <= 1 ;
  i ++ ) {
    int n = input . nextInt ( ) ;
    int [ ] m = map ( input . nextLine ( ) . trim ( ) . split ( " " ) ) ;
    int a = Integer . valueOf ( max ( 0 , m [ i - 1 ] - m [ i ] ) ) ;
    int rate = Integer . valueOf ( max ( 0 , m [ i - 1 ] - m [ i ] ) ) ;
    int b = Integer . valueOf ( min ( rate , m [ i ] ) ) ;
    System . out . println ( "Case #" + cas + ": " + a + " " + b ) ;
  }
}
