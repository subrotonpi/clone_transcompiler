public static int bName ( char [ ] A ) {
  int countDiff = 0 ;
  for ( int k = 0 ;
  k < A . length / 2 ;
  k ++ ) {
    if ( A [ k ] != A [ A . length - k - 1 ] ) {
      countDiff ++ ;
    }
  }
  int ans = A . length * 25 ;
  switch ( countDiff ) {
    case 0 : ans -= ( A . length % 2 ) ;
    break ;
  }
  return ans ;
}
