public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int c = 0 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( a [ i ] % 2 == 1 ) {
      c ++ ;
    }
  }
  if ( c % 2 == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
