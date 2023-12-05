public static String input ( ) {
  String s = input ( ) ;
  String c = "" ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( ( int ) s . charAt ( i ) <= 57 ) {
      c += s . charAt ( i ) ;
    }
  }
  return c ;
}
