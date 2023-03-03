@ VisibleForTesting static void binarySearch ( int [ ] input ) {
  int N = Integer . parseInt ( input [ 0 ] ) ;
  List < Integer > D = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    D . add ( Integer . parseInt ( input [ i ] ) ) ;
  }
  int mod = 10 * 9 + 7 ;
  int [ ] R = new int [ N ] ;
  for ( int i = 0 ;
  i < D . length ;
  i ++ ) {
    R [ i ] = N - bl ( D , 2 * i ) ;
  }
  R = Collections . unmodifiableList ( Arrays . asList ( R ) ) . toArray ( ) ;
  long ans = 0 ;
  for ( int b : D ) {
    ans += br ( D , b / 2 ) * R [ Math . min ( N - 1 , bl ( D , 2 * b ) ) ] % mod ;
  }
  System . out . println ( ans % mod ) ;
}
