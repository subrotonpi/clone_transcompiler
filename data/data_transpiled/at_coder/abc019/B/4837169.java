public static String input ( ) {
  s = input ( ) ;
  s = s + "X" ;
  char temp = s . charAt ( 0 ) ;
  String [ ] a = new String [ s . length ( ) ] ;
  int cnt = 1 ;
  for ( int i = 1 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( temp != s . charAt ( i ) ) {
      a [ cnt ] = String . valueOf ( temp ) + String . valueOf ( cnt ) ;
      cnt = 1 ;
      temp = s . charAt ( i ) ;
    }
    else cnt ++ ;
  }
  System . out . println ( Arrays . toString ( a ) ) ;
  return a [ 0 ] ;
}
