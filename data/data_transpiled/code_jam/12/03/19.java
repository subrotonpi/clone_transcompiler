static final int T = Integer . parseInt ( readLine ( ) ) ;
for ( int repeat : xrange ( T ) ) {
  String [ ] lineArr = readLine ( ) . split ( " " ) ;
  int A = Integer . parseInt ( lineArr [ 0 ] ) , B = Integer . parseInt ( lineArr [ 1 ] ) ;
  int n = ( int ) Math . log10 ( B ) + 1 ;
  int count = 0 ;
  for ( int w : xrange ( 1 , n ) ) {
    double wr = Math . pow ( 10 , w ) ;
    double wl = Math . pow ( 10 , n - w ) ;
    for ( int x : xrange ( A , B + 1 ) ) {
      double y = x / wr + x % wr * wl ;
      if ( y > x && y <= B ) {
        if ( wr <= wl ) count ++ ;
        else if ( y != x / wl + x % wl * wr ) count ++ ;
      }
    }
  }
  System . out . println ( "Case #" + ( repeat + 1 ) + ": " + count ) ;
}
