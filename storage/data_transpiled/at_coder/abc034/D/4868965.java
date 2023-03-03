public static boolean solve ( int n , int k ) {
  int [ ] [ ] info = new int [ n ] [ k ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    info [ i ] [ 0 ] = 0 ;
  }
  /* solve the ans */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    info [ i ] [ 0 ] = info [ i ] [ 1 ] * info [ i ] [ 2 ] - ans * info [ i ] [ 1 ] ;
  }
  Arrays . sort ( info ) ;
  int parameter = 0 ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    parameter += info [ i ] [ 0 ] ;
  }
  if ( parameter >= 0 ) {
    return true ;
  }
  else {
    return false ;
  }
  int ok = 0 ;
  int ng = 100 ;
  while ( Math . abs ( ok - ng ) >= 10 * ( - 6 ) ) {
    int mid = ( ok + ng ) / 2 ;
    if ( solve ( mid ) ) {
      ok = mid ;
    }
    else {
      ng = mid ;
    }
  }
  System . out . println ( mid ) ;
  return true ;
}
