public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] T = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    T [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int inf = 0 ;
  int sup = max ( T [ 0 ] . length , h -> h + ( N - 1 ) * s ) ;
  /* Check for negative values */
  for ( int idx = 0 ;
  idx < T . length ;
  idx ++ ) {
    int timeLimit = T [ idx ] [ 0 ] ;
    if ( timeLimit < idx ) {
      return false ;
    }
  }
  while ( sup - inf > 1 ) {
    int mid = ( sup + inf ) / 2 ;
    if ( check ( mid ) ) {
      sup = mid ;
    }
    else {
      inf = mid ;
    }
  }
  System . out . println ( sup ) ;
  return inf ;
}
