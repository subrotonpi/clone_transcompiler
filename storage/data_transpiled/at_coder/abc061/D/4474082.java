public static int [ ] getDistance ( int n , int m ) {
  int [ ] alist = new int [ m ] , blist = new int [ n ] , clist = new int [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    int c = Integer . parseInt ( input . readLine ( ) ) ;
    alist [ i ] = a - 1 ;
    blist [ i ] = b - 1 ;
    clist [ i ] = - c ;
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
    a < alist . length ;
    a ++ ) {
      for ( int b = 0 ;
      b < blist . length ;
      b ++ ) {
        if ( dist [ a ] == INF ) continue ;
        if ( dist [ b ] > dist [ a ] + c ) dist [ b ] = dist [ a ] + c ;
      }
    }
  }
  int ans = dist [ n - 1 ] ;
  boolean [ ] negative = new boolean [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int a = 0 ;
    a < alist . length ;
    a ++ ) {
      for ( int b = 0 ;
      b < blist . length ;
      b ++ ) {
        if ( dist [ a ] == INF ) continue ;
        if ( dist [ b ] > dist [ a ] + c ) {
          dist [ b ] = dist [ a ] + c ;
          negative [ b ] = true ;
        }
        if ( negative [ a ] ) negative [ b ] = true ;
      }
    }
  }
  if ( negative [ n - 1 ] ) System . out . println ( "inf" ) ;
  else System . out . println ( - ans ) ;
  return ans ;
}
