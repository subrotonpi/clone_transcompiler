@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int mod = 10 * 9 + 7 ;
  int [ ] prob = new int [ N + 1 ] ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    prob [ i ] = 0 ;
  }
  int total = 1 ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    total = total * i % mod ;
  }
  int ans = 0 ;
  for ( int n = a . size ( ) , left = 0 , right = N - 1 ;
  left < N ;
  left ++ , right -- ) {
    ans += total * n * ( 1 + prob [ left ] + prob [ right ] ) % mod ;
  }
  System . out . println ( ans % mod ) ;
  return a ;
}
