public static String print ( ) {
  String s = input . next ( ) ;
  String result = "" ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( ( i + 1 ) % 2 != 0 ) {
      result += s . charAt ( i ) ;
    }
  }
  return result ;
}
