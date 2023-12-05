public static String [ ] S ( ) {
  String [ ] ans = new String [ input . length ] ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    if ( S [ i ] . equals ( "Left" ) ) {
      ans [ i ] = '<' ;
    }
    else if ( S [ i ] . equals ( "Right" ) ) {
      ans [ i ] = '>' ;
    }
    else {
      ans [ i ] = 'A' ;
    }
  }
  return ans ;
}
