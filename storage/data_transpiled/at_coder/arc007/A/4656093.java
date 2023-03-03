public static String X = input ( ) {
  String [ ] s = new String [ input . length ] ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    if ( X == s [ i ] ) {
      continue ;
    }
    else {
      Res [ i ] = s [ i ] ;
    }
  }
  return "" + Res ;
}
