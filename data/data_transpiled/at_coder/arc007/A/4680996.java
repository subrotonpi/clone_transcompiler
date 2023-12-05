public static void input ( ) {
  String x = input ( ) ;
  String s = input ( ) ;
  StringBuilder l = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) != x ) {
      l . append ( s . charAt ( i ) ) ;
    }
  }
  System . out . println ( l . toString ( ) ) ;
}
