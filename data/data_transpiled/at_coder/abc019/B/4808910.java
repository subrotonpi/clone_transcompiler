public static String input ( ) {
  StringBuffer t = new StringBuffer ( ) ;
  char cur = s . charAt ( 0 ) ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( cur == s . charAt ( i ) ) {
      cnt ++ ;
    }
    else {
      t . append ( cur ) ;
      cur = s . charAt ( i ) ;
      cnt = 1 ;
    }
  }
  t . append ( cur ) ;
  t . append ( cnt ) ;
  return t . toString ( ) ;
}
