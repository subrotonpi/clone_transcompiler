@ Nullable public static String aRepDigit ( int N ) {
  int count = 1 , digit = 0 ;
  do {
    for ( int k = 1 ;
    k <= 10 ;
    k ++ ) {
      if ( count == N ) {
        return StringUtil . digits ( digit ) ;
      }
      count ++ ;
    }
    digit ++ ;
  }
  while ( digit < N ) ;
  return null ;
}
