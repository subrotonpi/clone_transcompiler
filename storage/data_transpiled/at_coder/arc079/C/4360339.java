public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = Integer . parseInt ( input ) ;
  int p = 0 ;
  int q = 0 ;
  for ( int x : a ) {
    q += x ;
  }
  p = Math . max ( 0 , q - n * ( n - 1 ) ) ;
  for ( int y = p ;
  y <= q ;
  y ++ ) {
    int z = 0 ;
    for ( int x : a ) {
      z += ( x + y + 1 ) / ( n + 1 ) ;
    }
    if ( y >= z ) {
      System . out . println ( y ) ;
      break ;
    }
  }
}
