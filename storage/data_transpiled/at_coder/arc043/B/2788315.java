@ VisibleForTesting static void binarySearch ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > D = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) D . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int mod = 10 * 9 + 7 ;
  int [ ] R = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) R [ i ] = N - 1 - i * R [ i ] ;
  R = Collections . unmodifiableList ( R ) ;
  long ans = 0 ;
  for ( int b : D ) ans += Math . abs ( b / 2 ) * R [ Math . min ( N - 1 , Math . abs ( b * 2 ) ) ] % mod ;
  System . out . println ( ans % mod ) ;
}
