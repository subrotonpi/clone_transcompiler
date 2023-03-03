@ VisibleForTesting static void binarySearch ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > D = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    D . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int mod = 10 * 9 + 7 ;
  int [ ] R = new int [ N ] ;
  for ( int i = 0 ;
  i < D . size ( ) ;
  i ++ ) {
    R [ i ] = N - i ;
  }
  R = Collections . unmodifiableList ( R ) ;
  long ans = 0 ;
  for ( int b : D ) {
    ans += i / 2 * R [ Math . min ( N - 1 , i ) ] % mod ;
  }
  System . out . println ( ans % mod ) ;
}
