public static String input ( ) {
  String s = input ( ) ;
  String ans = "" ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( ( i + 1 ) % 2 != 0 ) {
      ans += s . charAt ( i ) ;
    }
  }
  return ans ;
}
