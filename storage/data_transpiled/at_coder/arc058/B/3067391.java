public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int MOD = 10 * 9 + 7 ;
  int [ ] c1 = new int [ H ] ;
  int [ ] c2 = new int [ H ] ;
  for ( int i = 0 ;
  i < H - A ;
  i ++ ) {
    if ( i == 0 ) {
      c1 [ i ] = 1 ;
      c2 [ i ] = 1 ;
    }
    else {
      int m = Math . pow ( i , MOD - 2 , MOD ) ;
      int t1 = ( c1 [ i - 1 ] * ( B - 1 + i ) % MOD ) * m ;
      c1 [ i ] = t1 % MOD ;
      int t2 = ( c2 [ i - 1 ] * ( W - B + i ) % MOD ) ;
      c2 [ i ] = t2 % MOD ;
    }
  }
  for ( int i = 0 ;
  i < c1 . length ;
  i ++ ) {
    ans += ( c1 [ i ] * c2 [ c1 . length - i - 1 ] ) % MOD ;
  }
  System . out . println ( ans % MOD ) ;
  return 0 ;
}
