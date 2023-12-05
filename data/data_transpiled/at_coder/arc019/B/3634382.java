public static int input ( ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < A . length / 2 ;
  i ++ ) {
    if ( A [ i ] != A [ A . length - i - 1 ] ) {
      ans ++ ;
    }
  }
  switch ( ans ) {
    case 0 : System . out . println ( 25 * 2 * ( A . length / 2 ) ) ;
    break ;
    case 1 : System . out . println ( 24 * 2 + 25 * ( A . length - 2 ) ) ;
    break ;
    default : System . out . println ( 25 * A . length ) ;
    break ;
  }
  return ans ;
}
