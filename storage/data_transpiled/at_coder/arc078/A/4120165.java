@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > card = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    card . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < Integer > acc = Lists . newArrayList ( ) ;
  acc . addAll ( accumulate ( card ) ) ;
  int s = acc . get ( acc . size ( ) - 1 ) ;
  int ans = Integer . MIN_VALUE ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int t = acc . get ( i ) ;
    int a = s - t ;
    ans = Math . min ( ans , Math . abs ( t - a ) ) ;
  }
  System . out . println ( ans ) ;
  return acc ;
}
