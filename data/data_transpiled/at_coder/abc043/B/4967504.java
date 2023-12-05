public static String input ( ) {
  int n = s . length ( ) ;
  StringBuilder a = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i ) != 'B' ) a . append ( s ) ;
  }
  return a . toString ( ) ;
}
