public static String input ( ) {
  String [ ] S = new String [ s . length ( ) ] ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    S [ i ] = s . charAt ( i ) ;
  }
  return "" . equals ( new HashSet ( S ) . size ( ) ) ? "yes" : "no" ;
}
