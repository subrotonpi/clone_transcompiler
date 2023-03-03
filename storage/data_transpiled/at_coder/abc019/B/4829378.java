public static String input ( ) {
  s = input ( ) ;
  s += " " ;
  String t = "" ;
  int cnt = 1 ;
  for ( int i = 1 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( ( s . charAt ( i ) == s . charAt ( i - 1 ) ) ) {
      cnt ++ ;
    }
    else {
      t += s . charAt ( i - 1 ) + cnt ;
      cnt = 1 ;
    }
  }
  System . out . println ( t ) ;
  return t ;
}
