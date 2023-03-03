public static String input ( ) {
  String x = input ( ) ;
  String ans = "" ;
  String s = input ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == x ) {
      continue ;
    }
    ans += s . charAt ( i ) ;
  }
  return ans ;
}
