public static String makeResult ( int n , int a , int b ) {
  String result = null ;
  String [ ] tail = null ;
  int k ;
  if ( n < a * b ) {
    if ( a <= b ) {
      k = ( a * b - n + b - 2 ) / ( b - 1 ) - 1 ;
      tail = new String [ k ] ;
      for ( int i = k - 1 ;
      i >= 0 ;
      i -- ) {
        tail [ i ] = n - i ;
      }
      n -= k ;
      a -= k ;
      k = n - ( a - 1 ) * b ;
      tail = new String [ k ] ;
      for ( int i = k ;
      i >= 0 ;
      i -- ) {
        tail [ i ] = n - i ;
      }
      tail [ k ] = n - i ;
      n -= k ;
      a -- ;
    }
    else {
      k = ( a * b - n + a - 2 ) / ( a - 1 ) - 1 ;
      result = new String [ k ] ;
      for ( int i = k ;
      i >= 0 ;
      i -- ) {
        result [ k ] = n - i ;
      }
      n -= k ;
      b -= k ;
      k = n - a * ( b - 1 ) ;
      result [ k ] = n - i ;
      n -= k ;
      b -- ;
    }
  }
  for ( int i = 0 ;
  i < b ;
  i ++ ) {
    for ( int j = 0 ;
    j < a ;
    j ++ ) {
      result [ i ] = n - a * ( i + 1 ) + j + 1 ;
    }
  }
  /* solve */
  if ( n < a + b - 1 ) return "-1" ;
  if ( a * b < n ) return "-1" ;
  return result ;
}
