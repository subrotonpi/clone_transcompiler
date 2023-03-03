public static int [ ] [ ] readInputInt ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] [ ] abc = new int [ m ] [ n ] ;
  int INF = 10 * 20 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    int c = Integer . parseInt ( input ) ;
    a -- ;
    b -- ;
    c *= - 1 ;
    abc [ i ] [ a ] = b ;
    abc [ i ] [ b ] = c ;
  }
  int [ ] dist = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dist [ i ] = INF ;
  }
  dist [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    for ( int a = 0 ;
    a < abc [ i ] . length ;
    a ++ ) {
      dist [ i ] = abc [ i ] [ a ] ;
      if ( dist [ i ] == INF ) {
        continue ;
      }
      else if ( dist [ i ] > dist [ i ] + c ) {
        dist [ i ] = dist [ i ] + c ;
      }
    }
  }
  int ans = dist [ n - 1 ] ;
  int [ ] check = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    for ( int a = 0 ;
    a < abc [ i ] . length ;
    a ++ ) {
      dist [ i ] = - 1 ;
      if ( dist [ i ] == INF ) {
        continue ;
      }
      else if ( dist [ i ] > dist [ i ] + c ) {
        dist [ i ] = dist [ i ] + c ;
        check [ i ] = 0 ;
      }
    }
  }
  if ( check [ n - 1 ] == 0 ) {
    System . out . println ( "inf" ) ;
  }
  else {
    System . out . println ( - ans ) ;
  }
  return abc ;
}
