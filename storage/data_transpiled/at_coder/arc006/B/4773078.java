public static int N ( ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] b = new String [ L ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) b [ i ] = input . nextLine ( ) . split ( "\\|" ) ;
  int x = input . indexOf ( "o" ) / 2 + 1 ;
  for ( int y = L - 1 ;
  y >= 0 ;
  y -- ) {
    if ( b [ y ] . charAt ( x - 1 ) == '-' ) x -- ;
    else if ( b [ y ] . charAt ( x ) == '-' ) x ++ ;
  }
  return x ;
}
