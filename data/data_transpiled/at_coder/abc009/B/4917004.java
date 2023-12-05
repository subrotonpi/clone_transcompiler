public static void print ( String input ) {
  n = Integer . parseInt ( input ) ;
  a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  a = new ArrayList < > ( new HashSet < > ( a ) ) ;
  Collections . sort ( a ) ;
  if ( a . size ( ) > 1 ) {
    print ( a . get ( 1 ) ) ;
  }
  else {
    print ( a . get ( 0 ) ) ;
  }
}
