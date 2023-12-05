public static void main ( String [ ] args ) {
  int R = 10 * 9 + 7 ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  if ( a [ 0 ] != 0 ) {
    return ;
  }
  int amax = Collections . max ( a ) ;
  int [ ] h = new int [ amax + 1 ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    h [ a [ i ] ] ++ ;
  }
  if ( h [ 0 ] != 1 ) {
    return ;
  }
  int ans = 1 ;
  int b = 1 ;
  for ( int i = 1 ;
  i < h . length ;
  i ++ ) {
    if ( h [ i ] == 0 ) {
      return ;
    }
    ans *= Math . pow ( 2 , h [ i ] * ( h [ i - 1 ] ) / 2 , R ) ;
    ans %= R ;
    ans *= Math . pow ( Math . pow ( 2 , b , R ) - 1 , h [ i ] , R ) ;
    ans %= R ;
    b = h [ i ] ;
  }
  System . out . println ( ans ) ;
}
