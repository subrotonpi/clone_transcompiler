public static int K = Integer . parseInt ( input ) {
  int [ ] al = Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int s = 2 , l = 2 ;
  if ( al [ al . length - 1 ] != 2 ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  if ( K == 1 ) {
    System . out . println ( s + " " + ( l + al [ 0 ] - 1 ) ) ;
    exit ( ) ;
  }
  for ( int i = K - 1 ;
  i >= 0 ;
  i -- ) {
    int c = 0 ;
    int tmps ;
    if ( s % al [ i - 1 ] == 0 ) tmps = s ;
    else tmps = s + al [ i - 1 ] - s % al [ i - 1 ] ;
    if ( tmps <= l + al [ i ] - 1 ) {
      s = tmps ;
      c ++ ;
      l = ( l + al [ i ] - 1 ) / al [ i - 1 ] * al [ i - 1 ] ;
    }
    if ( c == 0 ) {
      System . out . println ( - 1 ) ;
      exit ( ) ;
    }
    if ( i == 1 ) {
      System . out . println ( s + " " + ( l + al [ 0 ] - 1 ) ) ;
    }
  }
  return s ;
}
