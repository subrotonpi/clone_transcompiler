static final int T = Integer . parseInt ( readLine ( ) ) ;
for ( int t = 1 ;
t <= T ;
t ++ ) {
  int L = Integer . parseInt ( readLine ( ) ) ;
  int P = Integer . parseInt ( readLine ( ) ) ;
  int C = Integer . parseInt ( readLine ( ) ) ;
  double x = 1 ;
  double y = ( double ) P ;
  while ( Math . ceil ( y / C ) > L ) {
    x ++ ;
    y = Math . ceil ( y / C ) ;
  }
  if ( x != 0 ) x = Math . log ( x ) ;
  System . out . println ( "Case #" + t + ": " + Math . ceil ( x ) ) ;
}
