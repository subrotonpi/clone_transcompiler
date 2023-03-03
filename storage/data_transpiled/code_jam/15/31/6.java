public static int T = Integer . parseInt ( Scanner in ) {
  for ( int kase = 1 ;
  kase <= T ;
  kase ++ ) {
    int n = in . nextInt ( ) ;
    int m = in . nextInt ( ) ;
    int c = in . nextInt ( ) ;
    int ans = n * ( m / c ) ;
    if ( m % c == 0 ) ans += c - 1 ;
    else ans += c ;
    System . out . println ( "Case #" + kase + ": " + ans ) ;
  }
  return T ;
}
