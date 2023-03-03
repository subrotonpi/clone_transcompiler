public static int N = Integer . parseInt ( input ) {
  int [ ] a = Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] List = new int [ 10 * 5 + 1 ] ;
  int ans = 0 ;
  for ( int i : a ) {
    if ( i > 10 * 5 ) ans ++ ;
    else List [ i ] ++ ;
  }
  for ( int i = 1 ;
  i <= 10 * 5 ;
  i ++ ) {
    if ( List [ i ] >= i ) ans += List [ i ] - i ;
    else ans += List [ i ] ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
