public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int [ ] p = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] == 1 ) {
      p [ 0 ] = 1 ;
      continue ;
    }
    if ( p [ a [ i ] - 2 ] == 0 ) p [ a [ i ] - 1 ] = 1 ;
    else p [ a [ i ] - 1 ] = p [ a [ i ] - 2 ] + 1 ;
  }
  System . out . println ( n - max ( p ) ) ;
}
