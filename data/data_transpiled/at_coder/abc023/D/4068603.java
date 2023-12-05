public static int N = Integer . parseInt ( input ) {
  int [ ] items = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    items [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /* Check the input */
  boolean f = true ;
  int [ ] remain = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int h = items [ i ] ;
    int s = items [ i ] ;
    remain [ i ] = ( h - s ) / s ;
  }
  Arrays . sort ( remain ) ;
  int tmp = - 1 ;
  for ( int r : remain ) {
    tmp ++ ;
    if ( tmp <= r ) {
      continue ;
    }
    else {
      f = false ;
      break ;
    }
  }
  int ok = 10 * 20 ;
  int ng = 0 ;
  int t = 0 ;
  while ( ok - ng > 1 ) {
    int mid = ( ok + ng ) / 2 ;
    if ( check ( mid ) ) {
      ok = mid ;
    }
    else {
      ng = mid ;
    }
  }
  System . out . println ( ok ) ;
  return t ;
}
