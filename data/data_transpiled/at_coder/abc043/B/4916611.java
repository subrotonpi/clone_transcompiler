public static String print ( String S ) {
  StringBuilder ans = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( ( S . charAt ( i ) == '0' ) ) {
      ans . append ( '0' ) ;
    }
  }
  return ans . toString ( ) ;
}
