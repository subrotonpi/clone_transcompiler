public static String input ( ) {
  int cnt = 0 ;
  char current = s . charAt ( 0 ) ;
  String ans = "" ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( ( s . charAt ( i ) == current ) && ( cnt < 10 ) ) {
      cnt ++ ;
    }
    else {
      ans += current + cnt ;
      current = s . charAt ( i ) ;
    }
  }
  ans += current + cnt ;
  return ans ;
}
