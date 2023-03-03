public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] x = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) x [ i ] = Integer . parseInt ( input ) ;
  int [ ] p = x . clone ( ) ;
  Arrays . sort ( p ) ;
  int s = p [ n / 2 ] ;
  int t = p [ n / 2 - 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( x [ i ] <= t ) System . out . println ( s ) ;
    else System . out . println ( t ) ;
  }
}
