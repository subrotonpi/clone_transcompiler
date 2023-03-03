public static String x ( ) {
  String s = input ( ) ;
  String c = "" ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) != x ) {
      c += s . charAt ( i ) ;
    }
  }
  return c ;
}
