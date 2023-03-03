public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    A . add ( i ) ;
  }
  int ans = 1 ;
  int n = N - K ;
  ans += n / ( K - 1 ) ;
  ans += n % ( K - 1 ) != 0 ? 1 : 0 ;
  System . out . println ( ans ) ;
  return ans ;
}
