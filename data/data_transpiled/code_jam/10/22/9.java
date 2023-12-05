static final int solve ( int c ) {
  int s = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( ;
  ;
  ) {
    int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int k = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int b = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int [ ] x = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int [ ] v = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    c = 0 ;
    s = 0 ;
    for ( int i = n - 1 ;
    i >= 0 ;
    i -- ) {
      if ( x [ i ] + v [ i ] * t >= b ) {
        s += c ;
        k -- ;
        if ( k == 0 ) break ;
      }
      else c ++ ;
    }
    if ( k > 0 ) System . out . println ( "Case #" + s + ": IMPOSSIBLE" ) ;
    else System . out . println ( "Case #" + s + ": " + s ) ;
  }
}
