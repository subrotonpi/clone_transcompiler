public static String print ( String c ) {
  StringBuilder ans = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < c . length ( ) ;
  i ++ ) {
    if ( c . charAt ( i ) == '0' ) {
      ans . append ( '0' ) ;
    }
    else {
      ans . append ( '1' ) ;
    }
  }
  return ans . toString ( ) ;
}
