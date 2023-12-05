public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int cnt = 0 ;
  for ( int i = a ;
  i <= b ;
  i ++ ) {
    String s = String . valueOf ( i ) ;
    if ( s . charAt ( 0 ) == s . charAt ( 4 ) && s . charAt ( 1 ) == s . charAt ( 3 ) ) {
      cnt ++ ;
    }
  }
  System . out . println ( cnt ) ;
}
