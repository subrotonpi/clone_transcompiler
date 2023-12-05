static final double tx_b , double ty_b , double tx_a , double ty_a , double t , double v ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    double g = Math . sqrt ( ( x - tx_b ) * ( x - tx_b ) + ( y - ty_b ) * ( y - ty_b ) ) + Math . sqrt ( ( tx_a - x ) * ( x - tx_a ) + ( ty_a - y ) * ( y - ty_a ) ) ;
    if ( g <= t * v ) {
      System . out . println ( "YES" ) ;
      break ;
    }
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return t * v ;
}
