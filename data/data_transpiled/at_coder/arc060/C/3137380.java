@ VisibleForTesting static int binarySearch ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] R = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    R [ 0 ] [ i ] = Lists . newArrayList ( ) ;
  }
  for ( int i = 0 ;
  i < R . length ;
  i ++ ) {
    R [ 0 ] [ i ] = Lists . newArrayList ( ) ;
  }
  for ( int k = 1 ;
  k < R . length ;
  k ++ ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      R [ k ] [ i ] = R [ k - 1 ] [ R [ k - 1 ] [ i ] ] ;
    }
  }
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int q = 0 ;
  q < Q ;
  q ++ ) {
    int a , b ;
    a = Math . min ( a , b ) - 1 ;
    b = Math . max ( a , b ) - 1 ;
    int ans = 0 ;
    for ( int k = R . length ;
    k > 0 ;
    k -- ) {
      if ( R [ k ] [ a ] < b ) {
        a = R [ k ] [ a ] ;
        ans += 2 * k ;
      }
    }
    System . out . println ( ans + 1 ) ;
  }
  return R . length ;
}
