static final String getFilePath ( ) {
  System . nanoTime ( ) ;
  /* Use the current time to avoid overflow */
  StringBuilder vs = new StringBuilder ( ) ;
  vs . append ( '+' ) ;
  for ( int i = v . length ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    char ch = v . charAt ( i ) ;
    if ( ch != vs . charAt ( vs . length ( ) - 1 ) ) {
      vs . append ( ch ) ;
    }
  }
  int ans = vs . length ( ) - 1 ;
  return vs . toString ( ) ;
}
