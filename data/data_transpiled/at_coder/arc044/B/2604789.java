public static int n = Integer . parseInt ( input ) {
  int [ ] a = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  final int MOD = 10 * 9 + 7 ;
  {
    if ( a [ 0 ] != 0 ) return 0 ;
    int [ ] c = new int [ Math . max ( a . length + 1 , a . length ) ] ;
    for ( int ai : a ) c [ ai ] ++ ;
    if ( c [ 0 ] != 1 ) return 0 ;
    int ans = 1 ;
    for ( int i = 1 ;
    i < c . length ;
    i ++ ) {
      if ( c [ i ] == 0 ) return 0 ;
      ans = ( ans * Math . pow ( 2 , c [ i ] * ( c [ i ] - 1 ) / 2 , MOD ) ) % MOD ;
      ans = ( ans * ( Math . pow ( ( Math . pow ( 2 , c [ i - 1 ] , MOD ) + MOD - 1 ) , c [ i ] , MOD ) ) ) % MOD ;
    }
    return ans ;
  }
}
