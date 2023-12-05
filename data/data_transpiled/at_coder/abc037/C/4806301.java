@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > lst_a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N - K + 1 ;
  i ++ ) {
    if ( i == 0 ) {
      ans += ( lst_a . get ( i + K - 1 ) - 0 ) ;
    }
    else {
      ans += ( lst_a . get ( i + K - 1 ) - lst_a . get ( i - 1 ) ) ;
    }
  }
  System . out . println ( ans ) ;
  return lst_a ;
}
