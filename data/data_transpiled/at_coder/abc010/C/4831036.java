static final double tx_a , double ty_a , double tx_b , double ty_b , double T , double V ) {
  int n = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  double possibility = T * V ;
  double flg = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    if ( flg == 0 ) {
      double d_girl = Math . sqrt ( ( x - tx_a ) * ( x - tx_a ) + ( y - ty_a ) * ( y - ty_a ) ) + Math . sqrt ( ( x - tx_b ) * ( x - tx_b ) + ( y - ty_b ) * ( y - ty_b ) ) ;
      if ( possibility >= d_girl ) {
        flg = 1 ;
      }
    }
    else {
    }
  }
  if ( flg == 0 ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
  return flg ;
}
