public static String input ( ) {
  String s = input ( ) ;
  String t = input ( ) ;
  int i = 0 ;
  int count = 0 ;
  while ( i < s . length ( ) ) {
    StringBuilder sb = new StringBuilder ( s ) ;
    char a = s . charAt ( 0 ) ;
    sb . append ( a ) ;
    s = sb . toString ( ) ;
    if ( s . equals ( t ) ) {
      count ++ ;
    }
    i ++ ;
  }
  if ( count >= 1 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return s ;
}
