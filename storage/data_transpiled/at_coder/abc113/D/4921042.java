public static long [ ] [ ] parse ( String input ) {
  int h = Integer . parseInt ( input ) ;
  int w = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  long [ ] [ ] memo = new long [ h + 1 ] [ w ] ;
  for ( int i = 0 ;
  i <= w ;
  i ++ ) {
    memo [ 0 ] [ i ] = 0 ;
  }
  memo [ 0 ] [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= h ;
  i ++ ) {
    for ( int j = 0 ;
    j <= 1 << ( w - 1 ) ;
    j ++ ) {
      boolean skip = false ;
      for ( int l = 0 ;
      l < w - 2 ;
      l ++ ) {
        skip = skip || ( ( j >> l ) & 1 && ( j >> ( l + 1 ) ) & 1 ) ;
      }
      if ( ! skip ) {
        for ( int l = 0 ;
        l < w ;
        l ++ ) {
          if ( l - 1 >= 0 && ( j >> ( l - 1 ) ) & 1 ) {
            memo [ i ] [ l ] += memo [ i - 1 ] [ l - 1 ] ;
          }
          else {
            memo [ i ] [ l ] += memo [ i - 1 ] [ l ] ;
          }
          memo [ i ] [ l ] = memo [ i ] [ l ] % 1000000007 ;
        }
      }
    }
  }
  System . out . println ( memo [ h ] [ k - 1 ] ) ;
  return memo ;
}
