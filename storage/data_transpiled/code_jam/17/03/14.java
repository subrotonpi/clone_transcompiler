public static int lg2 ( int x ) {
  int i = 0 ;
  while ( x >= 2 * i ) {
    i ++ ;
  }
  return i - 1 ;
}
for ( int tc = 1 ;
tc <= Integer . parseInt ( input ) ;
tc ++ ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) , K = Integer . parseInt ( input . nextLine ( ) ) ;
  N ++ ;
  int Kpow = 2 * ( lg2 ( K ) + 1 ) ;
  int v = Kpow - K - 1 ;
  int ans = ( N + v ) / ( 2 * lg2 ( K ) ) ;
  System . out . println ( "Case #" + tc + ": " + ( ans - 1 ) / 2 + " " + ( ans - 2 ) / 2 ) ;
}
