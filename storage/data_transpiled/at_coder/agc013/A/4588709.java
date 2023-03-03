public static int N = Integer . parseInt ( input ) {
  int [ ] AN = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    AN [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 1 ;
  int beforeDiff = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    int diff = AN [ i ] - AN [ i - 1 ] ;
    if ( beforeDiff == 0 ) {
      beforeDiff = diff ;
    }
    else if ( beforeDiff * diff < 0 ) {
      beforeDiff = 0 ;
      ans ++ ;
    }
  }
  return ans ;
}
