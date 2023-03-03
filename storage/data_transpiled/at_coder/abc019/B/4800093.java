public static String input ( ) {
  int count = 1 ;
  StringBuilder res = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( i != s . length ( ) - 1 && s . charAt ( i ) == s . charAt ( i + 1 ) ) {
      count ++ ;
    }
    else {
      res . append ( s . charAt ( i ) ) ;
      count = 1 ;
    }
  }
  return res . toString ( ) ;
}
