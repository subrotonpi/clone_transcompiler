static final void solve ( int n , int k , int [ ] a , int [ ] b ) {
  Arrays . sort ( b ) ;
  int lo = 0 ;
  int hi = 10 * 18 ;
  while ( lo + 1 < hi ) {
    int mid = ( lo + hi ) / 2 ;
    int c = 0 ;
    for ( int ai : a ) {
      int p = mid / ai ;
      int j = Arrays . binarySearch ( b , p ) ;
      c += j ;
    }
    if ( k <= c ) {
      hi = mid ;
    }
    else {
      lo = mid ;
    }
  }
  /* main program */
  n = Integer . parseInt ( input ( ) ) ;
  k = Integer . parseInt ( input ( ) ) ;
  a = new int [ n ] ;
  b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  System . out . println ( solve ( n , k , a , b ) ) ;
}
