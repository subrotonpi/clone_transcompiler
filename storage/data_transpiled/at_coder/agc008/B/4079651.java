@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > aList = Lists . newArrayList ( ) ;
  for ( int a : aList ) {
    if ( a > 0 ) {
      bList . add ( a ) ;
    }
    else {
      bList . add ( 0 ) ;
    }
  }
  List < Integer > bList = Lists . newArrayList ( ) ;
  List < Integer > aAcc = Lists . newArrayList ( ) ;
  for ( int a : aList ) {
    if ( a > 0 ) {
      bList . add ( a ) ;
    }
    else {
      bList . add ( 0 ) ;
    }
  }
  List < Integer > bAcc = Lists . newArrayList ( ) ;
  List < Integer > aAcc = Lists . newArrayList ( ) ;
  for ( int a : bList ) {
    aAcc . add ( a ) ;
  }
  bList . add ( 0 ) ;
  bList . add ( bList . get ( bList . size ( ) - 1 ) ) ;
  aAcc . add ( 0 ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N - K + 1 ;
  i ++ ) {
    ans = Math . max ( ans , bList . get ( i ) + aAcc . get ( i + K ) - aAcc . get ( i ) + bList . get ( N ) - bList . get ( i + K ) ) ;
    ans = Math . max ( ans , bList . get ( i ) + bList . get ( N ) - bList . get ( i + K ) ) ;
  }
  System . out . println ( ans ) ;
  return aAcc ;
}
