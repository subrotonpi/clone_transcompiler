public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  StringBuilder s = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s . append ( input ) ;
    s . setLength ( 0 ) ;
    s . append ( input ) ;
    s . append ( " " ) ;
  }
  s . trimToSize ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s . append ( input ) ;
    System . out . println ( s . toString ( ) ) ;
  }
}
