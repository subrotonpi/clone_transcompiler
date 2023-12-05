static final int [ ] [ ] getSolutionList ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > s = new LinkedList < Integer > ( ) ;
  int [ ] [ ] g = new int [ n ] [ ] ;
  int [ ] [ ] ab = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    g [ i ] = new int [ n ] [ ] ;
  }
  for ( int i = 0 ;
  i <= m ;
  i ++ ) {
    int A = Integer . parseInt ( input . nextLine ( ) ) ;
    int B = Integer . parseInt ( input . nextLine ( ) ) ;
    g [ A - 1 ] [ B - 1 ] = A - 1 ;
    g [ B - 1 ] [ A - 1 ] = B - 1 ;
    ab [ A - 1 ] [ s . get ( B - 1 ) ] ++ ;
    ab [ B - 1 ] [ s . get ( A - 1 ) ] ++ ;
  }
  int [ ] visit = new int [ n ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    visit [ i ] = 0 ;
  }
  Queue < Integer > que = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    if ( ab [ i ] [ "A" ] == 0 || ab [ i ] [ "B" ] == 0 ) {
      que . add ( i ) ;
      visit [ i ] = 1 ;
    }
  }
  while ( que . size ( ) > 0 ) {
    int q = que . poll ( ) ;
    for ( int j = 0 ;
    j < g [ q ] . length ;
    j ++ ) {
      ab [ g [ q ] [ j ] ] -- ;
      if ( ( ab [ g [ q ] [ "A" ] == 0 || ab [ g [ q ] [ "B" ] == 0 ) && visit [ j ] == 0 ) {
        que . add ( j ) ;
        visit [ j ] = 1 ;
      }
    }
  }
  if ( Arrays . stream ( visit ) . noneMatch ( s ) ) {
    System . out . println ( "No" ) ;
  }
  else {
    System . out . println ( "Yes" ) ;
  }
  return g ;
}
