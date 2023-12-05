public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( args [ 0 ] ) , K = Integer . parseInt ( args [ 1 ] ) ;
  int ans = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ans < K ) ans = ans << 1 ;
    else ans += K ;
  }
  System . out . println ( ans ) ;
}
