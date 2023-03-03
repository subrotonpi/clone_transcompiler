public static int N = Integer . parseInt ( input ) {
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  /* func */
  ans = 0 ;
  int acc = 0 ;
  for ( int i = 0 ;
  acc <= N ;
  i ++ ) {
    acc = acc + A [ i ] ;
    if ( i % 2 == flag ) {
      if ( acc >= 0 ) {
        ans += 1 + acc ;
        acc = - 1 ;
      }
    }
    else {
      if ( acc <= 0 ) {
        ans += 1 - acc ;
        acc = 1 ;
      }
    }
  }
  return ans ;
}
