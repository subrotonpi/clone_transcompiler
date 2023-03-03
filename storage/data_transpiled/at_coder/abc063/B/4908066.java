public static String input ( ) {
  String S = input ( ) ;
  String ans = "yes" ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . indexOf ( S . substring ( i , i + 1 ) ) > 1 ) {
      ans = "no" ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
