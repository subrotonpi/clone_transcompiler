private static int [ ] getMatchingValues ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] a = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int [ ] c = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( c [ a [ i ] ] == 0 ) {
      System . out . println ( a [ i ] ) ;
      c [ a [ i ] ] = 1 ;
    }
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( c [ i ] != 1 ) {
      System . out . println ( i ) ;
    }
  }
  return c ;
}
