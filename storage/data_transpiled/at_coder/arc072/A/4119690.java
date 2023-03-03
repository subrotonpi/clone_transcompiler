public static int N = Integer . parseInt ( input ) {
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  /* func */
  int [ ] l = new int [ N ] ;
  ans = 0 ;
  int acc = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    l [ i ] = A [ i ] ;
  }
  for ( int i = 0 ;
  acc <= N ;
  i ++ ) {
    acc = acc + l [ i ] ;
    if ( i % 2 == flag ) {
      if ( acc >= 0 ) {
        l [ i ] = l [ i ] - ( 1 + acc ) ;
        ans ++ + acc ;
        acc = - 1 ;
      }
    }
    else {
      if ( acc <= 0 ) {
        l [ i ] = l [ i ] + ( 1 - acc ) ;
        ans ++ - acc ;
        acc = 1 ;
      }
    }
  }
  return ans ;
}
