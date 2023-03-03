public static int rectangular ( @ Nonnull int A , @ Nonnull int B , @ Nonnull int C ) {
  int MOD = 10 * 9 + 7 ;
  return ( A * B * C ) % MOD ;
}
if ( getClass ( ) . equals ( String . class ) ) {
  A = Integer . parseInt ( input ( ) ) ;
  B = Integer . parseInt ( input ( ) ) ;
  C = Integer . parseInt ( input ( ) ) ;
  int ans = rectangular ( A , B , C ) ;
  System . out . println ( ans ) ;
}
