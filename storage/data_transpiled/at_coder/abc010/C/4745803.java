public static void tx_a ( int tx_a , int ty_a , int tx_b , int ty_b , int T , int V ) {
  int n = Integer . parseInt ( input ( ) ) ;
  boolean flag = false ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input ( ) ) ;
    int y = Integer . parseInt ( input ( ) ) ;
    if ( ( ( x - tx_a ) * ( y - ty_a ) * ( 1 / 2 ) + ( ( tx_b - x ) * ( y - ty_b ) * ( 1 / 2 ) ) ) <= T * V ) {
      flag = true ;
    }
  }
  System . out . println ( flag ? "YES" : "NO" ) ;
}
