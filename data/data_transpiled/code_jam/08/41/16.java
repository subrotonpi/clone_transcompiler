public static final String getString ( ) {
  final StringBuilder sb = new StringBuilder ( ) ;
  sb . append ( "\n" ) ;
  final String cachedIn = "" ;
  /* First line is "" */
  if ( cachedIn . length ( ) > 0 ) {
    String res = sb . toString ( ) ;
    cachedIn = "" ;
    return res ;
  }
  /* Second line is "" */
  while ( ! cachedIn . isEmpty ( ) ) {
    cachedIn = sb . toString ( ) ;
    sb . append ( cachedIn ) ;
    cachedIn . reverse ( ) ;
  }
  /* Second line is "" */
  while ( ! cachedIn . isEmpty ( ) ) {
    cachedIn = sb . toString ( ) ;
    sb . append ( "\n" ) ;
  }
  /* Second line is "" */
  while ( ! cachedIn . isEmpty ( ) ) {
    cachedIn = sb . toString ( ) ;
  }
  /* Third line is "" */
  for ( int num = 0 ;
  num < num ;
  num ++ ) {
    sb . append ( " " ) ;
  }
  /* Third line is "" */
  for ( int num = 0 ;
  num < num ;
  num ++ ) {
    sb . append ( " " ) ;
  }
  /* Third line is "" */
  for ( int num = 0 ;
  num < num ;
  num ++ ) {
    sb . append ( " " ) ;
  }
  /* Third line is "" */
  for ( int num = 0 ;
  num < num ;
  num ++ ) {
    sb . append ( " " ) ;
  }
  /* Third line is "" */
  for ( int num = 0 ;
  num < num ;
  num ++ ) {
    sb . append ( " " ) ;
  }
  /* Third line is "" */
  for ( int num = 0 ;
  num < num ;
  num ++ ) {
    sb . append ( " " ) ;
  }
}
