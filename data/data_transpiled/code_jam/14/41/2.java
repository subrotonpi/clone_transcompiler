public static int T = Integer . parseInt ( Scanner in ) {
  for ( int Case : xrange ( 1 , T + 1 ) ) {
    int N = in . nextInt ( ) ;
    int C = in . nextInt ( ) ;
    int [ ] A = in . nextInt ( ) ;
    Arrays . sort ( A ) ;
    int s = 0 ;
    int i = 0 ;
    int j = N - 1 ;
    while ( i <= j ) {
      if ( i == j ) {
        s ++ ;
        break ;
      }
      if ( A [ i ] + A [ j ] <= C ) {
        s ++ ;
        i ++ ;
        j -- ;
      }
      else {
        s ++ ;
        j -- ;
      }
    }
    System . out . printf ( "Case #%d:%n" , Case , s ) ;
  }
  return s ;
}
