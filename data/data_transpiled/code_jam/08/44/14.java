static final String [ ] perm ( String [ ] a ) throws IOException {
  if ( a . length == 1 ) {
    StringBuilder sb = new StringBuilder ( ) ;
    return a ;
  }
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    for ( String x : perm ( a , 0 , i ) + a [ i ] . substring ( i + 1 ) ) {
      sb . append ( a [ i ] ) . append ( x ) ;
    }
  }
  /* calc the string to a list */
  StringBuilder sb = new StringBuilder ( ) ;
  sb . append ( sb . toString ( ) ) ;
  sb . append ( " " ) ;
  sb . append ( sb . toString ( ) ) ;
  sb . append ( " " ) ;
  sb . append ( sb . toString ( ) ) ;
  sb . append ( " " ) ;
  sb . append ( sb . toString ( ) ) ;
  sb . append ( " " ) ;
  sb . append ( sb . toString ( ) ) ;
  sb . append ( " " ) ;
  sb . append ( sb . toString ( ) ) ;
  sb . append ( " " ) ;
  sb . append ( sb . toString ( ) ) ;
  sb . append ( " " ) ;
  sb . append ( sb . toString ( ) ) ;
  sb . append ( " " ) ;
  sb . append ( sb . toString ( ) ) ;
  sb . append ( " " ) ;
  sb . append ( sb . toString ( ) ) ;
  sb . append ( " " ) ;
  sb . append ( sb . toString ( ) ) ;
  sb . append ( " " ) ;
  sb . append ( sb . toString ( ) ) ;
  sb . append ( " " ) ;
  sb . append ( sb . toString ( ) ) ;
  sb . append ( " " ) ;
  sb . append ( sb . toString ( ) ) ;
  sb . append ( " " ) ;
  sb . append ( sb . toString ( ) ) ;
  sb . append ( " " ) ;
  sb . append ( sb . toString ( ) ) ;
  sb . append ( " " ) ;
  sb . append ( sb . toString ( ) ) ;
  sb . append ( " " ) ;
  sb . append ( sb . toString ( ) ) ;
  sb . append ( " " ) ;
  sb . append ( sb . toString ( ) ) ;
  sb . append ( " " ) ;
  sb . append ( sb . toString ( ) )