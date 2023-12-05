public static String print ( String s ) {
  s = list ( input ) ;
  StringBuilder ans = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == '0' ) {
      ans . append ( '0' ) ;
    }
    else {
      continue ;
    }
  }
  return ans . toString ( ) ;
}
