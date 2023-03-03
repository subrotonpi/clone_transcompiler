public static String toString ( ) {
  String a = input . next ( ) ;
  String [ ] b = new String [ a . length ( ) ] ;
  for ( int i = 0 ;
  i < a . length ( ) ;
  i ++ ) {
    b [ i ] = String . valueOf ( i ) ;
  }
  int c = len ( new HashSet ( b ) ) ;
  return ( c == 1 ? "SAME" : "DIFFERENT" ) ;
}
