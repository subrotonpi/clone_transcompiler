@ VisibleForTesting static Iterable < Integer > permutations ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int l = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > P = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < P . size ( ) ;
  i ++ ) {
    int p = P . get ( i ) ;
    int q = P . get ( i ) ;
    int r = P . get ( i ) ;
    v = Math . max ( v , ( n / p ) * ( m / q ) * ( l / r ) ) ;
  }
  return P ;
}
