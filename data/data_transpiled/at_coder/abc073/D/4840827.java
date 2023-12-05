@ VisibleForTesting static Iterable < Integer > permutations ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> r = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    r . add ( Lists . newArrayList ( ) ) ;
  }
  List < Integer > E = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    E . add ( Lists . newArrayList ( ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int j = E . get ( i ) ;
    int c = E . get ( i ) ;
    d . set ( i - 1 , j - 1 , c ) ;
    d . set ( j - 1 , i - 1 , c ) ;
  }
  for ( int k = 0 ;
  k < N ;
  k ++ ) {
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      int dk = d . get ( i ) + d . get ( k ) - 1 ;
      if ( d . get ( i ) > dk ) {
        d . set ( i , dk ) ;
      }
    }
  }
  ans = 10 * 9 ;
  for ( int ri : r ) {
    int x = 0 ;
    for ( int i = 0 ;
    i < R - 1 ;
    i ++ ) {
      x += d . get ( ri ) - 1 ;
    }
    if ( ans > x ) {
      ans = x ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
