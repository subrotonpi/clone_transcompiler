static final int binarySearch ( int n , int m ) {
  int x , y ;
  int [ ] a = new int [ n ] ;
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = i ;
  }
  b [ ] = 0 ;
  int c = a [ 0 ] ;
  int d = 0 ;
  int h = 0 ;
  while ( n -- > 0 ) {
    if ( d == 0 ) {
      c += x ;
      int e = Arrays . binarySearch ( b , c ) ;
      if ( e != m ) {
        c = b [ e ] ;
        h ++ ;
        d = 1 ;
      }
      else break ;
    }
    else break ;
  }
  System . out . println ( ( h + d ) / 2 ) ;
}
