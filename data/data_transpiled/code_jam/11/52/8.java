public static int solve ( int [ ] a ) throws IOException {
  if ( a . length == 0 ) {
    return 0 ;
  }
  int [ ] b = new int [ a . length ] ;
  int cur = a [ 0 ] - 1 ;
  int cnt = 0 ;
  for ( int x : a ) {
    if ( x == cur ) {
      cnt ++ ;
    }
    else {
      b [ cnt ] = cnt ;
      cnt = 1 ;
      cur = x ;
    }
  }
  b [ 0 ] = cnt ;
  int res = 100000 ;
  Queue < Integer > Q = new ArrayDeque < Integer > ( ) ;
  b [ 0 ] = 0 ;
  for ( int i = 1 ;
  i < b . length ;
  i ++ ) {
    while ( b [ i ] > b [ i - 1 ] ) {
      Q . add ( i ) ;
      b [ i - 1 ] ++ ;
    }
    while ( b [ i ] < b [ i - 1 ] ) {
      int x = Q . remove ( 0 ) ;
      b [ i - 1 ] -- ;
      res = Math . min ( res , i - x ) ;
    }
  }
  return res ;
}
