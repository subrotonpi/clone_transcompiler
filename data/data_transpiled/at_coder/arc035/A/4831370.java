public static String input ( ) {
  boolean flag = true ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( ! ( s . charAt ( i ) == s . charAt ( s . length ( ) - i - 1 ) || s . charAt ( i ) == '*' || s . charAt ( s . length ( ) - i - 1 ) == '*' ) ) flag = false ;
  }
  return "YES" ;
}
