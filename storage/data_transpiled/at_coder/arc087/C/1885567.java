@ VisibleForTesting static int solve ( int n , int l , List < Integer > nums ) {
  int xor = 0 ;
  if ( n == 1 ) {
    for ( int i = Math . min ( nums . size ( ) , l + 1 ) ;
    i != 0 ;
    i = Math . min ( nums . size ( ) , l ) ) {
      xor ^= i & - i ;
    }
    return xor ;
  }
  for ( int i = Math . min ( nums . size ( ) , l + 1 ) ;
  i != 0 ;
  i = Math . min ( nums . size ( ) , l ) ) {
    List < Integer > ni = nums . get ( i ) ;
    for ( int k = 0 ;
    k < ni . size ( ) ;
    k ++ ) {
      if ( ! ni . contains ( k ^ 1 ) ) {
        xor ^= i & - i ;
      }
      nums . get ( i + 1 ) . add ( k / 2 ) ;
    }
    -- i ;
  }
  return xor ;
}
