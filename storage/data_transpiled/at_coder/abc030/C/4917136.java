static final int [ ] binarySearch ( int n , int m ) {
  int x , y ;
  int a [ ] = new int [ n ] ;
  int b [ ] = new int [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x = i ;
    y = i ;
  }
  a = new int [ n ] ;
  b = new int [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    a [ i ] = i ;
  }
  int airport = 0 ;
  int now = a [ 0 ] ;
  int cnt = 0 ;
  while ( true ) {
    if ( airport == 1 ) {
      cnt ++ ;
    }
    if ( airport == 0 ) {
      try {
        now = b [ binarySearch ( b , now + x ) ] ;
      }
      catch ( Exception e ) {
        break ;
      }
      airport = 1 ;
    }
    else {
      try {
        now = a [ binarySearch ( a , now + y ) ] ;
      }
      catch ( Exception e ) {
        break ;
      }
      airport = 0 ;
    }
  }
  System . out . println ( cnt ) ;
  return a ;
}
