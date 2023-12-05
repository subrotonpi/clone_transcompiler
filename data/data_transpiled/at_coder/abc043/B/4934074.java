public static void input ( ) {
  String x = input ( ) ;
  StringBuilder s = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < x . length ( ) ;
  i ++ ) {
    if ( i == 'B' ) {
      if ( s . length ( ) == 0 ) {
        continue ;
      }
      -- s . length ( ) ;
    }
    else {
      s . append ( x ) ;
    }
  }
  System . out . println ( s . toString ( ) ) ;
}
