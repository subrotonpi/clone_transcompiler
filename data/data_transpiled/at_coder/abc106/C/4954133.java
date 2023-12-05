public static String input ( ) {
  int K = Integer . parseInt ( input ( ) ) ;
  String ans = "1" ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    if ( S [ i ] != "1" ) {
      ans = S [ i ] ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
