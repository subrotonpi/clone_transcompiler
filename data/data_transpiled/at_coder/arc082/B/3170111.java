static final int [ ] range ( int n ) {
  int [ ] p = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    p [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  int tmp = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( p [ i - 1 ] == i ) {
      tmp ++ ;
    }
    else if ( tmp > 1 ) {
      ans += Math . ceil ( tmp / 2 ) ;
      tmp = 0 ;
    }
    else if ( tmp == 1 ) {
      ans += tmp ;
      tmp = 0 ;
    }
  }
  return ans ;
}
