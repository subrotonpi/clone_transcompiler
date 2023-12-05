static final int [ ] range ( int N , int K ) {
  int [ ] A = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = 0 ;
  }
  Arrays . sort ( A ) ;
  List < Integer > cumsum_p = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    cumsum_p . add ( i ) ;
  }
  List < Integer > cumsum_m = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    cumsum_m . add ( i ) ;
  }
  double ans = - Double . MAX_VALUE ;
  for ( int i = 0 ;
  i < N - K + 1 ;
  i ++ ) {
    ans = Math . max ( ans , - ( cumsum_p . get ( i + K ) - cumsum_p . get ( i ) ) , cumsum_m . get ( i + K ) - cumsum_m . get ( i ) ) ;
  }
  ans += cumsum_p . get ( N - 1 ) ;
  System . out . println ( ans ) ;
}
