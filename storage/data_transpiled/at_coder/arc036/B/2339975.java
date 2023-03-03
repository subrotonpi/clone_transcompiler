public static int N = Integer . parseInt ( input ) {
  int [ ] src = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) src [ i ] = Integer . parseInt ( input . next ( ) ) ;
  int ans = 0 ;
  int tmp = 1 ;
  boolean asc = true ;
  for ( int a = 1 ;
  a < N ;
  a ++ ) {
    if ( ! asc && a < N ) {
      ans = Math . max ( ans , tmp ) ;
      tmp = 2 ;
      asc = true ;
    }
    else {
      if ( asc && a > N ) asc = false ;
      tmp ++ ;
    }
  }
  return ans ;
}
