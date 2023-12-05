public static int [ ] readIntRange ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] a = new int [ m ] ;
  int [ ] b = new int [ m ] ;
  int [ ] c = new int [ m ] ;
  for ( int i = 0 ;
  i <= m ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
    b [ i ] = Integer . parseInt ( input ) ;
    c [ i ] = Integer . parseInt ( input ) ;
    a [ i ] = a [ i ] - 1 ;
    b [ i ] = b [ i ] - 1 ;
    c [ i ] = - c [ i ] ;
  }
  int INF = ( n - 1 ) * Math . max ( Math . min ( c , 0 ) , Math . max ( c , 0 ) ) ;
  int [ ] dist = new int [ n ] ;
  dist [ 0 ] = INF ;
  for ( int j = 0 ;
  j <= n - 1 ;
  j ++ ) {
    for ( int i = 0 ;
    i <= m ;
    i ++ ) {
      if ( dist [ a [ i ] ] == INF ) continue ;
      dist [ b [ i ] ] = Math . min ( dist [ b [ i ] ] , dist [ a [ i ] ] + c [ i ] ) ;
    }
  }
  int ans = - dist [ n - 1 ] ;
  boolean [ ] negative = new boolean [ n ] ;
  for ( int j = 0 ;
  j <= n ;
  j ++ ) {
    for ( int i = 0 ;
    i <= m ;
    i ++ ) {
      if ( dist [ a [ i ] ] == INF ) continue ;
      if ( negative [ a [ i ] ] ) {
        negative [ b [ i ] ] = true ;
      }
      else if ( dist [ a [ i ] ] + c [ i ] < dist [ b [ i ] ] ) {
        dist [ b [ i ] ] = dist [ a [ i ] ] + c [ i ] ;
        negative [ b [ i ] ] = true ;
      }
    }
  }
  if ( negative [ n - 1 ] ) {
    System . out . println ( "inf" ) ;
  }
  else {
    System . out . println ( ans ) ;
  }
  return negative ;
}
