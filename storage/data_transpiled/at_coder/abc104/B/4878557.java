public static String input ( ) {
  String S = input . next ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( String . isLowerCase ( S . charAt ( i ) ) ) {
      ans ++ ;
    }
  }
  String s = S . substring ( 2 , S . length ( ) - 1 ) ;
  if ( S . charAt ( 0 ) == 'A' && s . indexOf ( 'C' ) == 1 && ans == S . length ( ) - 2 ) {
    System . out . println ( "AC" ) ;
  }
  else {
    System . out . println ( "WA" ) ;
  }
  return s ;
}
